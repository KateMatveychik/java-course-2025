import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        /*
         * Практика №1
         * Использование instanceof с параметризованными классами
         */

        Wrapper<Integer> intWrapper = new Wrapper<>(10);
        Wrapper<String> strWrapper = new Wrapper<>("Hello");

        // Проверить Wrapper<Integer> или Wrapper<String> напрямую НЕЛЬЗЯ
        if (intWrapper instanceof Wrapper) {
            System.out.println("intWrapper является экземпляром Wrapper");
        }

        if (strWrapper instanceof Wrapper) {
            System.out.println("strWrapper является экземпляром Wrapper");
        }

        /*
         * Так писать не имеет смысла:
         * if (intWrapper instanceof Wrapper<Integer>) (параметр <Integer> игнорируется)
         *
         * Причина:
         * Во время выполнения информация о параметрах generic-типа
         * стирается, и JVM "не знает", какой именно тип
         * использовался вместо T.
         *
         * Поэтому instanceof можно применять только к типу Wrapper.
         */


        /*
         * Практика №2
         * Использование <? extends T> и <? super T>
         */

        // ? extends T — только читаем
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        List<? extends Number> numbersExtends = intList;

        Number n = numbersExtends.get(0); // читать можно
        System.out.println("Чтение из ? extends Number: " + n);

        // numbersExtends.add(30); // ошибкаи компиляции
        /*
         * Добавлять элементы нельзя, потому что компилятор не знает,
         * какой именно подкласс Number используется (Integer, Double и т.д.)
         */


        // ? super T — можно писать
        List<Number> numberList = new ArrayList<>();
        List<? super Integer> numbersSuper = numberList;

        numbersSuper.add(5);    // можно
        numbersSuper.add(100);  // можно

        Object obj = numbersSuper.get(0); // читать можно только как Object
        System.out.println("Чтение из ? super Integer: " + obj);

        /*
         * Зачем нужны extends и super:
         *
         * ? extends T:
         * - используется, когда нужно только читать данные
         * - гарантирует, что элементы являются T или его наследниками
         *
         * ? super T:
         * - используется, когда нужно только записывать данные
         * - гарантирует, что можно безопасно добавить T
         */
    }
}

/*
 * Простой параметризованный класс-обертка
 */
class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
