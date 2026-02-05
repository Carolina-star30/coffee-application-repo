public class CoffeeTest {
    public static void main(String[] args) {

    CoffeeMaker mk = new CoffeeMaker();
    DrinkCoffee drinkCoffee = new DrinkCoffee();

        for (int i = 0; i < 5; i++) {

            Coffee coffee = mk.makeCoffee();

            System.out.println("Cafeaua numarul " + (i + 1));

            try {
                drinkCoffee.drinkCoffee(coffee);
            }catch (TemperatureException e) {
                System.out.println("Exceptie T: " + e.getMessage() + " temperatura: " + e.getT());
            }catch (ConcentrationException e) {
                System.out.println("Exceptie C: " + e.getMessage() + "concentratia: " + e.getC());
            }finally {
                System.out.println("Aparatul de cafea s-a oprit");
            }


        }
    }
}
