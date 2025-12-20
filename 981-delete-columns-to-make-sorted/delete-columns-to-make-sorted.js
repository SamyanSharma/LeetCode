/**
 * @param {string[]} strs
 * @return {number}
 */

var isUnsorted = function(strs, j) {
    for(var i=1; i<strs.length; i++){
        if(strs[i][j]<strs[i-1][j]) return true;
    }
    return false;
};

var minDeletionSize = function(strs) {
    let result = 0;
    for(var i=0; i<strs[0].length; i++){
        result += isUnsorted(strs, i);
    }
    return result;
};