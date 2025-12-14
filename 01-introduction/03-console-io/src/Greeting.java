import java.util.Scanner;  // Импортируем Scanner для ввода

public class Greeting{
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с клавиатуры
        Scanner scan = new Scanner(System.in);

        // Просим пользователя ввести имя
        System.out.print("Пожалуйста, введите ваше имя: ");

        // Читаем введенную строку (до пробела или переноса строки)
        String name = scan.next();

        // Выводим приветствие
        System.out.println("Привет, " + name + "!");

        // Закрываем Scanner
        scan.close();
    }
}