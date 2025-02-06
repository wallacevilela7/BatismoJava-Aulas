package wvs.ninja.mission;

public class Mission {
    private String missionName;
    private char level;
    private String status;

    public Mission() {
    }

    public Mission(String missionName, char level, String status) {
        this.missionName = missionName;
        this.level = level;
        this.status = status;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}