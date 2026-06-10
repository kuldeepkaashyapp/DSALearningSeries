package com.dsaLearningSeries.practice.Leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class maxTotal3691 {

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        // Segment tree supports O(log n) min/max range queries.
        SegmentTree st = new SegmentTree(n);
        for (int i = 0; i < n; i++)
            st.insert(i, nums[i]);

        // [rangeValue, left, right]
        // rangeValue = max(nums[l..r]) - min(nums[l..r])
        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));

        int[] ansVal = st.query(0, n - 1);
        pq.offer(new long[]{ansVal[1] - ansVal[0], 0, n - 1});

        // Avoid processing the same subarray more than once.
        Set<String> visited = new HashSet<>();
        visited.add(0 + "#" + (n - 1));

        long ans = 0;

        while (k > 0 && !pq.isEmpty()) {
            long[] curr = pq.poll();

            ans += curr[0];
            k--;

            int l = (int) curr[1];
            int r = (int) curr[2];

            // Generate the two neighboring subarrays:
            // [l + 1, r] and [l, r - 1]
            if (l + 1 <= r && !visited.contains((l + 1) + "#" + r)) {
                int[] val = st.query(l + 1, r);

                visited.add((l + 1) + "#" + r);
                pq.offer(new long[]{val[1] - val[0], l + 1, r});
            }

            if (l <= r - 1 && !visited.contains(l + "#" + (r - 1))) {
                int[] val = st.query(l, r - 1);

                visited.add(l + "#" + (r - 1));
                pq.offer(new long[]{val[1] - val[0], l, r - 1});
            }
        }

        return ans;
    }
}
