public class Student {
    private int grade; // Private instance variable to store the grade

    // Constructor to initialize the grade
    public Student(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }

    // Getter method to retrieve the grade
    public int getGrade() {
        return grade;
    }

    // Setter method to set the grade with validation
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }

    // Method to check if the grade is a passing Grade
    public boolean passingGrade() {
        return grade >= 40;
    }

    // Main method for testing the Student class
//    public static void main(String[] args) {
//        // Creating a student object with a valid grade
//        Student student1 = new Student(85);
//        System.out.println("Student 1 Grade: " + student1.getGrade());
//        System.out.println("Student 1 Passing: " + student1.isPassing());
//
//        // Creating a student object with an invalid grade
//        Student student2 = new Student(110); // This will print an error message
//        System.out.println("Student 2 Grade: " + student2.getGrade());
//        System.out.println("Student 2 Passing: " + student2.isPassing());
//    }
}
