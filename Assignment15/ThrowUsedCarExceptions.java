public class ThrowUsedCarExceptions {
    public static void main(String[] args) {
        UsedCar[] usedCar = new UsedCar[7];
        try {
            usedCar[0] = new UsedCar("1234", "Ford", 1993, 100000, 23000);
        }
        catch(UsedCarException e){ 
            System.out.println(e.getMessage());
        }
        try {
            usedCar[1] = new UsedCar("3400", "Kia", 1193, 1000, 20);
        }
        catch(UsedCarException e){
            System.out.println(e.getMessage());
        }
        try {
            usedCar[2] = new UsedCar("351", "Honda", 2004, 15000, -1000);
        }
        catch(UsedCarException e){
            System.out.println(e.getMessage());
        }
        try {
            usedCar[3] = new UsedCar("0293", "Toyota", 2002, 23888, 13999);
        }
        catch(UsedCarException e){
            System.out.println(e.getMessage());
        }
        try {
            usedCar[4] = new UsedCar("367", "Jeep", 2016, -129434, 14999);
        }
        catch(UsedCarException e){
            System.out.println(e.getMessage());
        }
        try{
            usedCar[5] = new UsedCar("2222", "Other", 1999, 7000, 699);
        }
        catch(UsedCarException e){
            System.out.println(e.getMessage());
        }
        try{
            usedCar[6] = new UsedCar("1111", "Other", 2020, 6090, 1300);
        }
        catch(UsedCarException e){
            System.out.println(e.getMessage());
        }
        for(int i = 0; i < usedCar.length; i++){
            if(usedCar[i]!=null)
                System.out.println( usedCar[i].toString() + " Identification Completed! ");
        }
    }

}
