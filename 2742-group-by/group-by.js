/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    const result = {}
    this.forEach(element=>{
        const key = fn(element)
        result[key] ||=[]
        result[key].push(element)
    })
    return result
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */