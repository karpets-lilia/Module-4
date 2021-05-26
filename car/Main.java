package car;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Engine engine = new Engine(230, "diesel");
        ArrayList<Wheel> wheels = new ArrayList<Wheel>();
        for (int i = 1; i <= 4; i++) {
            Wheel newWheel = new Wheel(19);
            wheels.add(newWheel);
        }
        Car car = new Car("bmw", engine, wheels, 5);
        car.drive();
        Boolean isFuelEnough = car.checkFuelLevel();
        if (isFuelEnough == false) {
            car.addFuel(20);
        }

        ArrayList<Wheel> wheels2 = new ArrayList<Wheel>();
        for (int i = 1; i <= 4; i++) {
            Wheel newWheel = new Wheel(25);
            wheels2.add(newWheel);
        }
        car.changeWheels(wheels2);
        System.out.println(car.getModelName());
    }
}



















