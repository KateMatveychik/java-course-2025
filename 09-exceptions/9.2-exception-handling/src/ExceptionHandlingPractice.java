public class ExceptionHandlingPractice {

    public static void main(String[] args) {

        /* Практика №1
         *
         * Пример обработки исключений.
         * Здесь одно исключение перехватывается блоком try-catch,
         * а другое не перехватывается и вызывает аварийное завершение программы.
         */

        // Исключение, которое будет перехвачено
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Поймано ArithmeticException: " + e.getMessage());
        }

        // Исключение, которое не перехватывается
        // Оно приведет к аварийной остановке программы
        String str = null;
        System.out.println(str.length()); // NullPointerException
    }

    /* Объяснение:
     * 1. В первом случае блок try-catch ловит ArithmeticException,
     *    программа продолжает работу.
     * 2. Во втором случае NullPointerException не обрабатывается,
     *    поэтому JVM завершает выполнение программы с ошибкой.
     */
}
