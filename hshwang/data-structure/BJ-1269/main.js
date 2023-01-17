/**
* 작성자: Hshwang
* 소요시간: 42분
* 원문 링크: https://www.acmicpc.net/problem/1269
*/


const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : '예제.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');
const [n, m] = [+input[0].split(' ')[0], +input[0].split(' ')[1]];
const firstArr = input[1].split(' ').map((i) => +i);
const secondArr = input[2].split(' ').map((i) => +i);
//얕은 복사를 활용해서 배열을 합쳐줍니다. 이때 중복값은 알아서 넘겨주게 됩니다.
const concatSet = new Set([...firstArr, ...secondArr]);
console.log(2 * concatSet.size - secondArr.length - firstArr.length );

/*
기존에 풀었던 방식입니다. 메모리를 너무 많이먹어서 이건 도저히 아닌것 같더라구요.(자그마치 111144KB를 잡아먹었네요ㅠ)
const firstSet = new Set(input[1].split(' ').map((i) => +i));
const secondSet = new Set(input[2].split(' ').map((i) => +i)
const firstSaveSet = new Set(input[1].split(' ').map((i) => +i));
const secondSaveSet = new Set(input[2].split(' ').map((i) => +i));


secondSet.forEach((value) =>  {
  if(firstSet.has(value)) {
    firstSet.delete(value);
  }
});

firstSaveSet.forEach((value) =>  {
  if(secondSaveSet.has(value)) {
    secondSaveSet.delete(value);
  }
});

console.log(firstSet.size + secondSaveSet.size);
*/
