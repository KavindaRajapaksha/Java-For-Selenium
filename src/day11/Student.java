package day11;

public class Student {
    int sid;
    String name;
    char grad;
    void studentData(){

        System.out.println("student id:"+sid+",Student name: "+name+",and grade"+grad);
    }
    Student(int id,String sname,char grade){
        sid=id;
        name=sname;
        grad=grade;

    }
//    Student(){
//        sid=1;
//        name="kavinda";
//        grad=g;
//
//    }


}
