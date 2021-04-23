public class UsedCarException extends Exception {
    public UsedCarException(String vin){
        super("Complications with VIN: " + vin);
    }
}
