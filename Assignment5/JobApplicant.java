/*Create a class that holds data about a job applicant. 
Include a name, a phone number, and four Boolean fields that represent whether the applicant is skilled in each of the following areas: 
word processing, spreadsheets, databases, and graphics. Include a constructor that accepts values for each of the fields.
 Also include a get method for each field. 
 Create an application that instantiates several job applicant objects and pass each in turn to a Boolean method that determines 
 whether each applicant is qualified for an interview. Then, in the  main() method, display an appropriate method for each applicant. 
 A qualified applicant has at least three of the four skills. Save the files as  JobApplicant.java and  TestJobApplicants.java.
Due Date 2/22*/

public class JobApplicant {
    String name;
    String number;
    boolean wordProcessing;
    boolean spreadsheets;
    boolean databases;
    boolean graphics;
    public int isTrue;

    public JobApplicant(String name, String number, Boolean wordProcessing, Boolean spreadsheets, Boolean databases,
            Boolean graphics) {
        this.name = name;
        this.number = number;
        this.wordProcessing = wordProcessing;
        this.spreadsheets = spreadsheets;
        this.databases = databases;
        this.graphics = graphics;
    }
    public Boolean getWordProcessing() {
        return wordProcessing;
    }
    public Boolean getSpreadsheets() {
        return spreadsheets;
    }
    public Boolean getDatabases() {
        return databases;
    }
    public Boolean getGraphics() {
        return graphics;
    }

    public void hasSkills() {
        if (wordProcessing == true) {
            isTrue++;
        }
        else {
            System.out.println("Doesn't acquire Word Processing skills");
        }
        if (spreadsheets == true) {
            isTrue++;
        }
        else {
            System.out.println("Doesn't acquire Spreadsheet skills");
        }
        if (databases == true) {
            isTrue++;
        }
        else {
            System.out.println("Doesn't acquire Database skills");
        }
        if (graphics == true) {
            isTrue++;
        }
        else {
            System.out.println("Doesn't acquire Graphic skills");
        }
    }
    public void isQualified(){ /*This may be unnecessary*/
        if(isTrue >=3){
            System.out.println("Applicant is Qualified!");
        }
        else {
            System.out.println("Applicant is not Qualified!");
        }
    }
}
