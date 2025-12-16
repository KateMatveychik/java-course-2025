import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        /* Практика №1
         * Пример чтения данных из текстового файла с помощью Scanner.
         */
        try {
            File file = new File("input.txt"); // текстовый файл input.txt
            Scanner scanner = new Scanner(file);

            System.out.println("Содержимое файла:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // читаем одну строку
                System.out.println(line);
            }

            scanner.close(); // закрываем Scanner
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
