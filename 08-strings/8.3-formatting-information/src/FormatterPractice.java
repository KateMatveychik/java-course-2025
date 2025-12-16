import java.util.Formatter;
import java.util.Date;

public class FormatterPractice {

    public static void main(String[] args) {

        /* Практика №1
         * Демонстрация использования спецификаторов форматирования класса Formatter.
         * Используемые спецификаторы:
         * %b — логическое значение аргумента
         * %c — символьное представление
         * %d — десятичное целое значение аргумента
         * %f — десятичное значение с плавающей точкой
         * %n — вставка символа с новой строки
         */

        Formatter formatter = new Formatter();

        formatter.format("Логическое значение: %b%n", true);
        formatter.format("Символ: %c%n", 'A');
        formatter.format("Целое число: %d%n", 42);
        formatter.format("Число с плавающей точкой: %f%n", 3.14);
        formatter.format("Hello %n World %n");

        System.out.print(formatter.toString());

        /* Практика №2
         * Метод flush() нужен, чтобы сразу вывести все накопленные данные.
         * Formatter может временно хранить текст во внутреннем буфере
         * и не выводить его мгновенно.
         * Вызов flush() заставляет немедленно отправить весь текст
         * в поток вывода (например, в консоль или файл).
         */

        formatter.flush();

        /* Теория (дата и время)
         * Спецификаторы %t используются для форматирования даты и времени.
         * Они позволяют получать отдельные компоненты даты:
         * часы, минуты, секунды, год, месяц, день недели и т.д.
         */

        /* Практика №3
         * Демонстрация форматирования даты и времени.
         * Используемые спецификаторы:
         * %tH — час в формате 00–23
         * %tM — минуты
         * %tS — секунды
         * %tY — год в четырехзначном формате
         * %tA — полное название дня недели
         */

        Date now = new Date();

        formatter.format(
                "Текущее время: %tH:%tM:%tS%n",
                now, now, now
        );
        formatter.format(
                "Год: %tY%n",
                now
        );
        formatter.format(
                "День недели: %tA%n",
                now
        );

        System.out.print(formatter.toString());

        formatter.close();
    }
}

