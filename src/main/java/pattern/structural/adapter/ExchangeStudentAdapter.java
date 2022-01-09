package pattern.structural.adapter;

import pattern.structural.adapter.model.ExchangeStudent;
import pattern.structural.adapter.model.Student;

public class ExchangeStudentAdapter extends Student {

    public ExchangeStudentAdapter(ExchangeStudent exchangeStudent){
        super();
        this.name = exchangeStudent.getName();
    }


}
