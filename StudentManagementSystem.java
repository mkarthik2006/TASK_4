class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;

        // Validate name
        if (name.matches(".*[0-9].*") || name.matches(".*[!@#$%^&*()_+].*")) {
            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }
        this.name = name;

        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        this.age = age;

        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(7108, "Karthik", 18, "Computer Science");
            System.out.println(student1);

            Student student2 = new Student(7109, "Vijay", 18, "Hotel Management"); // Invalid name
            System.out.println(student2);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}