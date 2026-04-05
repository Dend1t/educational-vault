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

    // 1.
    // int arr_1[] = {10,20,30,40,50,60};
    // int* head_int = arr_1;
    // for( int i = 0 ; i<sizeof(arr_1)/sizeof(arr_1[0]); i+=2){
    //     printf("%d \n",*(head_int+i));
    // }

    // char arr_2[] = "abcdef";
    // char* head_char = arr_2;
    // for( int i = 0 ; i<sizeof(arr_2)/sizeof(arr_2[0]); i+=2){
    //     printf("%c \n",*(head_char+i));
    // }

    int arr_1[] = {11,12,13,21,22,23,31,32,33,41,42,43,51,52,53};
    int* head_1 = arr_1;
    int length = sizeof(arr_1)/sizeof(arr_1[0]);
    int arr_out[length/3*2-(length%3==0)]; 
    for(int i = 0; i < length; i+=3){
        arr_out[i] = *(head_1+i*2);
        arr_out[i+1] = *(head_1+i*2+1);
        arr_out[i+2] = *(head_1+i*2+2);
    }
    for(int i = 0; i < sizeof(arr_out)/sizeof(arr_out[0]); i++){
        printf("%d \n",arr_out[i]);
    }
    



    return 0;
}
