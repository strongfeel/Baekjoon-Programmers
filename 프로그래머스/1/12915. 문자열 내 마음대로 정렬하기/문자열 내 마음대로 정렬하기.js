function solution(strings, n) {
    strings.sort(function(a,b){
        if(a[n] > b[n]) return 1;
        if(b[n] > a[n]) return -1;

        if(a > b) return 1;
        if(b > a) return -1;

        return 0;
    });
    return strings;
}