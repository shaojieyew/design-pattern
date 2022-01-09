package pattern.structural.adapter;


import pattern.structural.adapter.model.ExchangeStudent;
import pattern.structural.adapter.model.Student;

public class DemoClassAdapter {

    public static void main(String args[]){
        Student student = new Student("John");
        ExchangeStudent exchangeStudent = new ExchangeStudent("Peter");

        LessonAdapter lessonAdapter = new LessonAdapter();
        lessonAdapter.addStudent(student);
        lessonAdapter.addStudent(exchangeStudent);
    }


}
