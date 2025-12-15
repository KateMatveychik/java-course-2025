import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        // Практика 1: Присваивание массивов
        System.out.println("Практика 1: Присваивание массивов\n");

        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};

        System.out.println("До присваивания a1 = a2:");
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));

        a1 = a2; // присваивание ссылок

        System.out.println("\nПосле присваивания a1 = a2:");
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));

        a2[0] = 99; // меняем a2

        System.out.println("\nПосле изменения a2[0] = 99:");
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));

        /*
         * Что происходит при a1 = a2:
         * 1. a1 и a2 становятся ссылками на один и тот же массив
         * 2. Исходный массив {1,2,3,4,5} теряет ссылку и будет удален
         * 3. Изменения в a2 видны через a1 и наоборот
         *
         * Это присваивание ссылок, а не копирование элементов.
         * Оба массива теперь указывают на одну область памяти.
         */


        // Практика 2: Методы класса java.util.Arrays
        System.out.println("Практика 2: Методы класса java.util.Arrays\n");

        int[] arr = {5, 3, 8, 1, 9, 2};
        int[] arrCopy = {5, 3, 8, 1, 9, 2};
        int[] arrDifferent = {1, 2, 3, 4, 5};

        // 1. toString() - преобразование массива в строку
        System.out.println("1. Arrays.toString():");
        System.out.println("   Arrays.toString(arr) = " + Arrays.toString(arr));

        // 2. sort() - сортировка массива
        System.out.println("\n2. Arrays.sort():");
        int[] arrToSort = {5, 3, 8, 1, 9, 2};
        System.out.println("   До сортировки: " + Arrays.toString(arrToSort));
        Arrays.sort(arrToSort);
        System.out.println("   После сортировки: " + Arrays.toString(arrToSort));

        // 3. binarySearch() - бинарный поиск (только в отсортированном массиве!)
        System.out.println("\n3. Arrays.binarySearch():");
        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(sortedArr, 5);
        System.out.println("   Поиск 5 в " + Arrays.toString(sortedArr));
        System.out.println("   Результат: индекс " + index);

        // 4. equals() - сравнение массивов
        System.out.println("\n4. Arrays.equals():");
        System.out.println("   arr.equals(arrCopy) = " + arr.equals(arrCopy));
        System.out.println("   Arrays.equals(arr, arrCopy) = " + Arrays.equals(arr, arrCopy));
        System.out.println("   Arrays.equals(arr, arrDifferent) = " + Arrays.equals(arr, arrDifferent));

        // 5. compare() - сравнение массивов с порядком
        System.out.println("\n5. Arrays.compare():");
        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 4};
        int[] arrC = {1, 2, 3, 4};

        System.out.println("   compare({1,2,3}, {1,2,4}) = " + Arrays.compare(arrA, arrB));
        System.out.println("   compare({1,2,3}, {1,2,3,4}) = " + Arrays.compare(arrA, arrC));
        System.out.println("   compare({1,2,4}, {1,2,3}) = " + Arrays.compare(arrB, arrA));

        /*
         * Методы класса java.util.Arrays:
         *
         * 1. toString(array) - возвращает строковое представление массива
         *    Полезно для вывода вместо ручного перебора.
         *
         * 2. sort(array) - сортирует массив по возрастанию.
         *
         * 3. binarySearch(array, key) - ищет элемент в отсортированном массиве.
         *    Возвращает индекс элемента или отрицательное число, если не найден.
         *    Работает только с отсортированными массивами!
         *
         * 4. equals(array1, array2) - сравнивает два массива по элементам.
         *    Возвращает true, если массивы одинаковой длины и элементы равны.
         *    Отличается от array1.equals(array2), который сравнивает ссылки.
         *
         * 5. compare(array1, array2) - сравнение массивов.
         *    Возвращает:
         *    - отрицательное число, если array1 < array2
         *    - 0, если array1 == array2
         *    - положительное число, если array1 > array2
         *    Сравнивает поэлементно до первого различия.
         */



    }
}