public class LoopsPractice {
    public static void main(String[] args) {
        System.out.println("=== Практика по циклам ===\n");

        // Практика 1: Бесконечные циклы
        System.out.println("Практика 1: Бесконечные циклы while и do-while\n");

        System.out.println("Пример бесконечного while:");
        int i = 0;
        while (true) { // условие всегда истинно
            i++;
            if (i >= 5) {
               System.out.println("   Достигли 5, выходим из бесконечного цикла");
               break; // выход из цикла
            }
            System.out.println("   Шаг " + i);
        }

        System.out.println("\nПример бесконечного do-while:");
        int j = 0;
        do {
            j++;
            System.out.println("   Шаг " + j);
            if (j >= 3) {
                System.out.println("   Достигли 3, выходим");
                break;
            }
        } while (true); // условие всегда истинно

        /*
         * Бесконечные циклы возникают когда условие продолжения
         * всегда истинно. В примерах выше условие while(true)
         * и do-while(true) всегда возвращают true.
         *
         * Чтобы выйти из бесконечного цикла, используется break.
         * Без break программа будет выполняться бесконечно.
         */

        System.out.println("\n" + "=".repeat(40) + "\n");

        // Практика 2: Операторы break и continue
        System.out.println("Практика 2: Операторы break и continue\n");

        System.out.println("Пример break (выход при нахождении числа):");
        for (int k = 1; k <= 10; k++) {
            if (k == 7) {
                System.out.println("   Нашли число 7, выходим из цикла");
                break; // выход из цикла
            }
            System.out.println("   Проверяем число " + k);
        }

        System.out.println("\nПример continue (пропуск четных чисел):");
        for (int m = 1; m <= 6; m++) {
            if (m % 2 == 0) {
                continue; // пропускаем четные числа
            }
            System.out.println("   Нечетное число: " + m);
        }

        /*
         * break - немедленный выход из цикла.
         * continue - пропуск текущей итерации, переход к следующей.
         */
    }
}