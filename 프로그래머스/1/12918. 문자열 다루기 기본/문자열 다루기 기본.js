function solution(s) {
    var answer = /^\d{6}$|^\d{4}$/;
    return answer.test(s);
}