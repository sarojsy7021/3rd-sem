public class Child extends Parent{
    Integer j = 10;

    void myTest(){//override
        System.out.println("Hello World from Child Class");
    }

    void childTest(){
        System.out.println("THis is child test");
    }

    Integer sum(Integer a, Integer b){
        Integer c = a;
        Integer d = b;
        return c+d;
    }

    Integer sum(Integer a, Integer b, Integer c){ //overload
        return a+b+c;
    }
}
