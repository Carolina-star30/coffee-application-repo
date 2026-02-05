public class DrinkCoffee {
//void nu returneaza nimic
    void drinkCoffee(Coffee coffee) throws TemperatureException, ConcentrationException {
        if (coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Temperatura cafelei e prea mare!");
        }
        else {
            System.out.println("t: " + coffee.getTemp());
            System.out.println("Serviti cu placere");
        }

        if (coffee.getConc() > 55) {
            throw new ConcentrationException(coffee.getTemp(), "Concentratia cafelei e prea mare!");
        }
        else {
            System.out.println("c: " + coffee.getConc());
            System.out.println("Serviti cu placere");
        }
    }
}
