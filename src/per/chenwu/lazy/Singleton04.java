package per.chenwu.lazy;

/**
 * 懒汉式：
 *   延迟创建这个实例对向
 *
 * (1) 构建器私有化
 * （2） 用一个静态变量保存唯一实例
 * （3） 提供一个静态方法，获取这个实例对像
 */
public class Singleton04 {
    private static Singleton04 INSTANCE;
    private Singleton04(){}
    public static Singleton04 getINSTANCE(){
        if(INSTANCE==null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }
}
