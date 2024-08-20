function solution(arr) {
    var answer = 0;
    let num = 0;
    for(let i = 0; i < arr.length; i++) {
        num += arr[i]
    }
    answer = num / arr.length;
    return answer;
}