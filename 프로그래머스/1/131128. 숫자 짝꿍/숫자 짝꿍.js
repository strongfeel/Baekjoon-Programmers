function solution(X, Y) {
    let answer = "";
  const xHash = new Map();
  const yHash = new Map();

  X.split("")
      .forEach(i=> xHash.set(i, xHash.has(i) ?  xHash.get(i)  +1 : 1));
  Y.split("")
      .forEach(i=> yHash.set(i, yHash.has(i) ? yHash.get(i) +1 : 1));


    for(let i = 9; i >= 0; i --){
        const index = i.toString();
        if(!xHash.has(index)) continue;
        if(!yHash.has(index)) continue;

        const num = Math.min(xHash.get(index), yHash.get(index))
        answer += index.repeat(num)
    }
    if(answer.length === 0) return "-1"
    if(answer[0] === "0" ) return "0";
    return answer;
}