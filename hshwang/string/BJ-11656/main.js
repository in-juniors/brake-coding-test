/**
* 작성자: Hshwang
* 소요시간: 15분
* 원문 링크: https://www.acmicpc.net/problem/11656
*/


const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split('\n');
const language = inputs[0];
const result = [];

for(let i = 0; i < language.length; i++) {
  result.push(language.slice(i, language.length));
}

result.sort()

for(let element of result) {
    console.log(element);
}