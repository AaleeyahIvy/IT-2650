public class TestJobApplicant {
    public static void main(String[] args) {
    JobApplicant app1 = new JobApplicant("Ally Peach", "330-330-3300", true, true, false, true);
    app1.hasSkills();
    app1.isQualified();
    
    JobApplicant app2 = new JobApplicant("Bjorn Green", "440-440-4400", false, true, true, true);
    app2.hasSkills();
    app2.isQualified();
    
    JobApplicant app3 = new JobApplicant("Solita Kolyski", "110-110-1100", true, true, false, false);
    app3.hasSkills();
    app3.isQualified();
    
    }
}