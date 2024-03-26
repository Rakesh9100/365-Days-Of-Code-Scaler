// Functions in JS

// https://www.interviewbit.com/problems/functions-in-js/

// DO NOT USE ARGUMENTS FOR INPUTS
// You have to just implement the myFunction.

var a = parseInt(readLine().trim());
var b = parseInt(readLine().trim());
var c = parseInt(readLine().trim());

// YOUR CODE GOES HERE

const myFunction = (a, b, c) => {
    return a * b * c;
}

var z = myFunction(a, b, c);
console.log(z);
