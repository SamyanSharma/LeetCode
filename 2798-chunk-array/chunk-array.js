/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let arr1 = arr;
    let chunkArr = [];
    let result = [];
    while(arr1.length!=0){
        chunkArr = arr1.splice(0, size);
        result.push(chunkArr);
    }
    return result;
};
