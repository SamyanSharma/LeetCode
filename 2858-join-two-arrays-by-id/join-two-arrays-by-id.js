/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    const joinedArr = [...arr1, ...arr2];
    const merged = {};

    joinedArr.forEach((obj)=>{
        const id = obj.id;
        if(!merged[id]){
            merged[id] = {...obj};
        }else{
            merged[id] = {...merged[id], ...obj};
        }
    });
    return Object.values(merged);
};