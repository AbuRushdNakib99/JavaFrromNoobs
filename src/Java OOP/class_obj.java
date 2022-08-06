package oops;

class Student {
    //    data: data members:instance variable
    int studentId;
    String studentName;
    String studentCity;

//    Behaviour: Member methods:methods(function)

    public void study() {
        System.out.println(studentName + " is studying");
    }

    public void ShowFullDetails() {
        System.out.println("My name is " + studentName);
        System.out.println("My Id is " + studentId);
        System.out.println("My City is " + studentCity);
    }

}

public class class_obj{
    public static void main(String[] args) {
        Student st1=new Student();
        st1.studentName="Abu Rushd Nakib";
        st1.studentId=123;
        st1.studentCity="Chittagong";

        st1.study();
        st1.ShowFullDetails();

        Student st2=new Student();
        st2.studentName="Rakib";
        st2.studentId=456;
        st2.studentCity="Dhaka";

        st2.study();
        st2.ShowFullDetails();
    }
}