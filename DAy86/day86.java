class Triangle {
    void triangleType() {
        System.out.println("I am a triangle");
    }
}

class Isosceles extends Triangle {
    void isoscelesType() {
        System.out.println("I am an isosceles triangle");
    }
}

class Equilateral extends Isosceles {
    void equilateralType() {
        System.out.println("I am an equilateral triangle");
    }
}

public class day86 {
    public static void main(String[] args) {
        Equilateral eq = new Equilateral();
        eq.equilateralType();
        eq.isoscelesType();
        eq.triangleType();
    }
}
