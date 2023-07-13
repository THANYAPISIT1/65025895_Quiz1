public class StudentDetails {
    private String name;
    private int ID;
    private int admissionYear;
    private double GPA;
    
    public StudentDetails(String name, int ID, int admissionYear, double GPA) {
        this.name = name;
        this.ID = ID;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public int getAdmissionYear() {
        return admissionYear;
    }
    
    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }
    
    public double getGPA() {
        return GPA;
    }
    
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    public static void main(String[] args) {
        
        StudentDetails student = new StudentDetails("Thanyapisit Ketmanee", 65025895, 65, 3.2);
        
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Admission Year: " + student.getAdmissionYear());
        System.out.println("GPA: " + student.getGPA());

    }
}