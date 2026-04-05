#include <iostream>
#include <math.h>

int main(int argc, char const *argv[])
{
    int arr_1[] = {10, 20, 30, 40, 50};
    int *head_1 = arr_1;

    for (int i = 0; i < sizeof(arr_1) / sizeof(arr_1[0]) - 1; i++)
    {
        int temp = *(head_1 + i);
        arr_1[i] = *(head_1 + i + 1);
        arr_1[i + 1] = temp;
        printf("%d\n", arr_1[i]);
    }
    printf("%d\n", arr_1[sizeof(arr_1) / sizeof(arr_1[0])-1]);

    char arr_2[] = "abcdef";
    char *head_2 = arr_2;

    for (int i = 0; i < sizeof(arr_2) / sizeof(arr_2[0]) - 1; i++)
    {
        int temp = *(head_2 + i);
        arr_2[i] = *(head_2 + i + 1);
        arr_2[i + 1] = temp;
        printf("%c\n", arr_2[i]);
    }
    printf("%c\n", arr_2[sizeof(arr_2) / sizeof(arr_2[0])-1]);

    return 0;
}
