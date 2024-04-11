package Java8;


@FunctionalInterface
interface DemoInteface{
    public void mnk();
    public static void def(){
        System.out.println("static");
    }
    public default void abc(){
        System.out.println("abc");
    }
}

class ClassDemo implements DemoInteface{

    @Override
    public void mnk() {

    }


}
public class Solution {
    public static void main(String []args){
        DemoInteface.def();

    }
}
