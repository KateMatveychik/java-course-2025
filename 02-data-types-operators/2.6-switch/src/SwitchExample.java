public class SwitchExample{
    public static void main(String[] args) {
        System.out.println("=== Примеры оператора switch ===\n");

        // Практика 1: Типы переменных в switch
        System.out.println("Практика 1: Типы переменных в switch\n");

        // 1. byte
        byte byteValue = 2;
        System.out.println("1. Тип byte:");
        switch(byteValue) {
            case 1:
                System.out.println("   case 1 для byte");
                break;
            case 2:
                System.out.println("   case 2 для byte");
                break;
        }

        // 2. short
        short shortValue = 100;
        System.out.println("\n2. Тип short:");
        switch(shortValue) {
            case 100:
                System.out.println("   case 100 для short");
                break;
            case 200:
                System.out.println("   case 200 для short");
                break;
        }

        // 3. int
        int intValue = 1;
        System.out.println("\n3. Тип int:");
        switch(intValue) {
            case 1:
                System.out.println("   case 1 для int");
                break;
            case 2:
                System.out.println("   case 2 для int");
                break;
        }

        // 4. char
        char charValue = 'A';
        System.out.println("\n4. Тип char:");
        switch(charValue) {
            case 'A':
                System.out.println("   case 'A' для char");
                break;
            case 'B':
                System.out.println("   case 'B' для char");
                break;
        }

        // 5. String
        String stringValue = "hello";
        System.out.println("\n5. Тип String:");
        switch(stringValue) {
            case "hello":
                System.out.println("   case \"hello\" для String");
                break;
            case "world":
                System.out.println("   case \"world\" для String");
                break;
        }


        /*
         * Итог по типам в switch:
         * Допустимые типы: byte, short, int, char, String (с Java 7),
         * enum, и классы-оболочки (Byte, Short, Integer, Character).
         * Каждый case проверяет точное равенство значения константе.
         */

        System.out.println("\n" + "=".repeat(40) + "\n");

        // Практика 2: Отсутствие break в case
        System.out.println("Практика 2: Отсутствие break в case\n");

        System.out.println("Пример switch с пропущенным break:");
        int value = 2;
        int result = 0;

        switch(value) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 2; // нет break!
            case 3:
                result = 3; // выполнится тоже
                break;
        }

        System.out.println("При value=" + value + ", result=" + result);

        /*
         * Практика 2: Что происходит без break
         *
         * Когда в case отсутствует break, выполнение кода "проваливается"
         * в следующий case без проверки его условия. В примере выше:
         * - При value = 2 срабатывает case 2 (result = 2)
         * - Так как break нет, выполнение продолжается в case 3 (result = 3)
         * - Итоговое значение result = 3, хотя value было равно 2
         *
         * Это называется "fall-through" (проваливание). Иногда его используют
         * намеренно для группировки нескольких case с одинаковым действием.
         *
         * switch(day) {
         *     case 1:
         *     case 2:
         *     case 3:
         *     case 4:
         *     case 5:
         *         System.out.println("рабочий день");
         *         break;
         *     case 6:
         *     case 7:
         *         System.out.println("выходной");
         *         break;
         * }
         *
         * Но в большинстве случаев отсутствие break - это ошибка,
         * которая приводит к неожиданному поведению программы.
         * Всегда проверяйте наличие break в конце каждого case,
         * если не планируете намеренное проваливание.
         */
    }
}

