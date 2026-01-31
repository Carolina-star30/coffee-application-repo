public class Coffee {
    //props
    private int temp;//variabila
    private int conc;

    //constructor(initializator)
    public  Coffee(int t, int c) {//c e parametru
        temp = t;
        conc = c;
    }

    //getters
    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }

    //toString


    @Override
    public String toString() {
        return "Coffee{" +
                "temperature =" + temp +
                ", concentration =" + conc +
                '}';
    }
}
