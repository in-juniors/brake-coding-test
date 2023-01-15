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
  //끝값에서 첫값을 뺀후 저장한 최대값과 비교.
  if(saveMaxNum < saveAscent[saveAscent.length - 1] - saveAscent[0]) {
    saveMaxNum = saveAscent[saveAscent.length - 1] - saveAscent[0];
  }
}

const finalMaxCheck = (arrayCount) => {
  //ascentArr의 마지막에 도달했으나 배열이 있는상태라면?
  if(arrayCount === ascentArr.length - 1 && saveAscent.length >= 2) {
    setMaxNum(saveAscent);
  } 
  //ascentArr 배열이 알고보니 길이가 1인 배열이였다면?
  else if(ascentArr.length === 1 && saveAscent.length === 1) {
    saveMaxNum = saveAscent[0];
  }
} 

const ascentCheck = (saveAscent, ascentArr) => {
  for(let i = 0; i < ascentArr.length; i++) {
    //배열의 맨처음이라면
    if(saveAscent.length === 0) {
      saveAscent.push(ascentArr[i])
    }
    //이후 저장해둔 saveAscent의 끝값보다 ascentArr값이 크다면?
    else if (saveAscent[saveAscent.length - 1] < ascentArr[i]) {
      saveAscent.push(ascentArr[i])
    }
    //그게아니라 저장해둔 saveAscent의끝값이 크다면?
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