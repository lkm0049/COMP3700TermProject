public class Notification {
    private Mentor mentor;
    private String message;
    private String method; // Email or SMS

    public Notification(Mentor mentor, String message) {
        this.mentor = mentor;
        this.message = message;
        this.method = "Email"; // Default method
    }

    public String getMessage() {
        return message;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void sendNotification() {
        System.out.println("Sending notification to " + mentor.getFullName() + " via " + method);
    }
}
