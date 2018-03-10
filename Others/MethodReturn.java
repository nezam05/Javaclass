public class MethodReturn {
    int a=5;
    int b=6;
    String s="test";

  /*  MethodReturn(){
    a=5;
    b=6;
    }

    MethodReturn(int p,int q){
    a=p;
    b=q;
    }
    */
   int add(){
        int sum=a+b;
        return sum;
    }
    public static void main(String arg[]) {
        MethodReturn x=new MethodReturn();
        //int y= x.add();  //gives same result
        //System.out.println(y);
        System.out.println(x.add());
    }
}