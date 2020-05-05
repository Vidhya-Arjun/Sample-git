

/*function logAll(value)
{
return console.log(value);
}

function squareList(listOfIntegers = [])
{
    var result = listOfIntegers.map(value => value * value);
    return result;
}



function onlyPositives(listOfIntegers = [])
{
    var result = listOfIntegers.filter(value => (value >0));
    return result;
}


//Create a function firstNegative(listOfIntegers) that returns the first negative number in the list or null if the list has no negative numbers.

function firstNegative(listOfIntegers = [])
{
    var result = listOfIntegers.find(value => (value <0));
    if(result)
    return result;
    else
    return null;
}

logAll([1]);                    // Should log 1

squareList([1,2]);              // Should return [1, 4]

onlyPositives([-1, 1]);         // Should return [1]

firstNegative([-1, -2, 1, 2]);  // Should return 1

firstNegative([1,2,3]);         // Should return null 

isPalindrome(word)
function isPalindrome(word) 
{
    var revword  = word.toLowerCase().split("").reverse().join("");
    if(word.toLowerCase() == revword)
    return true;   
    else
    return false;

}

*/
//Implement a function getName(user) that returns the name property of the user object.
//Implement a function setName(user, newName) that sets name property of user to newName.
//Implement a function addFavoriteColor(user, color) that adds color to the end of the favoriteColors property of user.

/*

function getName(user)
{
    return user.name;
}

function setName(user,newName)
{
   if(user) 
   user.name = newName;
    
}
function addFavoriteColor(user, color)
{
    if(user){
    user.favoriteColors.push(color);
}
}
const john = {
    name: 'John',
    favoriteColors: [],
};

*/

class Animal {
    constructor(name) {
      this.AnimalName = name;
    }
    walk() {
      console.log(this.AnimalName + " " + "is walking");
    }
  }

class Dog extends Animal
{
    constructor(name,DogName)
    {
        super(name);
        this.dogname = DogName;
    }
    speak()
    {
        console.log(this.dogname + " " + "says Woof" );
    }
}