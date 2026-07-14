package model;

public class RaceState {
    private String leaderName = "";
    private int leaderDistance = 0;
    private final int raceDuration = 24;

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public int getLeaderDistance() {
        return leaderDistance;
    }

    public void setLeaderDistance(int leaderDistance) {
        this.leaderDistance = leaderDistance;
    }

    public int getRaceDuration() {
        return raceDuration;
    }
}
