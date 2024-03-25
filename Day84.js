// JS Objects

// https://www.interviewbit.com/problems/js-objects/

// DO NOT USE ARGUMENTS FOR INPUTS
// Object created as per following code, You have to just print the subject name having highest marks.
/*
var Stud = new Object();
Stud.Maths = parseInt(readLine().trim());
Stud.Physics = parseInt(readLine().trim());
Stud.Chemistry = parseInt(readLine().trim());
*/
// YOUR CODE GOES HERE

var max = Stud.Maths;
var subject = Object.keys[0];
for(var x in Stud) {
    if(Stud[x] >= max) {
        max = Stud[x];
        subject = x;
    }
}
console.log(subject);
