package task1_transport.driver;

import task1_transport.Car;

public class DriverCategoryB extends Driver<Car> {
    public DriverCategoryB(String name, boolean doesHaveDriverLicense, int experience) {
        super(name, doesHaveDriverLicense, experience);
    }

    @Override
    public void startMoving(Car transport) {
        transport.startMoving();
    }

    @Override
    public void stopMoving(Car transport) {
        transport.stopMoving();
    }

    @Override
    public void refillTransport(Car transport) {
        System.out.println("Водитель " + getName() + " должен заправить автомобиль");
    }

}
