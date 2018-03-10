public class MethodVoid {
    int a=5;
    int b=6;
    String s="test";

  /*  MethodVoid(){
    a=5;
    b=6;
    }

    MethodVoid(int p,int q){
    a=p;
    b=q;
    }
    */
   void add(){
        int sum=a+b;
        System.out.println(sum);
       // return sum;
    }
    public static void main(String arg[]) {
        MethodVoid x=new MethodVoid();
        x.add();
    }
}