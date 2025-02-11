#include <iostream>
using namespace std;
int main(){
    int num;
    cout << "Enter a number: ";
    cin >> num;
    int fact = 1;
    int i=1;
    while(i<=num){
        fact *= i;
        i++;
    }
    cout << "Factorial of " << num << " is " << fact << endl;
}