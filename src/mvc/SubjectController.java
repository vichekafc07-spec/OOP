package mvc;

public class SubjectController {
    private Subject subject;
    private SubjectView subjectView;

    public SubjectController(Subject subject, SubjectView subjectView) {
        this.subject = subject;
        this.subjectView = subjectView;
    }

    public void setId(int id){
        this.subject.setId(id);
    }

    public int getId(){
        return this.subject.getId();
    }

    public void setName(String name){
        this.subject.setSubjectName(name);
    }

    public String getName(){
        return this.subject.getSubjectName();
    }

    public void setType(String type){
        this.subject.setSubjectType(type);
    }

    public String getType(){
        return this.subject.getSubjectType();
    }

    public void setPrice(float price){
        this.subject.setPrice(price);
    }

    public float getFloat(){
        return this.subject.getPrice();
    }

    public void updateView(int id, String subjectName, String subjectType, float price){
        subjectView.updateView(id,subjectName,subjectType,price);
    }

    public void updateView(Subject subject){
        subjectView.updateView(subject);
    }

}
