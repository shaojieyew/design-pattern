package pattern.structural.adapter;

import pattern.structural.adapter.model.ExchangeStudent;
import pattern.structural.adapter.model.Lesson;
import pattern.structural.adapter.model.Student;

public class LessonAdapter extends Lesson {

    public void addStudent(ExchangeStudent exchangeStudent){
        Student student = new Student();
        student.setName(exchangeStudent.getName());
        students.add(student);
    }

}
