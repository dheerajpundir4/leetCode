package Java8;

public class MainClass {

    public static void main(String []args){
        SolutionSingleton singleton=SolutionSingleton.getInstance();
        SolutionSingleton singleton2=SolutionSingleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton2);
    }

}
