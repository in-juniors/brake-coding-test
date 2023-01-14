/**
* 작성자: Hshwang
* 소요시간: 12분
* 원문 링크: https://www.acmicpc.net/problem/10870
*/

const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().trim().split("\n");;

const fibonacci = (number, startNum, endNum) => {
  let saveEndNum = endNum;
  endNum += startNum;
  startNum = saveEndNum;
  if(number === 0) {
    return 0;
  }
  return number === 1
    ? startNum
    : fibonacci(number - 1, startNum, endNum);
}
console.log(fibonacci(parseInt(inputs[0]), 0, 1));