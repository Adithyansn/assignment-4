// Custom exception for age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range (15 to 21)");
        }

        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name not valid (should not contain numbers or special characters)");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student info
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    // Main method for testing
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Ravi Kumar", 19, "B.Tech");
            s1.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Student s2 = new Student(2, "Anjali123", 18, "B.Sc");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
