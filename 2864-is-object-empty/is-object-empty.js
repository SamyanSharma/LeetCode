/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    let len = Object.keys(obj).length;
    if(len==0) return true; return false;
};