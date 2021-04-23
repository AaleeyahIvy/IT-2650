import java.util.Scanner;
class Department {
    //
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        String[][] departmentInfo = {{"Marketing", "John Carl"}, {"Design" , "Sasha Brause"}, {"Production", "Eren Yeager"}, {"Human Resources", "Armin Arlert"},{"Management", "Mikasa Ackerman"}};
        System.out.println("Please pick a department: "); //Capitalize each word!
        String department = input.nextLine();
        for(int row = 0; row < departmentInfo.length; row++) {
                if(department.equals(departmentInfo[row][0])){
                    flag = true;
                    System.out.println("Supervisor is: " + departmentInfo[row][1]);
                    break;
                }
            }
                if(!flag) {
                    System.out.println("Department Not Found!");
                }
            }
        }
