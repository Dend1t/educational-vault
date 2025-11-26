// Граничные случаи
System.out.println(solution(new int[]{}).firstIndex + " " + solution(new int[]{}).length); // -1 0
System.out.println(solution(new int[]{7}).firstIndex + " " + solution(new int[]{7}).length); // -1 0
System.out.println(solution(new int[]{0}).firstIndex + " " + solution(new int[]{0}).length); // 0 1
System.out.println(solution(new int[]{0, 0, 0, 0, 0}).firstIndex + " " + solution(new int[]{0, 0, 0, 0, 0}).length); // 0 5

// Расположение последовательности
System.out.println(solution(new int[]{1, -1, 2, 3, 4, 5}).firstIndex + " " + solution(new int[]{1, -1, 2, 3, 4, 5}).length); // 0 2
System.out.println(solution(new int[]{1, 2, 3, 4, 5, -5}).firstIndex + " " + solution(new int[]{1, 2, 3, 4, 5, -5}).length); // 4 2
System.out.println(solution(new int[]{1, 2, -3, 4, 5, -9, 9, 1}).firstIndex + " " + solution(new int[]{1, 2, -3, 4, 5, -9, 9, 1}).length); // 3 4

// Специальные случаи
System.out.println(solution(new int[]{10, -1, -2, -3, -4}).firstIndex + " " + solution(new int[]{10, -1, -2, -3, -4}).length); // 0 5
System.out.println(solution(new int[]{-2, -1, 0, 1, 2, 3}).firstIndex + " " + solution(new int[]{-2, -1, 0, 1, 2, 3}).length); // 0 5
System.out.println(solution(new int[]{1, 0, 0, 0, 2}).firstIndex + " " + solution(new int[]{1, 0, 0, 0, 2}).length); // 1 3

// Ключевой тест - выбор второй слева
System.out.println(solution(new int[]{5, -5, 0, 1, 2, 3, -3, 4}).firstIndex + " " + solution(new int[]{5, -5, 0, 1, 2, 3, -3, 4}).length); // 1 2

// Простые случаи
System.out.println(solution(new int[]{1, 2, 0, 4, 5}).firstIndex + " " + solution(new int[]{1, 2, 0, 4, 5}).length); // 2 1
System.out.println(solution(new int[]{1, 2, 3, 4, 5}).firstIndex + " " + solution(new int[]{1, 2, 3, 4, 5}).length); // -1 0
System.out.println(solution(new int[]{100, 1, 2, 3, 4, 5, -15, 8, 9, -100}).firstIndex + " " + solution(new int[]{100, 1, 2, 3, 4, 5, -15, 8, 9, -100}).length); // 0 10