package complex;

public class Complex implements ComplexOperation{
    private double real; // 实部
    private double imaginary; // 虚部

    // 构造函数
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Complex add(Complex c) {
        return new Complex(this.real +c.real,this.imaginary+c.imaginary);
    }

    @Override
    public Complex subtract(Complex c) {
        return new Complex(this.real-c.real,this.imaginary-this.imaginary);
    }

    @Override
    public Complex multiply(Complex c) {
        double realPart = this.real * c.real - this.imaginary * c.imaginary;
        double imaginaryPart = this.real * c.imaginary + this.imaginary * c.real;
        return new Complex(realPart,imaginaryPart);
    }

    @Override
    public Complex division(Complex c) {
        double denominator = c.real * c.real + c.imaginary * c.imaginary;
        double realPart = (this.real * c.real + this.imaginary * c.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * c.real - this.real * c.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return real+"+"+imaginary+"i";
    }
}
