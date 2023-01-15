/**
* 작성자: Hshwang
* 소요시간: 10분
* 원문 링크: https://www.acmicpc.net/problem/10773
*/


const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split('\n');
const [n] = inputs.shift().split(" ").map(Number);
let resultArr = [];

for(let i = 0; i < n; i++) {
  parseInt(inputs[i]) === 0
  ? resultArr.pop()
  : resultArr.push(parseInt(inputs[i]))
}

const initialValue = 0;
const result = resultArr.reduce(
  (accumulator, currentValue) => accumulator + currentValue,
  initialValue
);

console.log(result)