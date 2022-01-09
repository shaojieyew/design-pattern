package pattern.structural.adapter;


import pattern.structural.adapter.model.ExchangeStudent;
import pattern.structural.adapter.model.Lesson;
import pattern.structural.adapter.model.Student;

public class DemoObjectAdapter {

    public static void main(String args[]){
        Student student = new Student("John");
        ExchangeStudent exchangeStudent = new ExchangeStudent("Peter");

        Lesson lesson = new Lesson();
        lesson.addStudent(student);
        ExchangeStudentAdapter exchangeStudentAdapter = new ExchangeStudentAdapter(exchangeStudent);
        lesson.addStudent(exchangeStudentAdapter);
    }


}
