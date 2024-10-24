public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String id;
    protected String email;

    public User(String firstName, String lastName, String id, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    
    public abstract void displayInfo();
}
