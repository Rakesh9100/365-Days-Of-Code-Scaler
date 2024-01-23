// Classes and Objects

// https://www.interviewbit.com/problems/classes-and-objects-cpp/

/*
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
*/

class Student{
    string name;
    int age;
    int rollno;
public:
    // Create funtions here with the name given
    
    Student() : age(0), rollno(0) {}

    // Function to set the variables
    void set_variable(const string& n, int a, int r) {
        name = n;
        age = a;
        rollno = r;
    }

    // Function to print the variables
    void print_variable() {
        cout << name << endl;
        cout << age << endl;
        cout << rollno << endl;
    }
};



/*
int main()  {
    Student obj1;
    obj1.set_variable("Robin", 15, 10);
    Student obj2;
    obj2.set_variable("Rahul", 20, 14);
    obj1.print_variable();
    obj2.print_variable();
    return 0;
}
*/
