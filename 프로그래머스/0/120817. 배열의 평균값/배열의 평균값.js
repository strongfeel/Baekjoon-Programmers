function solution(numbers) {
    var answer = 0;
    let num = 0;
    for(let i = 0; i < numbers.length; i++) {
        num += numbers[i];
    }
    answer = num / numbers.length;
    return answer;
}