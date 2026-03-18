#include<iostream>
int main(int argc, char const *argv[])
{
    int a = 5;
    int b = 100;
    int *pA = &a;
    int* pB = &b;  

    printf("int b = %d \n", b);


    // int c = *pA;
    // *pB = 33; разименование
    // *pB = *pA;
    
    pB = pA;
    
    int* pC = pB;
    printf("&pA %d", &pA);
    

    return 0;
}
