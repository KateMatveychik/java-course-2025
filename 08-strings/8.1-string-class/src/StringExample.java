import java.util.StringJoiner;

public class StringExample {

    public static void main(String[] args) {

        /* Практика №1
         * Демонстрация работы методов класса String
         */

        String text = "Hello Java World!";

        // 1. length() — возвращает длину строки
        System.out.println("length(): " + text.length());

        // 2. charAt(int) — возвращает символ по индексу
        System.out.println("charAt(1): " + text.charAt(1));

        // 3. substring(int) — возвращает подстроку с указанного индекса
        System.out.println("substring(6): " + text.substring(6));

        // 4. substring(int, int) — подстрока в диапазоне
        System.out.println("substring(0, 5): " + text.substring(0, 5));

        // 5. toUpperCase() — переводит строку в верхний регистр
        System.out.println("toUpperCase(): " + text.toUpperCase());

        // 6. toLowerCase() — переводит строку в нижний регистр
        System.out.println("toLowerCase(): " + text.toLowerCase());

        // 7. contains(CharSequence) — проверяет наличие подстроки
        System.out.println("contains(\"Java\"): " + text.contains("Java"));

        // 8. replace(char, char) — заменяет символы
        System.out.println("replace('a','*'): " + text.replace('a', '*'));

        // 9. startsWith(String) — проверяет начало строки
        System.out.println("startsWith(\"Hello\"): " + text.startsWith("Hello"));

        // 10. split(String) — разбивает строку на массив
        String[] words = text.split(" ");
        System.out.println("split():");
        for (String w : words) {
            System.out.println(w);
        }

        /* Практика №2
         * Примеры использования StringJoiner
         */

        // StringJoiner используется для удобного объединения строк
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Orange");

        System.out.println("StringJoiner результат: " + joiner);

        /* Практика №3
         * Зачем нужны три двойные кавычки
         *
         * Три двойные кавычки (""" """) используются для создания
         * многострочных текстовых блоков.
         * Они позволяют записывать строки в читаемом виде
         * без символов переноса строки \n.
         */

        String textBlock = """
                Это пример
                многострочной строки
                в Java
                """;

        System.out.println("Text block:");
        System.out.println(textBlock);
    }
}
