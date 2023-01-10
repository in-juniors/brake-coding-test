/**
* 작성자: Hshwang
* 소요시간: 25분
* 원문 링크: https://www.acmicpc.net/problem/10872
*/


const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString();

const factorial = (number) => 
  number <= 1 
    ? 1 
    : number * factorial(number - 1);

console.log(factorial(inputs));