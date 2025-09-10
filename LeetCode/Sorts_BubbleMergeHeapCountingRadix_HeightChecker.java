// https://leetcode.com/problems/height-checker/
// Solution

class Solution {

    private void


    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];
        
        for(int i = 0; i< n; i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        
        int output = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] != expected[i]){
                output++;
            }
        }
        return output;
    }
}

// Prompt
/*
Overview
In this problem, we are required to find the number of elements that are different than the respective index if the array is sorted. We must sort the given array and compare the sorted and unsorted arrays.

Key Observation: The purpose of this problem is to evaluate the interviewee's understanding of sorting algorithms and their ability to implement these algorithms without relying on built-in sort methods.

There are a variety of sorting algorithms such as Bubble Sort, Insertion Sort, Selection Sort, Merge Sort, Heap Sort, Quick Sort, Counting Sort, Radix Sort, and others.

We attached a list of time complexities of some popular sorting algorithms. Here, n is the number of elements in the array, k is the size of buckets used, and d is the number of digits in the maximum element in the array.

In this article, we will concentrate on five algorithms that are deemed efficient and reasonable to implement during a real interview setting for this particular problem - Bubble Sort, Merge Sort, Heap Sort, Counting Sort, and Radix Sort. We will give brief descriptions of these algorithms but won't cover them in great detail.
For those who would like to explore these and other sorting algorithms in greater detail, we are providing a link to our Sorting Leetbook.

Note: We highly recommend implementing the other sorting algorithms on your own, too, for more practice.
*/
