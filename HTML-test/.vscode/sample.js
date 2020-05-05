//Create a function onlyPositives(listOfIntegers) that filters the given list and return only the positive items in the array.

function onlyPositives(listOfIntegers = [])
{
    var result = listOfIntegers.filter(value => (value > 0));
    return result;
}


var testData = [1,2,3,9];
console.log(onlyPositives(testData));


