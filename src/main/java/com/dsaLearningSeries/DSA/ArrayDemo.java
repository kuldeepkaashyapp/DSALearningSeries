package com.dsaLearningSeries.DSA;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {


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

    int[] concatenation(int nums[]){


        int length=nums.length;

        int[] ans=new int[2*length];
        for (int i = 0; i<length; i++){
            ans[i]=nums[i];
            ans[length+i]=nums[i];
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


    public int[] shuffle(int arr[], int n) {

        // taking as base for encoding
        int base = 1000;

        // encoding here
        for(int i = 0; i < n; i++) {

            arr[i] = arr[i] + ((arr[i] % base) * base);

            arr[i + 1] = arr[i + n] + ((arr[i + n] % base) * base);
        }

        // decoding
        for(int i = 0; i < 2 * n; i++) {

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
        int [] bucket=new int[102];


        // Get Frequecy of each number

       for(int num:nums){
           bucket[num]++;
       }

       //count smaller number than each element
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] += bucket[i-1];

        }

        //populating the result
        int[]  result= new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            if(nums[i] == 0)
                result[i] = 0;
            else
                result[i] = bucket[nums[i]-1];
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

   int maxNumber=nums.length;
   int count=0;
   List<Integer> result=new ArrayList<Integer>();


   
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

        for(int asteroid:asteroids){

            if(asteroid < currentMass){
                currentMass += asteroid;
            }else if(asteroid > currentMass){
                return false;
            }
        }
        return true;
    }








}
