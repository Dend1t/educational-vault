#include <iostream>
#include <math.h>

int main(int argc, char const *argv[])
{
    int arr[] = {10, 20, 30, 40, 50};

    int *head = arr;

    for (int i = 0; i < sizeof(arr) / sizeof(arr[0]) - 1; i++)
    {
        int temp = *(head + i);
        arr[i] = *(head + i + 1);
        arr[i + 1] = temp;
        printf("%d\n", *(head + i));
    }
    printf("%d\n", *(head + sizeof(arr) / sizeof(arr[0]) - 1));

    return 0;
}
