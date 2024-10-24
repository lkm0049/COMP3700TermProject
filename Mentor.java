import java.util.ArrayList;

public class Mentor extends User {
    private String subjectExpertise;
    private String graduationDate;
    private ArrayList<Occurrence> occurrences;
    private ArrayList<Notification> notifications;
    private int penaltyPoints;

    public Mentor(String firstName, String lastName, String id, String email, String subjectExpertise, String graduationDate) {
        super(firstName, lastName, id, email);
        this.subjectExpertise = subjectExpertise;
        this.graduationDate = graduationDate;
        this.occurrences = new ArrayList<>();
        this.notifications = new ArrayList<>();
        this.penaltyPoints = 0;
    }

    public void submitOccurrence(Occurrence occurrence) {
        this.occurrences.add(occurrence);
        System.out.println("Occurrence submitted: " + occurrence.getDescription());
    }

    public void receiveNotification(Notification notification) {
        this.notifications.add(notification);
        System.out.println("Notification received: " + notification.getMessage());
    }

    public int getPenaltyPoints() {
        return penaltyPoints;
    }

    public void addPenaltyPoints(int points) {
        this.penaltyPoints += points;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mentor Profile: " + getFullName());
        System.out.println("Subject Expertise: " + subjectExpertise);
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Penalty Points: " + penaltyPoints);
    }
}
