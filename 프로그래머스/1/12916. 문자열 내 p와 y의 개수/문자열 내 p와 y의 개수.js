function solution(s){
    let x = 0;
    let y = 0;
    
    let str = s.toLowerCase();
    let str2 = str.split("");
    
    for(let i = 0; i < str2.length; i++) {
        if (str[i] === "p") {
            x++;
        } else if (str[i] === "y") {
            y++;
        }
    }
    
    return (x === y) ? true : false;
}