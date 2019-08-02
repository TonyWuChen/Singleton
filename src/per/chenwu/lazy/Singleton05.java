package per.chenwu.lazy;

/**
 * 懒汉式：
 *   延迟创建这个实例对向
 *
 * (1) 构建器私有化
 * （2） 用一个静态变量保存唯一实例
 * （3） 提供一个静态方法，获取这个实例对像
 */
public class Singleton05 {
    private static Singleton05 INSTANCE;
    private Singleton05(){}
    public static Singleton05 getINSTANCE(){
        // 添加同步锁，确保线程安全
        synchronized (Singleton05.class){
            if(INSTANCE==null){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton05();
            }
            return INSTANCE;
        }
    }
}