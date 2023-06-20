package Design.Pattern.Factory;

abstract class Vehicle {
    public abstract int getwheel();

    @Override
    public String toString() {
        return "wheel:" + this.getwheel();
    }
}

class car extends Vehicle {
    int wheel;

    car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getwheel() {
        return this.wheel;
    }
}

class bike extends Vehicle {
    int wheel;

    bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getwheel() {
        return this.wheel;
    }
}

class VehicleFactory {
    public static Vehicle getInstance(String type, int wheel) {
        if (type == "car") {
            return new car(wheel);

        } else if (type == "bike") {
            return new bike(wheel);
        }
        return null;
    }
}

public class Factorypatterexample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);

    }
}
