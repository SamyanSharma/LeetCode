/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    let result = arr;
    let depth = n;
    while(depth > 0 && result.some(Array.isArray)){
        result = [].concat(...result);
        depth--;
    }
    return result;
};