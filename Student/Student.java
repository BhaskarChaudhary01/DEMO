public class Student {
    private String name;
    private int age;
    private int rollno;
    public Student(String name,int age,int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getRollno(){
        return this.rollno;
    }
    public String toString(){
        return ("Name=> "+this.name+" age=> "+this.age+" rollno=> "+this.rollno);
    }
}
