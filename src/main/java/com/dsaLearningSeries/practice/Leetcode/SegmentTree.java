package com.dsaLearningSeries.practice.Leetcode;

class SegmentTree {
    int n;
    int[] maxValues, minValues;

    SegmentTree(int n) {
        this.n = n;
        maxValues = new int[4 * n];
        minValues = new int[4 * n];
    }

    void insert(int idx, int val) {
        insert(1, 0, n - 1, idx, val);
    }

    void insert(int node, int lo, int hi, int idx, int val) {
        if (lo == hi) {
            maxValues[node] = val;
            minValues[node] = val;
            return;
        }

        int mid = lo + (hi - lo) / 2;

        if (idx <= mid) {
            insert(2 * node, lo, mid, idx, val);
        } else {
            insert(2 * node + 1, mid + 1, hi, idx, val);
        }

        maxValues[node] =
                Math.max(maxValues[2 * node], maxValues[2 * node + 1]);

        minValues[node] =
                Math.min(minValues[2 * node], minValues[2 * node + 1]);
    }

    // Returns [min, max] in range [l, r].
    int[] query(int l, int r) {
        return query(1, 0, n - 1, l, r);
    }

    int[] query(int node, int lo, int hi, int l, int r) {
        // No overlap.
        if (r < lo || l > hi)
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};

        // Complete overlap.
        if (l <= lo && hi <= r)
            return new int[]{minValues[node], maxValues[node]};

        int mid = lo + (hi - lo) / 2;

        int[] left = query(2 * node, lo, mid, l, r);
        int[] right = query(2 * node + 1, mid + 1, hi, l, r);

        return new int[]{
                Math.min(left[0], right[0]),
                Math.max(left[1], right[1])
        };
    }
}