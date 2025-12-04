package mvc;

public class SubjectView {
    public void updateView(int id, String subjectName, String subjectType, float price){
        System.out.println("Id :" + id);
        System.out.println("Name :" + subjectName);
        System.out.println("Type :" + subjectType);
        System.out.println("Price :$" + price);
    }
    public void updateView(Subject subject){
        System.out.println("Id :" + subject.getId());
        System.out.println("Name :" + subject.getSubjectName());
        System.out.println("Type :" + subject.getSubjectType());
        System.out.println("Price :$" + subject.getPrice());
    }
}