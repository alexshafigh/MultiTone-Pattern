import MultiTone.MultitoneClass;
import SingleTone.Car;

public class main {
    public static void main(String[] args) {


        Car bmw = MultitoneClass.getInstance("BMW");
        Car benz = MultitoneClass.getInstance("BENZ");
        Car hyundai = MultitoneClass.getInstance("Hyundai");

        Car i8 = MultitoneClass.getInstance("BMW");

        System.out.println(bmw.toString());
        System.out.println(i8.toString());

    }
}
