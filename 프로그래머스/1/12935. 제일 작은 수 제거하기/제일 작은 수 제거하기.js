function solution(arr) {
    var answer = [];
    
    const min = Math.min(...arr);
    
    if(arr.length === 1) {
        answer.push(-1);
    } else {
        answer = arr.filter((e) => e !== min);
    }
    
    return answer;
}