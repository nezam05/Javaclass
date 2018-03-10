import java.util.Date;

public class Student {
    public int sId;
    public String sName;
    public String batch;
    public Date dob;

    public Student() {
        this(123, "Jahir", "WPSI");
        dob = new Date();
    }

    public Student(int sId, String sName, String batch, Date dob) {
        this.sId = sId;
        this.sName = sName;
        this.batch = batch;
        this.dob = dob;
    }

    public Student(int sId, String sName, String batch) {
        this.sId = sId;
        this.sName = sName;
        this.batch = batch;
    }

    public static void main(String a[]) {
        //Student s=new Student(); // this refer to constructor above
        Student s = new Student(456, "Jalal", "GAVE"); //using data in constructor invocation
        System.out.println("Student id: " + s.sId + "\nStudnet Name: " + s.sName + "\nBatch Name: " + s.batch
                + "\nDate of Birth: " + s.dob);
    }
}
