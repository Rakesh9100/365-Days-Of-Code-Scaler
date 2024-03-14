// Jump Statements

// https://www.interviewbit.com/problems/js-jump-statements/

// DO NOT USE ARGUMENTS FOR INPUTS
// Input num valus is in variable *num*
var num = parseInt(readLine().trim());
// YOUR CODE GOES HERE

let i = 0;
while (i < num) {
    if (i % 2 === 0) {
        i++;
        continue; // Skip even numbers
    }
    console.log(i);
    i++;
    if (i >= num) {
        break; // Exit loop if i is greater than or equal to num
    }
}
