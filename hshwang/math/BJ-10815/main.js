/**
* 작성자: Hshwang
* 소요시간: 20분
* 원문 링크: https://www.acmicpc.net/problem/10815
*/


const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split('\n');
inputs.shift();
const getCardInputs = inputs.shift().split(" ").map((i) => parseInt(i))
const getCardArr = new Set(getCardInputs);
inputs.shift();
const compareCardArr = inputs.shift().split(" ").map((i) => parseInt(i));

const arrCompare = (getCardArr, compareCardArr) => {
  const resultArr = [];
  compareCardArr.forEach(compareCard => 
    getCardArr.has(compareCard) 
    ? resultArr.push(1)
    : resultArr.push(0)
  );
  return resultArr;
};


const result = arrCompare(getCardArr, compareCardArr).join(" ");
console.log(result);
