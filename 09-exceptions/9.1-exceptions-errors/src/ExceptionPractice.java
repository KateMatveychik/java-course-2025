public class ExceptionPractice {

    public static void main(String[] args) {

        /* Практика №1
         * Основные классы исключений:
         *
         * Throwable — суперкласс для всех ошибок и исключений.
         *
         * Error — критические ошибки JVM, обычно их нельзя поймать.
         *
         * Exception — исключения, которые можно обработать в программе.
         *
         * RuntimeException — непроверяемые исключения, не требуют
         * обязательного try-catch при компиляции.
         */

        /* Практика №2
         * Примеры генерации и обработки разных исключений.
         */

        // ArithmeticException
        try {
            int a = 10 / 0; // деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Поймано ArithmeticException: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int val = arr[5]; // выход за границы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // IllegalArgumentException
        try {
            Thread.sleep(-100); // отрицательный аргумент
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано IllegalArgumentException: " + e.getMessage());
        } catch (InterruptedException ignored) {}

        // ClassCastException
        try {
            Object obj = "string";
            Integer num = (Integer) obj; // неправильное приведение типа
        } catch (ClassCastException e) {
            System.out.println("Поймано ClassCastException: " + e.getMessage());
        }

        // NullPointerException
        try {
            String str = null;
            str.length(); // обращение к методу null
        } catch (NullPointerException e) {
            System.out.println("Поймано NullPointerException: " + e.getMessage());
        }
    }
}
