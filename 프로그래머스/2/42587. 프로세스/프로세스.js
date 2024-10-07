function solution(priorities, location) {
    var answer = 0;
    let maxPriority = Math.max(...priorities);
    
    while(true) {
        const currentProcess = priorities.shift();
        
        if(currentProcess === maxPriority) {
            answer++;
            if(location === 0) return answer;
            maxPriority = Math.max(...priorities);
        } else {
            priorities.push(currentProcess);
        }
        
        location = location === 0 ? priorities.length - 1: location - 1;
    }
    return answer;
}