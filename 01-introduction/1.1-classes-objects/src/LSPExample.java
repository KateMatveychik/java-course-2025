public class LSPExample {
    public static void main(String[] args) {
        System.out.println("=== Пример принципа подстановки Лисков ===\n");

        // Создаем фигуры, но используем общий тип Shape
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        // Демонстрация LSP: мы используем rectangle и circle как Shape
        System.out.println("1. Прямоугольник 5x10:");
        Shape.printArea(rectangle);  // Можно передать Rectangle

        System.out.println("\n2. Круг радиусом 7:");
        Shape.printArea(circle);     // Можно передать Circle

        System.out.println("\nLSP соблюден!");
        System.out.println("Мы можем использовать Rectangle и Circle\nвезде, где ожидается Shape");
    }
}