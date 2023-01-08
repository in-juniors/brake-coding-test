/**
* 작성자: Hshwang
* 소요시간: 46분
* 원문 링크: https://www.acmicpc.net/problem/4153
*/

const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split('\n');
 
for(let line of inputs) {
  let triangle = line.split(' ').map(el => parseInt(el));
 
  if(triangle[0] === 0) 
    break;
  //빗변이 맨뒤로 가도록.
  triangle.sort((a, b) => {
    return a - b;
  });
  triangle[0]**2 + triangle[1]**2 === triangle[2]**2
  ? console.log("right")
  : console.log("wrong")
}
