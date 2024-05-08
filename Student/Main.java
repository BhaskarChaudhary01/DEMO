public class Main {
    public static void main(String[] args) {

        //Student detail
        Student stu=new Student("Bhaskar",23,045);
        System.out.println(stu.getName());
        System.out.println( stu.getAge());
        System.out.println( stu.getRollno());
        System.out.println( stu.toString());

        //class detail
        studentclass stc=new studentclass();
        stc.setStandard(12);
        stc.setSection('A');
        System.out.println(stc.getStandard());
        System.out.println(stc.getSection());
        System.out.println(stc.toString());


        //Subject detail
        Subject sub=new Subject("CS1","CS2","CS3","CS4");

        System.out.println(sub.getSub1());
        System.out.println(sub.getSub2());
        System.out.println(sub.getSub3());
        System.out.println(sub.getSub4());
        System.out.println( sub.toString());

    }
}