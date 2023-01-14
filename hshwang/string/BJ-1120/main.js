/**
* 작성자: Hshwang
* 소요시간: 12분
* 원문 링크: https://www.acmicpc.net/problem/1120
*/


const [firstString, secondString] = require("fs").readFileSync("/dev/stdin").toString().trim().split(" ");

const compareString = (firstString, secondString) => {
  let result = firstString.length;
  for (let i = 0; i <= secondString.length - firstString.length ; i++) {
    let saveMin = 0;
    for (let j = i; j < i + firstString.length; j++) {
      if (firstString[j - i] !== secondString[j]) 
        saveMin++;
    }
    if (saveMin < result) 
      result = saveMin;
  }
  return result;
}

console.log(compareString(firstString, secondString));