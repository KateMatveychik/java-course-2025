public class MultipleExceptionsPractice {

    public static void main(String[] args) {

        /* Практика №1
         *
         * Демонстрация обработки нескольких исключений.
         */

        try {
            int[] arr = new int[2];
            arr[5] = 10;         // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        }
        // Несколько исключений обрабатываются одинаково
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Поймано исключение: " + e);
        }

        // Демонстрация иерархии исключений
        try {
            throw new Ex3(); // Ex3 — потомок Ex2 -> Ex1
        } catch (Ex3 e) {
            System.out.println("Поймано Ex3");
        } catch (Ex2 e) {
            System.out.println("Поймано Ex2");
        } catch (Ex1 e) {
            System.out.println("Поймано Ex1");
        }

        /* Практика №2
         *
         * Использование final в catch:
         * final Exception e означает, что переменная e внутри блока catch
         * не может быть переназначена на другой объект.
         * Т.е. мы можем использовать e для чтения/вызова методов,
         * но нельзя сделать: e = new Exception();
         */
    }
}

/* Пользовательские исключения для демонстрации иерархии */
class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}
