function solution(s) {
    var answer = 0;
    let current;
    let count = 0;

    for(let i = 0; i < s.length; i++) {
        if(count === 0) {
            answer++;
            current = s[i]
            count = 1
        } else {
            if(current !== s[i]) count--;
            else count++;
        }
    }
    return answer;
}