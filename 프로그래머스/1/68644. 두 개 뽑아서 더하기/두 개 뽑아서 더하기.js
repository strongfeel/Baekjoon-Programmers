function solution(numbers) {
    var answer = [];
    let temp = [];
    
    for(let i = 0; i < numbers.length - 1; i++) {
        for(let j = i + 1; j < numbers.length; j++) {
            temp.push(numbers[i] + numbers[j]);
        }
    }
    
    answer = [...new Set(temp)];
    return answer.sort((a, b) => a - b);
}