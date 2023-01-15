/**
* 작성자: Hshwang
* 소요시간: 34분
* 원문 링크: https://www.acmicpc.net/problem/2846
*/

const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split('\n');
const ascentArr = inputs[1].split(" ").map(Number);
let saveAscent = [];
let saveMaxNum = 0;

const setMaxNum = (saveAscent) => {
  if(saveMaxNum < saveAscent[saveAscent.length - 1] - saveAscent[0]) {
    saveMaxNum = saveAscent[saveAscent.length - 1] - saveAscent[0];
  }
}

const finalMaxCheck = (arrayCount) => {
  if(arrayCount === ascentArr.length - 1 && saveAscent.length >= 2) {
    setMaxNum(saveAscent);
  } else if(ascentArr.length === 1 && saveAscent.length === 1) {
    saveMaxNum = saveAscent[0];
  }
} 

const ascentCheck = (saveAscent, ascentArr) => {
  for(let i = 0; i < ascentArr.length; i++) {
    if(saveAscent.length === 0) {
      saveAscent.push(ascentArr[i])
    }
    else if (saveAscent[saveAscent.length - 1] < ascentArr[i]) {
      saveAscent.push(ascentArr[i])
    }
    else if (saveAscent[saveAscent.length - 1] >= ascentArr[i]) {
      setMaxNum(saveAscent);
      saveAscent = [];
      saveAscent.push(ascentArr[i]);
    }
    finalMaxCheck(i)
  }
}

ascentCheck(saveAscent, ascentArr);

console.log(saveMaxNum);