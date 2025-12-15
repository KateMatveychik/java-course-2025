public class FinalInitExample {
    public static void main(String[] args) {
        System.out.println("Способы инициализации final поля 'a':\n");

        // 1. При объявлении
        System.out.println("1. При объявлении:");
        class A1 {
            public final int a = 10;
        }
        System.out.println("   public final int a = 10;");

        // 2. В конструкторе
        System.out.println("\n2. В конструкторе:");
        class A2 {
            public final int a;
            A2() {
                a = 20; // инициализация без this
            }
        }
        System.out.println("   Конструктор: a = значение;");
        System.out.println("   Или с this: this.a = значение;");

        // 3. В блоке инициализации
        System.out.println("\n3. В блоке инициализации:");
        class A3 {
            public final int a;
            {
                a = 30; // блок инициализации
            }
        }
        System.out.println("   { a = значение; }");

        // 4. С параметром конструктора
        System.out.println("\n4. С параметром конструктора:");
        class A4 {
            public final int a;
            A4(int value) {
                this.a = value; // с this
            }
        }
        System.out.println("   this.a = параметр;");

        /*
         * final поле должно быть инициализировано ДО завершения конструктора.
         * Можно использовать:
         * 1. При объявлении: public final int a = 10;
         * 2. В конструкторе: a = 20 (если нет локальной переменной с именем a); или this.a = 20 (явно указывает на поле класса);
         * 3. В блоке инициализации: { a = 30; }
         */
    }
}