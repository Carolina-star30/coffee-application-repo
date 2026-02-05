public class TemperatureException extends Exception {

    //proprietati
    int t;

    //constructorul
    public TemperatureException(int t, String msg) {
        super(msg);
        this.t = t;
    }

    public int getT() {
        return t;
    }


}
