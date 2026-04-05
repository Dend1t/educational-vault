#include <iostream>
#include <math.h>

int main(int argc, char const *argv[])
{
    // int arr[] = {1, 2, 3, 4, 5, 6, 7};
    // int *p = arr;
    // for (int i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
    // {
    //     printf(" Element %d: = %d , Adres: %p\n", i, *(p + i), (p + i));
    // }

    
    int arr_1[] = {10,20,30,40,50,60};
    int* head_int = arr_1;
    for( int i = 0 ; i<sizeof(arr_1)/sizeof(arr_1[0]); i+=2){
        printf("%d \n",*(head_int+i));
    }

    char arr_2[] = "abcdef";
    char* head_char = arr_2;
    for( int i = 0 ; i<sizeof(arr_2)/sizeof(arr_2[0]); i+=2){
        printf("%c \n",*(head_char+i));
    }



    return 0;
}
