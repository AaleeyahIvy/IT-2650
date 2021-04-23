import java.util.Scanner;
class BirthdayReminder {
    public static void main(String[] args) {
        final int size = 10;
        int namecount = 0;
        String sentinel = "ZZZ";
        String name =  null;
        String birthday = null;
        String[] names =  new String[size];
        String[] birthdates =  new String[size];
        Scanner input = new Scanner(System.in);
        while(namecount < 10) {
            System.out.println("Enter name or ZZZ to end: ");
            name = input.nextLine();
            if(name.equals(sentinel)|| namecount == 10){
                break;
            }
            System.out.println("Enter birthdate, and use format dd/mm/yyyy (please include /slashes/): ");
            birthday =  input.nextLine();
            birthdates[namecount] = birthday;
            names[namecount] = name;
            namecount ++;
            }
        System.out.println("Count of names: " + namecount);
        boolean ifFound = false;
        for(int i = 0; i < namecount; i++) {
            System.out.println("Please type a name: ");
            name = input.nextLine();
            if(name.equals(sentinel)){
                break;
            }
                if(names[i].equals(name)){
                    birthday = birthdates[i];
                    ifFound = true;
                }
                if(ifFound) {
                    System.out.println("Name: " + name + " Date of Birth: " + birthday);
                    input.close();
                }
                else {
                    System.out.println("Name not found!");
                }
            }
        }
    }