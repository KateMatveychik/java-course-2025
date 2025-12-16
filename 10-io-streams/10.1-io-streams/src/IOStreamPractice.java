import java.io.*;

public class IOStreamPractice {

    public static void main(String[] args) {

        /* Практика №1
         *
         * Пример использования FileInputStream (подкласс InputStream) и метода read().
         * read() читает следующий байт из потока и возвращает его как int.
         */
        try (InputStream in = new FileInputStream("input.txt")) {
            int data = in.read(); // читает первый байт из файла
            System.out.println("Прочитан первый байт: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* Практика №2
         *
         * Пример использования FileOutputStream (подкласс OutputStream) и метода write(int).
         * write(int) записывает один байт в поток.
         */
        try (OutputStream out = new FileOutputStream("output.txt")) {
            out.write(65); // записывает байт с кодом 65 (символ 'A')
            System.out.println("Записан байт 65 ('A') в файл output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* Практика №3
         *
         * Reader и Writer — это символьные потоки.
         * Они нужны для удобной работы с текстовыми данными (символы, строки),
         * в то время как InputStream/OutputStream работают с байтами.
         * Например, FileReader и FileWriter автоматически учитывают кодировку.
         */

        /* Практика №4
         *
         * Интерфейс AutoCloseable нужен, чтобы объект мог автоматически закрываться
         * при использовании try-with-resources. Даже если возникнет исключение,
         * метод close() будет вызван.
         * Пример:
         */
        try (MyResource res = new MyResource()) {
            res.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Класс, реализующий AutoCloseable
class MyResource implements AutoCloseable {

    public void doSomething() {
        System.out.println("Выполняем работу с ресурсом");
    }

    @Override
    public void close() {
        System.out.println("Ресурс автоматически закрыт");
    }
}
