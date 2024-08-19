function solution(x) {
    var answer = true;
    
    var str = x.toString();
    var sum = parseInt(str[0]);
    
    for(let i=1 ; i< str.length ;i++){
      sum += parseInt(str[i]);
    }

    result = x % sum ? false : true
    return result;
}