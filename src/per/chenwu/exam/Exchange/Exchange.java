package per.chenwu.exam.Exchange;

public class Exchange {

    /**
     *
     * @param str
     * @return
     */
    public static String function(String str){
        if(str==""||str==null){
            return "";
        }else{
            String  b = "";
            for( int len=str.length(); len>0; len--){
                b = b+str.substring(len-1,len);
            }
            return b;

        }
    }


    public static int  fun(int N){
        if(N==1){
            return 1;
        }else if(N==2){
            return 2;
        }else
            return fun(N-1)+fun(N-2);
    }

    public static void main(String[] args) {
        int n = fun(5);
        System.out.println(n);
    }
}
