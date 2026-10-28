package model;

/*public class Trainer  extends User{
    private String assignedBatch;

    public Trainer(int id, String name, String phoneNumber, String assignedBatch) {
        super(id, name, phoneNumber);
        this.assignedBatch = assignedBatch;
    }

    public String getAssignedBatch() {
        return assignedBatch;
    }

    public void setAssignedBatch(String assignedBatch) {
        this.assignedBatch = assignedBatch;
    }
}*/
public class Trainer extends User {

    public Trainer(int userId, String name, String phoneNumber) {
        super(userId, name, phoneNumber);

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role : Trainer");
    }

}
