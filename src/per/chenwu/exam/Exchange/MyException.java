package per.chenwu.exam.Exchange;

/**
 * 自定义异常
 * @Author  chenwu
 * @date  2019年8月5日
 */
public class MyException extends Exception{
    public MyException(String ErrorMessage){
        super(ErrorMessage);
    }
}

class Test{
    static int avg(int a , int b) throws MyException{
        if(a<0||b<0){
            throw new MyException("太小了");
        }
        if( a>100||b>100){
            throw  new MyException("太大了");
        }
        return (a+b)/2;
    }

    public static void main(String[] args) {
        try {
            avg(12,134);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
