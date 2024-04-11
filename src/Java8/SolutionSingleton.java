package Java8;

public class SolutionSingleton {
    private static SolutionSingleton singleton;

    private SolutionSingleton(){

    }

    public static SolutionSingleton getInstance(){
        if(singleton==null){
            synchronized (SolutionSingleton.class) {
                singleton = new SolutionSingleton();
            }
        }

        return singleton;
    }
}
