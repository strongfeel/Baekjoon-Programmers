function solution(absolutes, signs) {
    var answer = 123456789;
    let x = 0;
    
    for (let i = 0; i < absolutes.length; i++) {
        if(signs[i] === true) {
            x = x + absolutes[i];
        } else if (signs[i] === false){
            x = x + (absolutes[i] * -1);
        }
    }
    
    return x;
}