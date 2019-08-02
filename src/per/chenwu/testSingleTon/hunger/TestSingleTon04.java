package per.chenwu.testSingleTon.hunger;

import per.chenwu.lazy.Singleton04;

import java.util.concurrent.*;

public class TestSingleTon04 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 单线程时
        /*Singleton04 s1 = Singleton04.getINSTANCE();
        Singleton04 s2 = Singleton04.getINSTANCE();
        System.out.println(s1==s2);*/

        //多线程时,存在线程安全问题
        Callable<Singleton04> c = new Callable<Singleton04>() {
            @Override
            public Singleton04 call() throws Exception {
                return Singleton04.getINSTANCE();
            }
        };
        // 创建一个线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton04> submit1 = es.submit(c);
        Future<Singleton04> submit2 = es.submit(c);
        Singleton04 s1 = submit1.get();
        Singleton04 s2 = submit2.get();
        System.out.println(s1==s2);
    }
}
