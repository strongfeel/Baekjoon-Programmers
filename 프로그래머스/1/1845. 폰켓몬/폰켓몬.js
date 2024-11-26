function solution(nums) {
    var answer = 0;
    const count = nums.length / 2;
    
    const newSet = [...new Set(nums)];
    
    if(count < newSet.length){
        answer = count;
    } else {
        answer = newSet.length;
    }
    
    return answer;
}