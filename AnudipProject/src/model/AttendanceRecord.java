package model;
/*import java.time.LocalDate;
import java.time.LocalTime;
public class AttendanceRecord {
    private int studentId;
    private LocalDate sessionDate;
    private boolean present;

    public AttendanceRecord(int studentId, LocalDate sessionDate, boolean present) {
        this.studentId = studentId;
        this.sessionDate = sessionDate;
        this.present = present;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
    public void displayStatus()
    {
        if(present)
            System.out.println("Present");
        else
            System.out.println("Absent");
    }


}*/

import java.time.LocalDate;

public class AttendanceRecord {

    private int studentId;
    private int batchId;
    private LocalDate sessionDate;
    private AttendanceStatus status;



    public AttendanceRecord(int studentId, int batchId, LocalDate sessionDate, AttendanceStatus status) {
        this.studentId = studentId;
        this.batchId = batchId;
        this.sessionDate = sessionDate;
        this.status = status;
    }



    public void displayAttendance() {
        System.out.println("Student Id : " + studentId);
        System.out.println("Batch Id   : " + batchId);
        System.out.println("SessionDate: " + sessionDate);
        System.out.println("Status     : " + status);
    }



    public int getStudentId() {
        return studentId;
    }



    public int getBatchId() {
        return batchId;
    }



    public LocalDate getSessionDate() {
        return sessionDate;
    }



    public AttendanceStatus getStatus() {
        return status;
    }

}
