function isPrime(num) {
  let flag = true;
  for (let i = 2; i*i <= num; i++) {
    if (num % i == 0) {
      flag = false;
      break;
    }
  }
  return flag;
}

function solution(nums) {
  let answer = 0;
  let num, size = nums.length;

  for(let i = 0; i < size; i++) {
    for (let j = i+1; j < size; j++) {
      for (let k = j+1; k < size; k++) {
        num = nums[i] + nums[j] + nums[k];
        if(isPrime(num)) answer++;
      }
    }
  }
  return answer;
}
