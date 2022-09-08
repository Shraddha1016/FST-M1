public class Activity1 {

    public static void main(String[] args) {
        Car santro = new Car();
        santro.make = 2014;
        santro.color = "Black";
        santro.transmission = "Manual";
        santro.displayCharacterstics();
        santro.accelerate();
        santro.brake();
    }

}