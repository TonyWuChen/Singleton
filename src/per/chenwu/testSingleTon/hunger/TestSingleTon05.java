package per.chenwu.testSingleTon.hunger;
import per.chenwu.lazy.Singleton05;
import java.util.concurrent.*;

public class TestSingleTon05 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 单线程时
        /*Singleton05 s1 = Singleton05.getINSTANCE();
        Singleton05 s2 = Singleton05.getINSTANCE();
        System.out.println(s1==s2);*/

        //多线程时，加入线程锁时，确保线程安全
        Callable<Singleton05> c = new Callable<Singleton05>() {
            @Override
            public Singleton05 call() throws Exception {
                return Singleton05.getINSTANCE();
            }
        };
        // 创建一个线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton05> submit1 = es.submit(c);
        Future<Singleton05> submit2 = es.submit(c);
        Singleton05 s1 = submit1.get();
        Singleton05 s2 = submit2.get();
        System.out.println(s1==s2);
    }
}
