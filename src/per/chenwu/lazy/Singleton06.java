package per.chenwu.lazy;

/**
 * 在内部类加载和初始化时，才创建instance对象
 * 静态内部类不会自动随着外部类的加载和初始化而初始化，它是要单独去加载和初始化地
 * 因为是在内部类加载和初始化时创建的，所以线程安全
 */
public class Singleton06 {

    private Singleton06(){}

    private static class Inner{
        private static   Singleton06 instance = new Singleton06();
    }
    public static Singleton06 getInstance(){
        return Inner.instance;
    }

}
