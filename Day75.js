// Math methods in JS

// https://www.interviewbit.com/problems/math-methods-in-js/

// DO NOT USE ARGUMENTS FOR INPUTS
// Input num valus is in variable *num*
var num = parseInt(readLine().trim());
// YOUR CODE GOES HERE

let log2N = Math.log2(num);
let nearestInt = Math.round(log2N);
console.log(nearestInt);
