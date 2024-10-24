public class Main {
    public static void main(String[] args) {
        // Example of setting up a mentor and an admin
        Mentor mentor = new Mentor("John", "Doe", "12345", "john.doe@auburn.edu", "Computer Science", "May 2025");
        Admin admin = new Admin("Admin", "Smith", "54321", "admin@auburn.edu");

        // Mentor submits an occurrence
        Occurrence occ = new Occurrence("Disruptive Student", "Student was constantly disruptive", "Negative", "CSSE 3200", "2024-10-24");
        mentor.submitOccurrence(occ);
        
        // Admin reviews the occurrence
        admin.reviewOccurrence(occ);

        // Admin checks mentor profile and penalty points
        admin.assignPenalty(mentor, -5);
        admin.viewMentorProfile(mentor);

        // Mentor notification
        Notification notification = new Notification(mentor, "You have a new assignment.");
        mentor.receiveNotification(notification);
    }
}
