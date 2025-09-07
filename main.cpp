#include<iostream>
using namespace std;
void print1(int n){//Square of Stars
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cout<<"*";
        }
        cout<<endl;
    }
}
void print2(int n){//half-pyramid
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<i<<" ";
        }
        cout<<endl;

    }

}
void print3(int n){//inverted half-pyramid of stars
    for(int i=1;i<=n;i++){
        for(int j=0;j<n-i+1;j++){
            cout<< " * ";
        }
        cout<<endl;

    }

}
void print4(int n){//inverted half-pyramid of numbers
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            cout<<j<<" ";

        }
        cout<<endl;
    }
}
void print5(int n){//"full pyramid" or "full star pyramid" pattern (or) "centered star pyramid"
    
    for(int i=0;i<n;i++){

    
    //space
    for(int j=0;j<n-i-1;j++){
        cout<<" ";

    }
    //satrs
    for(int j=0;j<2*i+1;j++){
        cout<< "*";

    }
    //sapce
    for(int j=0;j<n-i-1;j++){
        cout<<" ";
        

    }
    
    cout<<endl;
}
}
void print6(int n){//inverted "centered star pyramid"
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            cout<<" ";
        }
        for(int j=0;j<2*n-(2*i+1);j++){
            cout<<"*";
        }
        for(int j=0;j<i;j++){
            cout<<" ";
        }
        cout<<endl;
    }
}
void print7(int n){//Diamond Star Pattern.
    
}
void print8(int n){//Diamond-like pattern without spaces (or) just top and bottom halves of a triangle joined together
    for(int i=1;i<=2*n-1;i++){
        int stars=i;
        if(i>n)stars=2*n-i;
    for(int j=1;j<=stars;j++){
        cout<<"*";

        }
        cout<<endl;

    }
}
void print9(int n){//alternates between 1 and 0, so it’s a binary sequence.
    int start=1;
    for(int i=0;i<n;i++){
        if(i%2==0) start=1;
        else start=0;
        for(int j=0;j<=i;j++){
            cout<<start;
            start=1 - start;
        }
        cout<<endl;

    }
}





int main(){
    int n = 5;
    cin>>n;
    print9(n);
    //print6(n);
    return 0;

}