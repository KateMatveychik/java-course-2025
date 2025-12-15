public class WrapperExample {
    public static void main(String[] args) {
        // Практика 1: Примеры использования метода decode()
        System.out.println("Практика 1: примеры использования метода decode()\n");

        Integer a = Integer.decode("100");    // десятичное
        Integer b = Integer.decode("0x64");   // шестнадцатеричное (0x)
        Integer c = Integer.decode("#64");    // шестнадцатеричное (#)
        Integer d = Integer.decode("0144");   // восьмеричное (0 в начале)
        Integer f = Integer.decode("-0x64");  // отрицательное шестнадцатеричное

        System.out.println("decode(\"100\") = " + a);
        System.out.println("decode(\"0x64\") = " + b);
        System.out.println("decode(\"#64\") = " + c);
        System.out.println("decode(\"0144\") = " + d);
        System.out.println("decode(\"-0x64\") = " + f);

        /*
         * Метод decode() понимает разные форматы чисел:
         * - "123"       -> десятичное
         * - "0x7B"      -> шестнадцатеричное (с 0x)
         * - "#FF"       -> шестнадцатеричное (с #)
         * - "0173"      -> восьмеричное (начинается с 0)
         * - "-0xA"      -> отрицательное шестнадцатеричное
         */


        // Практика 2: способы создания boolean
        System.out.println("Практика 2: Способы создания Boolean\n");

        // 1. Через конструктор (устаревший)
        Boolean bool1 = new Boolean(true);
        Boolean bool2 = new Boolean("true");
        System.out.println("1. Конструктор:");
        System.out.println("   new Boolean(true) = " + bool1);
        System.out.println("   new Boolean(\"true\") = " + bool2);

        // 2. Boolean.valueOf()
        Boolean bool3 = Boolean.valueOf(true);
        Boolean bool4 = Boolean.valueOf("TRUE");
        System.out.println("\n2. Boolean.valueOf():");
        System.out.println("   Boolean.valueOf(true) = " + bool3);
        System.out.println("   Boolean.valueOf(\"TRUE\") = " + bool4);

        // 3. Boolean.parseBoolean() - возвращает примитив
        boolean bool5 = Boolean.parseBoolean("true");
        boolean bool6 = Boolean.parseBoolean("false");
        System.out.println("\n3. Boolean.parseBoolean():");
        System.out.println("   parseBoolean(\"true\") = " + bool5);
        System.out.println("   parseBoolean(\"false\") = " + bool6);
        System.out.println("   parseBoolean(\"любой текст\") = " +
                Boolean.parseBoolean("любой текст"));

        // 4. Автоупаковка
        Boolean bool7 = true;
        Boolean bool8 = false;
        System.out.println("\n4. Автоупаковка:");
        System.out.println("   Boolean bool7 = true -> " + bool7);
        System.out.println("   Boolean bool8 = false -> " + bool8);

        // 5. Константы
        System.out.println("\n5. Константы:");
        System.out.println("   Boolean.TRUE = " + Boolean.TRUE);
        System.out.println("   Boolean.FALSE = " + Boolean.FALSE);

        /*
         * Важно: строки "true", "TRUE", "True" дают true,
         * все остальные строки - false.
         */

        // Практика 3: NullPointerException при автоупаковке/автораспаковке
        System.out.println("Практика 3: NullPointerException\n");

        Integer nullObject = null;

        try {
            int value = nullObject; // Попытка распаковать null
            System.out.println("Этот текст не выведется");
        } catch (NullPointerException e) {
            System.out.println("Найден NullPointerException");
        }

        /*
         * NullPointerException возникает при:
         * 1. Автораспаковке null: int i = nullInteger
         * 2. Арифметике с null: nullInteger + 5
         * 3. Сравнении null с примитивом: nullInteger == 10
         *
         * Причина: Java неявно вызывает nullInteger.intValue(),
         * что вызывает исключение при null.
         *
         * Автоупаковка null невозможна, так как null не является
         * значением примитивного типа.
         */


        /*
         * Практика 4: Integer cache и сравнение объектов
         *
         * Код напечатает:
         *
         * Для i1 = 128:
         * a1==i1 true        (автораспаковка a1 при сравнении с примитивом)
         * b1==i1 true        (автораспаковка b1 при сравнении с примитивом)
         * a1==b1 false       (разные объекты, 128 вне кэша)
         * a1.equals(i1) true (сравнение значений)
         * b1.equals(i1) true (сравнение значений)
         * a1.equals(b1) true (сравнение значений)
         *
         * Для i2 = 127:
         * a2==i2 true        (автораспаковка при сравнении с примитивом)
         * b2==i2 true        (автораспаковка при сравнении с примитивом)
         * a2==b2 true        (один и тот же объект из кэша)
         * a2.equals(i2) true (сравнение значений)
         * b2.equals(i2) true (сравнение значений)
         * a2.equals(b2) true (сравнение значений)
         *
         * Объяснение:
         * 1. При сравнении Integer с int (==) происходит автораспаковка Integer
         *    и сравнение значений примитивов. Поэтому a1==i1 всегда true.
         *
         * 2. При сравнении двух Integer объектов (==) сравниваются ссылки
         *    (адреса в памяти), а не значения.
         *
         * 3. Класс IntegerCache кэширует объекты Integer для значений от -128 до 127.
         *    Для этих значений Integer.valueOf() возвращает один и тот же объект.
         *    Поэтому a2 и b2 (для 127) - это один объект, а a1 и b1 (для 128) - разные.
         *
         * 4. Метод equals() сравнивает значения, а не ссылки, поэтому
         *    всегда возвращает true для одинаковых чисел.
         *
         * Класс IntegerCache используется для:
         * • Экономии памяти (повторное использование объектов)
         * • Повышения производительности (не создавать новые объекты для часто используемых чисел)
         * • Диапазон по умолчанию: -128 до 127, но может быть расширен через системное свойство
         */

    }
}