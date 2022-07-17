package ss4_class_and_object_in_java.BT.project_stop_watch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void startTime() {
        startTime = new Date();
    }

    public void stopTime() {
        endTime = new Date();
    }

    public double getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

}
