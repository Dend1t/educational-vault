#include <iostream>

int** createArray(int ROW, int COL) {
    int** arr = (int**)malloc(ROW * sizeof(int*));
    for (int i = 0; i < ROW; i++) {
        *(arr + i) = (int*)malloc(COL * sizeof(int));
        //arr[i]
        for (int j = 0; j < COL; j++) {
            *(*(arr + i) + j) = i+1;
            //arr[j]
        }
    }
    return arr;
}
int** createLinearArray(int ROW, int COL) {
    int* line = (int*)malloc(ROW * sizeof(int) * COL);
    int** arr = (int**)malloc(ROW * sizeof(int*));
    for (int i = 0; i < ROW; i++) {
        *(arr + i) = line + i * COL;

        for (int j = 0; j < COL; j++) {
            *(*(arr + i) + j) = i+1;
        }
    }
}

int main() {
    int a = 5;
    int* p = &a;
    int** pP = &p;
    char Jora[] = "Jopa";
    printf("%s\n", Jora);


    return 0;
}