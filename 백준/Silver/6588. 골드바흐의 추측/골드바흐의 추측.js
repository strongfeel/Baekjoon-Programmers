const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : __dirname+"/input.txt")
  .toString()
  .trim()
  .split('\n')
  .map(Number)
const size = input.pop();
const numbers = Array(1000000).fill(true); 
const sosu = [];
numbers[0] = false
numbers[1] = false

for(let j=2; j<=Math.sqrt(1000000); j++){
  if(!numbers[j]) continue;

  sosu.push(j)
  for(let k = j * 2; k <= 1000000; k += j){
    numbers[k] = false;
  }
}

const results = input.map(num => {
  const low = sosu.find(su => numbers[num - su])
  if(low){
    let high = num - low

    return `${num} = ${low} + ${high}`;
  }
  return `Goldbach's conjecture is wrong.`
})

console.log(results.join('\n'))