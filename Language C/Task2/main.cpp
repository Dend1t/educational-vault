#include <iostream>
#include <math.h>

int main() {
    float n = 1;
    float temp = n / ( 2 * n * (2 * n + 1));
    float sum = 0;
    while (n <= 8) {
        sum += temp;
        temp = temp / n * (n+1) / (2 * n + 2) / ( 2 * n + 3);
        n++;
    }
    printf("sum %f temp %f", sum, temp);
    return 0;
}
