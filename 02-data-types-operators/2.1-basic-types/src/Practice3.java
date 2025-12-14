public class Practice3 {
    public static void main(String[] args) {
        System.out.println("ОШИБКА КОМПИЛЯЦИИ: переменная b не найдена");
        System.out.println("\nПричина: b объявлена внутри блока {} и не видна за его пределами");

        // Этот код НЕ скомпилируется:
        // int a = 1;
        //{
        //  int b = 2;
        //}
        //int c = a + b; // ОШИБКА: b не существует здесь
    }
}