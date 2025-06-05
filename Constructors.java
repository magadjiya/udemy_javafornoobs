/**
 * This class demonstrates the use of constructors, encapsulation, and property methods in Java.
 * It defines a UserProfile class with private fields and provides methods to access and modify these fields.
 * The main method creates instances of UserProfile and demonstrates the use of these methods.
 */

class UserProfile {
    private String username;
    private String email;
    private int age;

    // Constructor to initialize the fields
    public UserProfile(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    // Getters for the fields
    // These methods allow read access to the private fields
    // They do not allow modification, ensuring encapsulation
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    
    // Setters for the fields aka property methods
    // These methods allow modification of the private fields
    // They include validation to ensure the integrity of the data
    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        } else {
            this.email = email;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    // Override toString method for better representation and debugging
    @Override
    public String toString() {
        return "UserProfile{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Create 2 user profiles
        UserProfile user1 = new UserProfile("army_luv", "ary@ary.com", 23);
        UserProfile user2 = new UserProfile("schwaznigga09", "arnold@sch.com", 19);

        // Print the user profiles
        System.out.println("User 1: " + user1.getUsername() + ", Email: " + user1.getEmail() + ", Age: " + user1.getAge());
        System.out.println("User 2: " + user2.getUsername() + ", Email: " + user2.getEmail() + ", Age: " + user2.getAge());

        // Update user1's email and age (setting new values)
        user1.setEmail("army@yahoo.com");
        user1.setAge(24);

        // Print the updated user profile
        System.out.println("Updated User 1: " + user1.getUsername() + ", Email: " + user1.getEmail() + ", Age: " + user1.getAge());
        
        
        // Attempt to set invalid values to demonstrate error handling
        try {
            user2.setUsername(""); // Invalid username
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            user2.setEmail("invalid-email"); // Invalid email
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}