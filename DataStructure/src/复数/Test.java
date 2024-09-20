package 复数;

import java.util.Scanner;

public class Test{
        private double real;
        private double imag;
        public Test(){
            this.real = 0.0;
            this.imag = 0.0;
        }
public Test(double r,double i){
                this.real = r;
                this.imag = i;
        }
                public Test add(Test c2){
                    return new Test(this.real+c2.real,
                            this.imag+c2.imag);
        }
                    public void display(){
                        System.out.println(this.real + "," + this.imag);
                    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        Test c1 = new Test(r1,i1);
        Test c2 = new Test(r2,i2);

        Test sum = c1.add(c2);
        sum.display(); // 输出：3.5 + 5.5i
    }
        }
