import java.util.ArrayList;

public class Admin extends User {
    private ArrayList<Mentor> mentors;
    private ArrayList<Occurrence> occurrences;

    public Admin(String firstName, String lastName, String id, String email) {
        super(firstName, lastName, id, email);
        this.mentors = new ArrayList<>();
        this.occurrences = new ArrayList<>();
    }

    public void assignPenalty(Mentor mentor, int penaltyPoints) {
        mentor.addPenaltyPoints(penaltyPoints);
        System.out.println("Assigned " + penaltyPoints + " points to " + mentor.getFullName());
    }

    public void reviewOccurrence(Occurrence occurrence) {
        this.occurrences.add(occurrence);
        System.out.println("Admin reviewed occurrence: " + occurrence.getDescription());
    }

    public void viewMentorProfile(Mentor mentor) {
        mentor.displayInfo();
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Admin Profile: " + getFullName());
    }
}
