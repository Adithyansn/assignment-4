import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Integer> grades;

    public StudentGrades() {
        grades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        grades.put(name, grade);
        System.out.println("Added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println(name + "'s grade: " + grades.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();

        sg.addStudent("Alice", 90);
        sg.addStudent("Bob", 85);

        sg.displayGrade("Alice");

        sg.removeStudent("Bob");
        sg.displayGrade("Bob");
    }
}
