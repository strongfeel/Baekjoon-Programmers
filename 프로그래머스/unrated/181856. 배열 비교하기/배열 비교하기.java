class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        
        if(arr1.length > arr2.length) answer = 1;
        if(arr1.length < arr2.length) answer = -1;
        if(arr1.length == arr2.length) {
            for(int i = 0; i < arr1.length; i++) {
                max1 += arr1[i];
                max2 += arr2[i];
            }
            if(max1 > max2) answer = 1;
            if(max1 < max2) answer = -1;
            if(max1 == max2) answer = 0;
        }
        return answer;
    }
}