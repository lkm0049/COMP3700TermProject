import java.util.HashMap;

public class PenaltySystem {
    private HashMap<Integer, String> actionThresholds;

    public PenaltySystem() {
        actionThresholds = new HashMap<>();
        actionThresholds.put(-5, "Verbal Warning");
        actionThresholds.put(-10, "Written Warning");
        actionThresholds.put(-20, "Termination of rehiring process");
    }

    public void checkPenalties(Mentor mentor) {
        int points = mentor.getPenaltyPoints();
        if (actionThresholds.containsKey(points)) {
            System.out.println("Action Required for " + mentor.getFullName() + ": " + actionThresholds.get(points));
        }
    }
}
