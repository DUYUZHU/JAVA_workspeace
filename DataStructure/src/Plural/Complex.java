package Plural;

public class Complex {
    private double real;//实数
    private double imag;//虚数
    public Complex(){   //无参构造
        this.real = 0.0;
        this.imag = 0.0;
    }
    public Complex(double r,double i){   //有参构造
        this.real = r;
        this.imag = i;
    }
    public Complex add(Complex c2){  //相加
        return new Complex(this.real + c2.real,this.imag + c2.imag);
    }
    public void display(){   //显示
        System.out.println(this.real + "," + this.imag);
    }
}
