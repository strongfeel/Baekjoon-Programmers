function solution(k, score) {
    var answer = [];
    let temp = [];
    
    for(let i = 0; i < score.length; i++) {
        temp.push(score[i]);
        temp.sort((a,b) => b-a)

        if(temp.length < k) {
            answer.push(temp[temp.length-1])
        } else {
            answer.push(temp[k-1])
        }
    }
    return answer;
}