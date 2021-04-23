public class UsedCar {
    String vin;
    String make;
    int year;
    int mileage;
    int price;
    public UsedCar (String vin, String make, int year, int mileage, int price) throws UsedCarException {
        if(vin.length() != 4){
            throw new UsedCarException(vin);
        }
        if(!(make.equals("Toyota") || make.equals("Honda") || make.equals("Ford") || make.equals("Other"))){
            throw new UsedCarException(vin);
        }
        if(year < 1990 && year > 2014){
            throw new UsedCarException(vin);
        }
        if(mileage < 0 ){
            throw new UsedCarException(vin);
        }
        if(price < 0){
            throw new UsedCarException(vin);
        }
        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage =  mileage;
        this.price = price;
    }
    @Override public String toString(){
        return "Vin: " + vin + " Make: " + make + " Year: " + year + " Mileage: " + mileage + " Price $: " + price;
    }
}
