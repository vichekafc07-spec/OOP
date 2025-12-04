package mvc;

public class Subject {
    // define attribute, based on table's columns
    private int id;
    private String subjectName;
    private String subjectType;
    private float price;

    public Subject() {
        this.id = 0;
        this.subjectName = "No subject";
        this.subjectType = "Not Configured";
        this.price = 0.0f;
    }

    public Subject(int id, String subjectName, String subjectType, float price) {
        this.id = id;
        this.subjectName = subjectName;
        this.subjectType = subjectType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
