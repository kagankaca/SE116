import java.util.ArrayList;

public class Station {
    private String stationID;
    private int maxCapacity;
    private boolean multiFlag;
    private boolean fifoFlag;
    private double stationSpeed;
    private ArrayList<TaskTypeSpeedReeder> TaskTypeSpeedReeders = new ArrayList<>();

    public Station(String stationID, int maxCapacity, boolean multiFlag, boolean fifoFlag, ArrayList<TaskTypeSpeedReeder>TaskTypeSpeedReeders,double stationSpeed) {
        this.stationID = stationID;
        this.maxCapacity = maxCapacity;
        this.multiFlag = multiFlag;
        this.fifoFlag = fifoFlag;
        this.TaskTypeSpeedReeders =TaskTypeSpeedReeders;
        this.stationSpeed = stationSpeed;
    }

    public Station(String stationID, int maxCapacity, boolean multiFlag, boolean fifoFlag, ArrayList<TaskTypeSpeedReeder> TaskTypeSpeedReeders) {
        this.stationID = stationID;
        this.maxCapacity = maxCapacity;
        this.multiFlag = multiFlag;
        this.fifoFlag = fifoFlag;
        this.TaskTypeSpeedReeders=TaskTypeSpeedReeders;
        this.stationSpeed = 1.0;
    }



    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isMultiFlag() {
        return multiFlag;
    }

    public void setMultiFlag(boolean multiFlag) {
        this.multiFlag = multiFlag;
    }

    public boolean isFifoFlag() {
        return fifoFlag;
    }

    public void setFifoFlag(boolean fifoFlag) {
        this.fifoFlag = fifoFlag;
    }

    public double getStationSpeed() {
        return stationSpeed;
    }

    public void setStationSpeed(int stationSpeed) {
        this.stationSpeed = stationSpeed;
    }


    public void removeTask() {

    }

    public boolean canHandleTask(TaskType task) {
        // Assume this method checks if the station can handle the given task type
        return true;
    }

    public double getUtilization() {
        // Assume this method calculates station utilization
        return 0;
    }
}
