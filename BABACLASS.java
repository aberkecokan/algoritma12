package classlar;

public class BABACLASS {

    public static void main(String[] args) {
        F x = new F();
        x.gül();
        x.ciz();

    }

}

abstract class A {

    abstract void yaz();
}

class C extends A {

    void yaz() {
        System.out.println("yaz");
    }

    void agla() {
        System.out.println("ağla");
    }
}

class B {

    void ciz() {
        System.out.println("çiz");
    }
}

class E extends B {

    C b = new C();

    void gül() {
        System.out.println("gül");
    }
}

class F extends E {

    C a = new C();

    void bul() {
        System.out.println("bul");
    }
}
