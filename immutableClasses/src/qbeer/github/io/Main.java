package qbeer.github.io;

public class Main {

    public static void main(String[] args) {
	    Complex reOne = new Complex(1.,0.);
	    Complex imOne = new Complex(0., 1.);
	    Complex oneOne = new Complex(.1, .1);
	    Complex multi = reOne.times(imOne);

        System.out.println("Real one: " + reOne.toString());
        System.out.println("Imaginary one: " + imOne.toString());
        System.out.println("\tTheir multiplied value: " + multi.toString());

        for(int i=0; i < 10; i++) {
            System.out.println("z**2 + z: " + oneOne);
            Complex z = new Complex(oneOne);
            Complex zSquared = new Complex(oneOne.times(oneOne));
            oneOne = new Complex(zSquared.plus(z));
        }

        Vehicle vehicle = new Vehicle(12.3f, "miles", "gallons");
        System.out.println(vehicle);

        Car car = new Car.CarBuilder()
                .fuelConsumption(6.7f)
                .distanceUnit("kilometers")
                .volumeUnit("liters")
                .color("pink").build();

        System.out.println(car);

    }
}
