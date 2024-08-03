package javalibraries.Equals;

public class car2 {
    String brand = "Aulto";

    public static void main(String[] args) {
        car2 c = new car2();
        car2 c1 = new car2();
        System.out.println(c.equals(c1));
    }

    public boolean equals(Object b) {
        Object c = (Object) b;
        return this.brand.equals(brand);
    }
}
