// Loops

// https://www.interviewbit.com/problems/js-loops/

// DO NOT USE ARGUMENTS FOR INPUTS
// Input num valus is in variable *num*
var num = parseInt(readLine().trim());
// YOUR CODE GOES HERE

let i = 0;
do {
    if (i % 2 !== 0) {
        console.log(i);
    }
    i++;
}
while (i < num);
