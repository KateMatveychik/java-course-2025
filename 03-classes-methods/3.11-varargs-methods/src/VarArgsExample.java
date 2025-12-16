public class VarArgsExample {

    public static void main(String[] args) {

        // Вызов метода с int...
        print(1, 2, 3);

        // Вызов перегруженного метода с String...
        print("Hello", "Java", "World");

        // Вызов перегруженного метода с одним параметром
        print(10);

        // Вызов метода без параметров
        print();
    }

    /*
     * Метод с переменным числом параметров типа int
     * Все переданные значения внутри метода представляют собой массив int[]
     */
    public static void print(int... numbers) {
        System.out.println("print(int...)");
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    /*
     * Перегруженный метод с переменным числом параметров типа String
     * Отличается типом параметров
     */
    public static void print(String... strings) {
        System.out.println("print(String...)");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    /*
     * Перегруженный метод с одним параметром
     * Будет вызван, если передан ровно один int
     */
    public static void print(int number) {
        System.out.println("print(int)");
        System.out.println(number);
    }

    /*
     * Метод без параметров
     * Фактически эквивалентен вызову print(int...) с пустым массивом
     */
    public static void print() {
        System.out.println("print()");
    }
}
