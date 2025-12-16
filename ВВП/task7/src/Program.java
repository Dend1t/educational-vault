//(*) Вводится массив целых чисел. Найти самую длинную подпоследовательностей
//подряд идущих элементов массива, которые в сумме дают 0 (реализовать функцию,
//которая будет возвращать позицию первого элемента такой подпоследовательности и
//кол-во элементов). В случае нескольких таких подпоследовательностей найти вторую
//слева (от начала массива). В случае, если таких подпоследовательностей не существует,
//функция должна возвращать в качестве первого элемента подпоследовательности -1.

public class Program{
    public static void main(String[] args) throws Exception {
        // Тест 1: простой случай
        int[] test1 = {1, -1};
        Interval ans1 = solution(test1);
        System.out.println(ans1.firstIndex + " " + ans1.length); // 0 2

// Тест 2: нули
        int[] test2 = {0, 0, 0};
        Interval ans2 = solution(test2);
        System.out.println(ans2.firstIndex + " " + ans2.length); // 0 3

// Тест 3: несколько подпоследовательностей, выбираем вторую слева
        int[] test3 = {1, -1, 5, 2, -2};
        Interval ans3 = solution(test3);
        System.out.println(ans3.firstIndex + " " + ans3.length); // 3 2

// Тест 4: вся последовательность = 0
        int[] test4 = {2, -2, 3, -3};
        Interval ans4 = solution(test4);
        System.out.println(ans4.firstIndex + " " + ans4.length); // 0 4

// Тест 5: нет подходящих подпоследовательностей
        int[] test5 = {1, 2, 3};
        Interval ans5 = solution(test5);
        System.out.println(ans5.firstIndex + " " + ans5.length); // -1 0

// Тест 6: отрицательные числа
        int[] test6 = {-1, -2, 3};
        Interval ans6 = solution(test6);
        System.out.println(ans6.firstIndex + " " + ans6.length); // 0 3

// Тест 7: несколько длинных, выбираем вторую слева
        int[] test7 = {3, 1, -1, 4, 2, -2};
        Interval ans7 = solution(test7);
        System.out.println(ans7.firstIndex + " " + ans7.length); // 4 2

// Тест 8: одиночный ноль
        int[] test8 = {5, 0, 7};
        Interval ans8 = solution(test8);
        System.out.println(ans8.firstIndex + " " + ans8.length); // 1 1

// Тест 9: подпоследовательность в конце
        int[] test9 = {4, 1, -1, 0};
        Interval ans9 = solution(test9);
        System.out.println(ans9.firstIndex + " " + ans9.length); // 1 3

// Тест 10: пустой массив
        int[] test10 = {};
        Interval ans10 = solution(test10);
        System.out.println(ans10.firstIndex + " " + ans10.length); // -1 0
        // Тест 10: пустой массив
        int[] test11 = {2, 1, -1, -2};
        Interval ans11 = solution(test11);
        System.out.println(ans11.firstIndex + " " + ans11.length);

//        int[] arr = ArrayUtils.readIntArrayFromConsole();
//        Interval ans = solution(arr);
//        System.out.println(ans.firstIndex + " " + ans.length);
    }

    public static Interval solution(int[] arr) {
        int iterNums = 0;
        int mostValueableLength = 0;
        Interval ans = Interval.defaultInterval();
        for(int x = 0; x< arr.length; x++){
            int sumOfOne = 0;
            for(int i = 0; i < arr.length-x ;i++){
                sumOfOne+=arr[i+x];
                if(mostValueableLength ==i+1 && iterNums<=1 && sumOfOne == 0){
                    ans.firstIndex = x;
                    ans.length = i + 1;
                    iterNums++;
                }
                else if(mostValueableLength < i+1 && sumOfOne == 0 ) {
                    ans.firstIndex = x;
                    ans.length = i + 1;
                    iterNums = 0;
                    mostValueableLength = i + 1;
                }

            }
        }
        return ans;
    }

}
