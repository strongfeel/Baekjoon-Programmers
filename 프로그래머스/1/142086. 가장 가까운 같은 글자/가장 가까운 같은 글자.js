function solution(s) {
    const hash={};

    return [...s].map((i,j)=>{
        let answer = hash[i] !== undefined ? j - hash[i] : -1;
        hash[i] = j;
        return answer;
    });
}