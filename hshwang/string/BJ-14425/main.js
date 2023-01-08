/**
* 작성자: Hshwang
* 소요시간: 56분
* 원문 링크: https://www.acmicpc.net/problem/14425
*/

const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split('\n');
//m값을 실상 쓸일이 없어서 n만 꺼내서 썼습니다
const [n] = inputs.shift().split(" ").map(Number);
const stringInputs = inputs.map((i) => i.trim());
const compareInputs = stringInputs.slice(0, n);
const wonderString = stringInputs.slice(n);
//타임아웃 에러가 계속나서 Set자료구조를 썼습니다. 실상 이녀석 때문에 시간을 다잡아먹었군요.
const compareString = new Set(compareInputs);

const makeResult = (wonderString, compareString) => {
  let result = 0;
  wonderString.forEach((string) => {
    if (compareString.has(string)) 
      ++result;
  });
  return result;
};

console.log(makeResult(wonderString, compareString));