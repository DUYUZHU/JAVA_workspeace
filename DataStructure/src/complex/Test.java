package complex;

public class Test {
    public static void main(String[] args) {
        Complex c1 =new Complex(4,5);
        Complex c2 =new Complex(2,3);

        Complex sum=c1.add(c2);
        Complex difference =c1.subtract(c2);
        Complex product =c1.multiply(c2);
        Complex quotient =c1.division(c2);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
