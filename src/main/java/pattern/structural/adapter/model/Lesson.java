package pattern.structural.adapter.model;

import java.util.List;

public class Lesson {

    protected List<Student> students;

    public Lesson(){
    }

    public void addStudent(Student student){
        students.add(student);
    }

}
