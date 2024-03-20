// Regex in JS

// https://www.interviewbit.com/problems/regex-in-js/

// DO NOT USE ARGUMENTS FOR INPUTS
// Input num value is in variable *num*
var Str = readLine().trim();
var patt = readLine().trim();
// YOUR CODE GOES HERE
const regex = new RegExp(patt, "i");
console.log(regex.test(Str));
