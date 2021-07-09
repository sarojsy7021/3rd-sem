public class Demo {
    public static void main(String args[]) {
        System.out.println("Hello World");
        Parent parent = new Parent();
        parent.myTest();
        parent.sum(1,2);
        Child child = new Child();
        child.myTest();
        child.secondTest();
        child.childTest();
        child.i = 10;
        System.out.println("child.i = " + child.i);
        Integer d = child.sum(2,3);
        System.out.println("d = " + d);
        Integer e = child.sum(1,2,3);
        System.out.println("e = " + e);
    }
}
