public class CustomExceptionPractice {

    public static void main(String[] args) {

        /* Практика №1
         *
         * Пример собственного класса исключения MyFirstException.
         * Исключение генерируется при определенном условии и обрабатывается try-catch.
         */

        try {
            int value = -5;
            if (value < 0) {
                throw new MyFirstException("Значение не может быть отрицательным: " + value);
            }
        } catch (MyFirstException e) {
            System.out.println("Поймано собственное исключение: " + e.getMessage());
        }
    }
}

/* Собственный класс исключения */
class MyFirstException extends Exception {

    // Конструктор без параметров
    public MyFirstException() {
        super();
    }

    // Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}
