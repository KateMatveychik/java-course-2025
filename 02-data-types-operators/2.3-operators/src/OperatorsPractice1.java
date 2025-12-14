public class OperatorsPractice1 {
    public static void main(String[] args) {
        // 1. АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ (+, -, *, /, %)
        System.out.println("1. Арифметические операторы:");
        int a = 15;
        int b = 4;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b) + "  (сложение)");
        System.out.println("a - b = " + (a - b) + "  (вычитание)");
        System.out.println("a * b = " + (a * b) + "  (умножение)");
        System.out.println("a / b = " + (a / b) + "  (деление, целая часть)");
        System.out.println("a % b = " + (a % b) + "  (остаток от деления)");

        // 2. ОПЕРАТОРЫ ПРИСВАИВАНИЯ (=, +=, -=, *=, /=, %=)
        System.out.println("\n2. Операторы присваивания:");
        int x = 10;
        System.out.println("Начальное x = " + x);

        x += 5; // x = x + 5
        System.out.println("x += 5  -> x = " + x);

        x -= 3; // x = x - 3
        System.out.println("x -= 3  -> x = " + x);

        x *= 2; // x = x * 2
        System.out.println("x *= 2  -> x = " + x);

        x /= 4; // x = x / 4
        System.out.println("x /= 4  -> x = " + x);

        x %= 3; // x = x % 3
        System.out.println("x %= 3  -> x = " + x);

        // 3. ОПЕРАТОРЫ ++ и -- (префиксная и постфиксная форма)
        System.out.println("\n3. Операторы ++ и --:");
        int count = 5;
        System.out.println("Начальное count = " + count);

        // Постфиксный инкремент: сначала значение, потом увеличение
        System.out.println("count++ = " + (count++));
        System.out.println("После count++ значение count = " + count);

        // Префиксный инкремент: сначала увеличение, потом значение
        System.out.println("++count = " + (++count));
        System.out.println("После ++count значение count = " + count);

        // Постфиксный декремент
        System.out.println("count-- = " + (count--));
        System.out.println("После count-- значение count = " + count);

        // Префиксный декремент
        System.out.println("--count = " + (--count));

        // 4. ОПЕРАТОРЫ СРАВНЕНИЯ (==, !=, >, <, >=, <=)
        System.out.println("\n4. Операторы сравнения:");
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 > num2  : " + (num1 > num2));
        System.out.println("num1 < num2  : " + (num1 < num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));

        // 5. ЛОГИЧЕСКИЕ ОПЕРАТОРЫ (&&, ||, !)
        System.out.println("\n5. Логические операторы:");
        boolean isSunny = true;
        boolean isWarm = false;
        System.out.println("isSunny = " + isSunny + ", isWarm = " + isWarm);
        System.out.println("isSunny && isWarm : " + (isSunny && isWarm));
        System.out.println("isSunny || isWarm : " + (isSunny || isWarm));
        System.out.println("!isSunny : " + (!isSunny));

        // 6. ПОБИТОВЫЕ ОПЕРАТОРЫ (&, |, ^, ~)
        System.out.println("\n6. Побитовые операторы:");
        int bit1 = 6;  // 0110 в двоичной
        int bit2 = 3;  // 0011 в двоичной
        System.out.println("bit1 = " + bit1 + " (0110), bit2 = " + bit2 + " (0011)");
        System.out.println("bit1 & bit2 = " + (bit1 & bit2) + " (0110 & 0011 = 0010 = 2)");
        System.out.println("bit1 | bit2 = " + (bit1 | bit2) + " (0110 | 0011 = 0111 = 7)");
        System.out.println("bit1 ^ bit2 = " + (bit1 ^ bit2) + " (0110 ^ 0011 = 0101 = 5)");
        System.out.println("~bit1 = " + (~bit1));

        // 7. ОПЕРАТОРЫ СДВИГА (<<, >>, >>>)
        System.out.println("\n7. Операторы сдвига:");
        int number = 8; // 00001000 в двоичной
        System.out.println("number = " + number + " (00001000)");
        System.out.println("number << 1 = " + (number << 1) + " (сдвиг влево, 00010000 = 16)");
        System.out.println("number >> 1 = " + (number >> 1) + " (сдвиг вправо, 00000100 = 4)");

        // 8. ОПЕРАТОРЫ ДЛЯ STRING (+, +=)
        System.out.println("\n8. Операторы для String:");

        // Оператор + для конкатенации строк
        String hello = "Здравствуй";
        String world = "мир";
        String greeting = hello + ", " + world + "!";
        System.out.println("\"" + hello + "\" + \", \" + \"" + world + "\" + \"!\" = \"" + greeting + "\"");

        // Оператор += для String
        String text = "Я";
        text += " изучаю";
        text += " Java";
        System.out.println("text += ... = \"" + text + "\"");

        // Конкатенация String с разными типами
        String name = "Name";
        int age = 20;
        double grade = 4.5;
        boolean bool = true;

        String studentInfo = name + ", возраст: " + a +
                ", средний балл: " + b +
                ", студент: " + bool;
        System.out.println("\nКонкатенация разных типов:");
        System.out.println(studentInfo);

        // 9. ОПЕРАТОРЫ == и != С ОБЪЕКТАМИ
        System.out.println("\n9. Операторы == и != с объектами String:");
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("str1 = \"" + str1 + "\", str2 = \"" + str2 +
                "\", str3 = new String(\"" + str3 + "\")");
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));

        // 10. ТЕРНАРНЫЙ ОПЕРАТОР ?:
        System.out.println("\n10. Тернарный оператор ? :");
        int temperature = 25;
        String weatherType = (temperature > 20) ? "тепло" : "прохладно";
        System.out.println("Температура " + temperature + " -> " + weatherType);

        // 11. ПРИОРИТЕТ ОПЕРАТОРОВ
        System.out.println("\n11. Приоритет операторов:");
        int result1 = 2 + 3 * 4;
        int result2 = (2 + 3) * 4;
        System.out.println("2 + 3 * 4 = " + result1 + " (сначала умножение)");
        System.out.println("(2 + 3) * 4 = " + result2 + " (сначала скобки)");

        //2. ОПЕРАТОР [] - доступ к элементу массива
        System.out.println("\n2. Оператор [] - доступ к элементу массива:");

        // Создаем массив
        int[] numbers = {10, 20, 30, 40, 50};

        // Доступ к элементам массива по индексу
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[4] = " + numbers[4]);


        System.out.println("Все примеры выполнены!");
    }
}