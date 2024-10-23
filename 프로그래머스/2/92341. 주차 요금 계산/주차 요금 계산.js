function solution(fees, records) {
    var answer = [];
    
    const getNumberTime = (time) => {
        const arr = time.split(":");
        return Number.parseInt(arr[0]) * 60 + Number.parseInt(arr[1]);
    }
    
    const getParkTime = (start, end) => {
        return getNumberTime(end) - getNumberTime(start);
    }
    
    const getTotalFee = (time) => {
    
        let cost = fees[1];
        time -= fees[0];
        
        if(time > 0) {
            cost += Math.ceil(time/fees[2]) * fees[3];
        }
        
        return cost;
    }

    const park = records.map((item) => item.split(" ")).sort((a, b) => a[1] === b[1] ? a[0] - b[0] : a[1] - b[1]);

    let time = 0;
    for(let i=park.length-1; i>=0;i--) {
        
        if(park[i][2] === 'IN') {
            time += getParkTime(park[i][0], "23:59");
        } else {
            time += getParkTime(park[i-1][0], park[i][0]);
            i--;
        }
        
        if(i === 0 || (park[i][1] !== park[i-1][1])) {
            answer.unshift(getTotalFee(time));
            time = 0;
        }
    }
    return answer;
}