public class Practice4 {
    public static void main(String[] args) {
        // Примеры использования оператора + с String и разными типами

        String text = "Результат: ";
        int number = 42;
        double decimal = 3.14;
        boolean flag = true;
        char letter = 'A';

        // Все типы автоматически преобразуются в String
        System.out.println(text + number);        // String + int
        System.out.println(text + decimal);       // String + double
        System.out.println(text + flag);          // String + boolean
        System.out.println(text + letter);        // String + char
        System.out.println(number + " " + decimal); // int + String + double
    }
}