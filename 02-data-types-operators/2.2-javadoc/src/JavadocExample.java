/**
 * Демонстрация комментариев для задания.
 * @author Екатерина
 */
public class JavadocExample {

    /* Константа для примера */
    public static final String NAME = "Java";

    /**
     * Главный метод программы.
     * @param args аргументы
     */
    public static void main(String[] args) {
        // Выводим приветствие
        System.out.println("Привет, " + NAME);

        /*
         * Вызываем метод
         * и выводим результат
         */
        int result = calculate(10, 5);
        System.out.println("Результат: " + result);
    }

    /**
     * Вычисляет сумму чисел.
     * @param x первое число
     * @param y второе число
     * @return сумма x и y
     */
    public static int calculate(int x, int y) {
        return x + y; // простое сложение
    }
}