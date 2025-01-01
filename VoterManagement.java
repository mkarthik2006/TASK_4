class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter: " + name);
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class VoterManagement {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1234, "Karthik", 32);
            System.out.println(voter1);

            Voter voter2 = new Voter(4321, "Vijay", 16); // Invalid age
            System.out.println(voter2);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}