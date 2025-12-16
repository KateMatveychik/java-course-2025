public class StringBuilderBufferExample {

    public static void main(String[] args) {

        /* Практика №1
         * Демонстрация методов StringBuilder и StringBuffer
         *
         * StringBuilder — изменяемый класс для работы со строками.
         * Работает быстрее StringBuffer, но не является потокобезопасным.
         *
         * StringBuffer — изменяемый класс для работы со строками,
         * является потокобезопасным, но работает медленнее.
         */

        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbuf = new StringBuffer("World");

        // 1. append() — добавляет строку в конец
        sb.append(" Java");
        System.out.println("append(): " + sb);

        // 2. insert(int, String) — вставляет строку по индексу
        sb.insert(5, ",");
        System.out.println("insert(): " + sb);

        // 3. delete(int, int) — удаляет часть строки
        sb.delete(5, 6);
        System.out.println("delete(): " + sb);

        // 4. replace(int, int, String) — заменяет часть строки
        sb.replace(6, 10, "JAVA");
        System.out.println("replace(): " + sb);

        // 5. reverse() — переворачивает строку
        sb.reverse();
        System.out.println("reverse(): " + sb);

        // 6. length() — возвращает длину
        System.out.println("length(): " + sb.length());

        // 7. charAt(int) — возвращает символ по индексу
        System.out.println("charAt(2): " + sb.charAt(2));

        // 8. setCharAt(int, char) — изменяет символ по индексу
        sb.setCharAt(2, '*');
        System.out.println("setCharAt(): " + sb);

        // 9. substring(int, int) — возвращает подстроку (не изменяет объект)
        System.out.println("substring(): " + sb.substring(0, 5));

        // 10. capacity() — текущая вместимость буфера
        System.out.println("capacity(): " + sb.capacity());

        // Методы StringBuffer (аналогичны StringBuilder, но потокобезопасны)
        sbuf.append(" Java");
        sbuf.insert(0, "Hello ");
        System.out.println("StringBuffer result: " + sbuf);

        /* Практика №2
         * Преобразование между String, StringBuilder и StringBuffer
         *
         * String -> StringBuilder / StringBuffer
         * выполняется через конструктор.
         *
         * StringBuilder / StringBuffer -> String
         * выполняется с помощью метода toString()
         *
         */

        // String -> StringBuilder
        String str = "Example";
        StringBuilder fromStringBuilder = new StringBuilder(str);

        // String -> StringBuffer
        StringBuffer fromStringBuffer = new StringBuffer(str);

        // StringBuilder -> String
        String sbToString = fromStringBuilder.toString();

        // StringBuffer -> String
        String sbufToString = fromStringBuffer.toString();

        // StringBuilder -> StringBuffer
        StringBuffer builderToBuffer = new StringBuffer(fromStringBuilder.toString());

        // StringBuffer -> StringBuilder
        StringBuilder bufferToBuilder = new StringBuilder(fromStringBuffer.toString());

        System.out.println("Преобразования выполнены успешно");
    }
}
