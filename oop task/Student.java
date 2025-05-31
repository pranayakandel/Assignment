public class Student {
    private String name;
    private String idNumber;
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // getter
    public String getName() {
        return name;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public double getGpa() {
        return gpa;
    }

    public void studentinfo(){
        System.out.println("Student Name: " + getName());
        System.out.println("Student Id: " + getIdNumber());
        System.out.println("GPA: " + getGpa());
    }    
}

class StudentDriver{
    public static void main(String[] args) {
        Student s1 = new Student(3.31);
        s1.setName("Simran");
        s1.setIdNumber("240751");

        s1.studentinfo();

    }
}