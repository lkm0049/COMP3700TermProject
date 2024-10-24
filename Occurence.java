public class Occurrence {
    private String title;
    private String description;
    private String type;  // Positive or Negative
    private String subject;
    private String date;
    private String status;  // Pending or Closed

    public Occurrence(String title, String description, String type, String subject, String date) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.subject = subject;
        this.date = date;
        this.status = "Pending";
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void closeOccurrence() {
        this.status = "Closed";
    }
}
