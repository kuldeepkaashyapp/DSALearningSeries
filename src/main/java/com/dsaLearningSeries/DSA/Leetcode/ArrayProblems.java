package com.dsaLearningSeries.DSA.Leetcode;

import java.util.*;

public class ArrayProblems {


    //Problem 1 : concatation of numbers in the array

    /*Approch 1: number vali array ko as a array treat krke usko array me change krke easyaliy repat kr skte hai aur

     *easyly usko reapt kr skte hai vapis se array me change kr skte hai

     */

    /*
    *
    * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.



Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]


Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
*
* /


*
*
*
     */

    int[] concatenation(int[] nums) {


        int length = nums.length;

        int[] ans = new int[2 * length];
        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[length + i] = nums[i];
        }

        return ans;
    }

/*
    Question:2

    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

    Return the array in the form [x1,y1,x2,y2,...,xn,yn].



    Example 1:

    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
    Example 2:

    Input: nums = [1,2,3,4,4,3,2,1], n = 4
    Output: [1,4,2,3,3,2,4,1]
    Example 3:

    Input: nums = [1,1,2,2], n = 2
    Output: [1,2,1,2]


    Constraints:

            1 <= n <= 500
    nums.length == 2n
1 <= nums[i] <= 10^3
    */


    public int[] shuffle(int[] arr, int n) {

        // taking as base for encoding
        int base = 1000;

        // encoding here
        for (int i = 0; i < n; i++) {

            arr[i] = arr[i] + ((arr[i] % base) * base);

            arr[i + 1] = arr[i + n] + ((arr[i + n] % base) * base);
        }

        // decoding
        for (int i = 0; i < 2 * n; i++) {

            arr[i] = arr[i] / base;
        }

        return arr;
    }




   /* How Many Numbers Are Smaller Than the Current Number
            Easy
    Topics
    premium lock icon
            Companies
    Hint
    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

    Return the answer in an array.



    Example 1:

    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
    Explanation:
    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
    For nums[1]=1 does not exist any smaller number than it.
    For nums[2]=2 there exist one smaller number than it (1).
    For nums[3]=2 there exist one smaller number than it (1).
    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
    Example 2:

    Input: nums = [6,5,4,8]
    Output: [2,1,0,3]
    Example 3:

    Input: nums = [7,7,7,7]
    Output: [0,0,0,0]


    Constraints:

            2 <= nums.length <= 500
            0 <= nums[i] <= 100*/


    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[102];


        // Get Frequecy of each number

        for (int num : nums) {
            bucket[num]++;
        }

        //count smaller number than each element
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] += bucket[i - 1];

        }

        //populating the result
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0)
                result[i] = 0;
            else
                result[i] = bucket[nums[i] - 1];
        }
        return result;
    }

    /*
    Find All Numbers Disappeared in an Array


    Given an array nums of n integers where nums[i] is in the range [1, n],
    return an array of all the integers in the range [1, n] that do not appear in nums.



     Example 1:

     Input: nums = [4,3,2,7,8,2,3,1]
     Output: [5,6]
     Example 2:

     Input: nums = [1,1]
     Output: [2]


     Constraints:

     n == nums.length
 1 <= n <= 105
             1 <= nums[i] <= n


     Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra spac
 */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int maxNumber = nums.length;
        int count = 0;
        List<Integer> result = new ArrayList<Integer>();


        return result;


    }

/*

   2126. Destroying Asteroids
    Medium
            Topics
    premium lock icon
            Companies
    Hint
    You are given an integer mass, which represents the original mass of a planet. You are further given an integer array asteroids, where asteroids[i] is the mass of the ith asteroid.

    You can arrange for the planet to collide with the asteroids in any arbitrary order. If the mass of the planet is greater than or equal to the mass of the asteroid, the asteroid is destroyed and the planet gains the mass of the asteroid. Otherwise, the planet is destroyed.

    Return true if all asteroids can be destroyed. Otherwise, return false.



    Example 1:

    Input: mass = 10, asteroids = [3,9,19,5,21]
    Output: true
    Explanation: One way to order the asteroids is [9,19,5,3,21]:
            - The planet collides with the asteroid with a mass of 9. New planet mass: 10 + 9 = 19
            - The planet collides with the asteroid with a mass of 19. New planet mass: 19 + 19 = 38
            - The planet collides with the asteroid with a mass of 5. New planet mass: 38 + 5 = 43
            - The planet collides with the asteroid with a mass of 3. New planet mass: 43 + 3 = 46
            - The planet collides with the asteroid with a mass of 21. New planet mass: 46 + 21 = 67
    All asteroids are destroyed.
    Example 2:

    Input: mass = 5, asteroids = [4,9,23,4]
    Output: false
    Explanation:
    The planet cannot ever gain enough mass to destroy the asteroid with a mass of 23.
    After the planet destroys the other asteroids, it will have a mass of 5 + 4 + 9 + 4 = 22.
    This is less than 23, so a collision would not destroy the last asteroid.


            Constraints:

            1 <= mass <= 105
            1 <= asteroids.length <= 105
            1 <= asteroids[i] <= 105

    Seen this question in a real interview before?
            1/6




*/

    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long currentMass = mass;
        Arrays.sort(asteroids);

        for (int asteroid : asteroids) {

            if (asteroid < currentMass) {
                currentMass += asteroid;
            } else if (asteroid > currentMass) {
                return false;
            }
        }
        return true;
    }

/*

2144. Minimum Cost of Buying Candies With Discount
            Easy
    Topics
    premium lock icon
            Companies
    Hint

    A shop is selling candies at a discount. For every two candies sold, the shop gives a third candy for free.

    The customer can choose any candy to take away for free as long as the cost of the chosen candy is less than or equal to the minimum cost of the two candies bought.

    For example, if there are 4 candies with costs 1, 2, 3, and 4, and the customer buys candies with costs 2 and 3, they can take the candy with cost 1 for free, but not the candy with cost 4.
    Given a 0-indexed integer array cost, where cost[i] denotes the cost of the ith candy, return the minimum cost of buying all the candies.



    Example 1:

    Input: cost = [1,2,3]
    Output: 5
    Explanation: We buy the candies with costs 2 and 3, and take the candy with cost 1 for free.
    The total cost of buying all candies is 2 + 3 = 5. This is the only way we can buy the candies.
    Note that we cannot buy candies with costs 1 and 3, and then take the candy with cost 2 for free.
    The cost of the free candy has to be less than or equal to the minimum cost of the purchased candies.
            Example 2:

    Input: cost = [6,5,7,9,2,2]
    Output: 23
    Explanation: The way in which we can get the minimum cost is described below:
            - Buy candies with costs 9 and 7
            - Take the candy with cost 6 for free
- We buy candies with costs 5 and 2
            - Take the last remaining candy with cost 2 for free
    Hence, the minimum cost to buy all candies is 9 + 7 + 5 + 2 = 23.
    Example 3:

    Input: cost = [5,5]
    Output: 10
    Explanation: Since there are only 2 candies, we buy both of them. There is not a third candy we can take for free.
            Hence, the minimum cost to buy all candies is 5 + 5 = 10.


    Constraints:

            1 <= cost.length <= 100
            1 <= cost[i] <= 100





*/

    int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;//  assuming it maximum value;
//finding max elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }


    public int minimumCost(int[] cost) {
        // applying countingsort techinque to sort the array
        int[] freq = new int[maxElement(cost) + 1];

        for (int i = 0; i < cost.length; i++) {
            freq[cost[i]]++;
        }
        System.out.println("-".repeat(20));
        System.out.println(Arrays.toString(freq));
        System.out.println("-".repeat(20));
        int total = 0, freeSlot = 0;
        //let price is max 100  of the  candy and

        for (int price = maxElement(cost); price > 0; price--) {
            System.out.println("=".repeat(20));
            System.out.println(freq[price]);

            while (freq[price]-- > 0) {
                if (freeSlot % 3 != 2) total += price;
                freeSlot++;
            }
        }
        return total;
    }


/*

    3633. Earliest Finish Time for Land and Water Rides I
            Easy
    Topics
    premium lock icon
            Companies
    Hint
    You are given two categories of theme park attractions: land rides and water rides.

            Land rides
    landStartTime[i] – the earliest time the ith land ride can be boarded.
    landDuration[i] – how long the ith land ride lasts.
    Water rides
    waterStartTime[j] – the earliest time the jth water ride can be boarded.
    waterDuration[j] – how long the jth water ride lasts.
    A tourist must experience exactly one ride from each category, in either order.

    A ride may be started at its opening time or any later moment.
    If a ride is started at time t, it finishes at time t + duration.
    Immediately after finishing one ride the tourist may board the other (if it is already open) or wait until it opens.
    Return the earliest possible time at which the tourist can finish both rides.



            Example 1:

    Input: landStartTime = [2,8], landDuration = [4,1], waterStartTime = [6], waterDuration = [3]

    Output: 9

    Explanation:​​​​​​​

    Plan A (land ride 0 → water ride 0):
    Start land ride 0 at time landStartTime[0] = 2. Finish at 2 + landDuration[0] = 6.
    Water ride 0 opens at time waterStartTime[0] = 6. Start immediately at 6, finish at 6 + waterDuration[0] = 9.
    Plan B (water ride 0 → land ride 1):
    Start water ride 0 at time waterStartTime[0] = 6. Finish at 6 + waterDuration[0] = 9.
    Land ride 1 opens at landStartTime[1] = 8. Start at time 9, finish at 9 + landDuration[1] = 10.
    Plan C (land ride 1 → water ride 0):
    Start land ride 1 at time landStartTime[1] = 8. Finish at 8 + landDuration[1] = 9.
    Water ride 0 opened at waterStartTime[0] = 6. Start at time 9, finish at 9 + waterDuration[0] = 12.
    Plan D (water ride 0 → land ride 0):
    Start water ride 0 at time waterStartTime[0] = 6. Finish at 6 + waterDuration[0] = 9.
    Land ride 0 opened at landStartTime[0] = 2. Start at time 9, finish at 9 + landDuration[0] = 13.
    Plan A gives the earliest finish time of 9.

    Example 2:

    Input: landStartTime = [5], landDuration = [3], waterStartTime = [1], waterDuration = [10]

    Output: 14

    Explanation:​​​​​​​

    Plan A (water ride 0 → land ride 0):
    Start water ride 0 at time waterStartTime[0] = 1. Finish at 1 + waterDuration[0] = 11.
    Land ride 0 opened at landStartTime[0] = 5. Start immediately at 11 and finish at 11 + landDuration[0] = 14.
    Plan B (land ride 0 → water ride 0):
    Start land ride 0 at time landStartTime[0] = 5. Finish at 5 + landDuration[0] = 8.
    Water ride 0 opened at waterStartTime[0] = 1. Start immediately at 8 and finish at 8 + waterDuration[0] = 18.
    Plan A provides the earliest finish time of 14.

*/
// Defining  bing Value as the intial intialiser
static final int INFINITY = Integer.MAX_VALUE;
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        // Defini all the variable

        int landLength = landStartTime.length;
        int waterLength = waterStartTime.length;

        int landFinishTime = INFINITY;
        int waterFinishTime = INFINITY;
        int land_waterTime = INFINITY;
        int water_landTime = INFINITY;

        // now checking least time for the landRide
        //stating from waterRide
        for(int i =0; i < landLength; i++){
            landFinishTime = Math.min(landFinishTime, landStartTime[i] + landDuration[i]);

        }


        // checnking  Land Ride VS water Rides

        for(int i = 0 ; i<waterLength ; i++){

            waterFinishTime=Math.min(waterFinishTime,waterStartTime[i]+waterDuration[i]);



        }
// first we take the landRide then water water ride

        for(int i=0 ; i< waterLength; i++){
            land_waterTime=Math.min(land_waterTime,
                    Math.max(waterStartTime[i],landFinishTime)
                            +waterDuration[i]);
        }

        // checking water rides vs land rides;

        // till now we have time of landVSWater, waterFinish time  and LandFinish time


        for(int i=0 ; i < landLength ; i++){
            water_landTime=Math.min(water_landTime,Math.max(landStartTime[i],waterFinishTime)+landDuration[i]);

        }
        // now return least total time for  duration of time to complete
        return Math.min(water_landTime,land_waterTime);


    }

}
