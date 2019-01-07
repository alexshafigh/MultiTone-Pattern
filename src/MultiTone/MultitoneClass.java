package MultiTone;

import SingleTone.Car;

import java.util.HashMap;
import java.util.Map;

public class MultitoneClass {
    final static Map<String, Car> classMap = new HashMap<>();

    private MultitoneClass() { //constructor
//        classMap = null;
    }

    public static Car getInstance(String key) {
        if (classMap.containsKey(key)) {
            System.out.printf("%s Exists \n ", key);
            return classMap.get(key);
        } else {
            Car car = new Car();
            System.out.printf(" Insert a new %s car \n", key);
            classMap.put(key, car);
            return car;
        }
    }
}
