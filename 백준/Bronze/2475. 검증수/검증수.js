const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(" ").map(Number);

let serial = 0;

for(let i = 0; i < input.length; i++) {
    serial +=(input[i] * input[i]);
}

console.log(serial%10)