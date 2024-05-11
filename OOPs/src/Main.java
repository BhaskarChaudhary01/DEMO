public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AreaOfShapes ar=new AreaOfShapes();
        System.out.println("area of square =>"+ar.area(12));
        System.out.println("area of circle =>"+ar.area(2.3f));
        System.out.println("area of rectangle =>"+ar.area(4,5));
        System.out.println("area of triangle =>"+ar.area(2.5f,3.5f));
    }
}