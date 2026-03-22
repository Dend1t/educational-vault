#include<iostream>
#include<math.h>

int main(int argc, char const *argv[])
{
    float a,b;
    scanf("%f %f", &a, &b);
    if(pow(b,2) + pow(a,2) > pow(a+b,2) ){
        printf("Сумма квадратов больше %f \n " , pow(a,2));
    }
    else{
        a = a<0 ? a : pow(a,2);
        printf("%f",a);
    }
    return 0;
}
