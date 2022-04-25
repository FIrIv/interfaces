package test.skypro;

public class Main {
    public static void main(String[] args) {

        Car [] cars = new Car[]
                {new Car("car1", 4),
                        new Car("car2", 4)};
        Truck [] trucks = new Truck[]
                {new Truck("truck1", 6),
                        new Truck("truck2", 8)};
        Bicycle [] bicycles = new Bicycle[]
                {new Bicycle("bicycle1", 2),
                        new Bicycle("bicycle2", 2)};

        ServiceStation station = new ServiceStation();

        for (int i=0; i< cars.length; i++) {
            station.check(cars[i]);
        }

        for (int i=0; i< trucks.length; i++) {
            station.check(trucks[i]);
        }

        for (int i=0; i< bicycles.length; i++) {
            station.check(bicycles[i]);
        }
    }
}