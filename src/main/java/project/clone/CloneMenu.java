package project.clone;

public class CloneMenu {
    public static void main(String[] args) {
        Course science = new Course("Physics", "Chemistry", "Biology");
        Student student1 = new Student(111, "John", science);
        Student student2 = null;

        try {
            student2 = (Student) student1.clone();
        }
        catch (CloneNotSupportedException e) {
            System.err.println("We have some problems with: " + e);
        }

        System.out.println(student1.course.subject3);         //Output : Biology
        if (student2 != null) {
            student2.course.subject3 = "Maths";
        }
        System.out.println(student1.course.subject3);       //Output : Maths
    }
}