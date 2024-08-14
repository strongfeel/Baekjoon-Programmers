function solution(n) {
    var answer = [...String(n)].map(Number);
    answer.reverse();
    return answer;
}