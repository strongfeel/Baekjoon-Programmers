function solution(numbers) {
  let answer = Array(numbers.length).fill(-1);
  
  for (let i = numbers.length - 2; i >= 0; i--) {
    for (let j = i + 1; j < numbers.length; j++) {
 
        if (numbers[i] < numbers[j]) {
            answer[i] = numbers[j];
            break;
        }
        
        if (answer[j] === -1) break;
        
        if (numbers[i] < answer[j]) {
            answer[i] = answer[j];
            break;
        }
    }
  }
  return answer;
}