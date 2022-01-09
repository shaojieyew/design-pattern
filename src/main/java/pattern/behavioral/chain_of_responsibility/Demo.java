package pattern.behavioral.chain_of_responsibility;


public class Demo {

    public static void main(String args[]){


        Service1 service1 = new Service1();
        Service2 service2 = new Service2();
        Service3 service3 = new Service3();
        service3.setNext(service2);
        service2.setNext(service1);


        for(int i = 0 ; i< 100; i++){

            service3.service(new Request(i));
        }

    }

}
