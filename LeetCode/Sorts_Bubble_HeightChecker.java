// https://leetcode.com/problems/height-checker/
// Solution
class Solution {
    private void bubbleSort(int[] arr){
        int n = arr.length;
        // Outer loop, i reps how many elements are sorted from end
        for(int i = 0; i < n - 1; ++i){
            for(int j = 0; j < n - i - 1; ++j){
                // Compare and swap, if necessary
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];
        
        for(int i = 0; i< n; i++){
            expected[i] = heights[i];
        }
        //Arrays.sort(expected);
        bubbleSort(expected);
        
        int output = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] != expected[i]){
                output++;
            }
        }
        return output;
    }
}
