package exam1;

public class SuperCar extends Car {

    @Override
    void run() {
        System.out.println("ブオーン!" + name + "が走ります");
    }
}
