function solution(phone_number) {
    var answer = '';
    let str = phone_number.split("");
    
    for(let i = 0; i < str.length - 4; i++) {
        str[i] = "*";
    }
    
    answer = str.join("")
    return answer;
}