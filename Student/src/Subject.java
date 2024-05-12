public class Subject {
    private String sub1,sub2,sub3,sub4;
    public Subject(String sub1,String sub2,String sub3,String sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }

    public String getSub1() {
        return this.sub1;
    }

    public String getSub2() {
        return this.sub2;
    }

    public String getSub3() {
        return this.sub3;
    }

    public String getSub4() {
        return this.sub4;
    }
    public String toString(){
        return("Subject1 => "+sub1+" Subject 2=> "+sub2+" Subject3 => "+sub3+" Subject 4=> "+sub4);
    }
}
