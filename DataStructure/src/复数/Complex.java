package 复数;
public interface Complex {
    // 返回复数的实部
    double getReal();

    // 返回复数的虚部
    double getImag();

    // 返回当前复数与复数c2相加的结果
    Complex add(Complex c2);

    // 显示复数的形式
    void display();
}
