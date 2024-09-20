package DarkHouse;

public class Rabbit extends Animal {  //子类
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");   //重写父类
    }
}
