function solution(n) {
    var answer = 0;
    let result = n.toString(3).split('').reverse().join('');
    answer = parseInt(result, 3);
    return answer;
}