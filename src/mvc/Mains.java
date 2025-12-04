package mvc;

public class Mains{
    public static void main(String[] args) {
        // declare model object
        var subject = new Subject();
        subject.setId(101);
        subject.setSubjectName("Rangkrol City");
        subject.setSubjectType("History");
        subject.setPrice(100);

        // declare view object
        var subjectView = new SubjectView();

        // declare controller object
        SubjectController subjectController = new SubjectController(subject,subjectView);
//        subjectView.updateView(subject.getId(),subject.getSubjectName(),subject.getSubjectType(),subject.getPrice());
        subjectView.updateView(subject);
    }
}