public class FinallyPractice {

    public static void main(String[] args) {

        /* Практика №1
         *
         * Можно ли использовать try без catch и finally?
         * Ответ: нет. Блок try должен иметь хотя бы один catch или finally.
         * Иначе компилятор выдаст ошибку.
         */

        // Пример нерабочей конструкции:
        /*
        try {
            int a = 10 / 2;
        }
        */

        /* Практика №2
         *
         * Можно ли использовать try только с finally?
         * Ответ: да, можно. Это часто используется для освобождения ресурсов.
         */
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[0]);
        } finally {
            System.out.println("Блок finally выполняется всегда");
        }

        /* Практика №3
         *
         * Можно ли использовать два блока finally подряд?
         * Ответ: нет, синтаксис Java не допускает несколько finally для одного try.
         * Компилятор выдаст ошибку.
         */
        /*
        try {
            System.out.println("Test");
        } finally {
            System.out.println("Первый finally");
        } finally {
            System.out.println("Второй finally");
        }
        */
    }
}
