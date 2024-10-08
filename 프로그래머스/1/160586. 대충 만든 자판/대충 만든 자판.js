function solution(keymap, targets) {
    var answer = [];
    let map = new Map();
    
    for(let key of keymap) {
        for(let i = 0; i < key.length; i++) {
            if(!map.has(key[i]) || i+1 < map.get(key[i])) map.set(key[i], i+1); 
        }
    }
    
    for (let target of targets) {
    let count = 0;
    for (let i = 0; i < target.length; i++) {
            count += map.get(target[i]);
        }
    answer.push(count || -1);
    }
    return answer;
}