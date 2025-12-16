public class InnerClassExample {

    public static void main(String[] args) {

        // Практика №1: использование разных спецификаторов доступа
        Outer.PublicInner pubInner = new Outer().new PublicInner();
        Outer.ProtectedInner protInner = new Outer().new ProtectedInner();
        Outer.PackagePrivateInner packInner = new Outer().new PackagePrivateInner();
        // Outer.PrivateInner privInner = new Outer().new PrivateInner(); // недоступен вне Outer

        pubInner.show();  // доступно везде
        protInner.show(); // доступно в пределах пакета и подклассах
        packInner.show(); // доступно в пределах пакета

        // Практика №2: доступ внутреннего класса к полям внешнего класса
        Outer outer = new Outer();
        Outer.InnerAccess innerAccess = outer.new InnerAccess();
        innerAccess.showOuterField();

        // Практика №3: доступ внешнего класса к полям внутреннего класса
        Outer.InnerAccess inner = outer.new InnerAccess();
        outer.showInnerField(inner);
    }
}

/* Практика №1: использование разных спецификаторов доступа для внутренних классов */

class Outer {

    private int outerPrivate = 10;
    protected int outerProtected = 20;
    public int outerPublic = 30;
    int outerPackage = 40;

    // внутренние классы с разными спецификаторами
    public class PublicInner {
        void show() {
            System.out.println("PublicInner доступен везде");
        }
    }

    protected class ProtectedInner {
        void show() {
            System.out.println("ProtectedInner доступен в пределах пакета и подклассах");
        }
    }

    class PackagePrivateInner {
        void show() {
            System.out.println("PackagePrivateInner доступен только в пакете");
        }
    }

    private class PrivateInner {
        void show() {
            System.out.println("PrivateInner доступен только внутри Outer");
        }
    }

    /* Практика №2: доступ внутреннего класса к полям и методам внешнего класса */

    public class InnerAccess {
        void showOuterField() {
            // внутренний класс имеет доступ к любым полям внешнего класса,
            // даже private
            System.out.println("outerPrivate = " + outerPrivate);
            System.out.println("outerProtected = " + outerProtected);
            System.out.println("outerPublic = " + outerPublic);
            System.out.println("outerPackage = " + outerPackage);
        }
    }

    /* Практика №3: доступ внешнего класса к полям и методам внутреннего класса */
    void showInnerField(InnerAccess inner) {
        // внешний класс имеет доступ ко всем полям и методам внутреннего класса,
        // даже если они private
        System.out.println("Вызов метода внутреннего класса из внешнего:");
        inner.showOuterField();
    }
}
