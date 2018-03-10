public class Identifier_test {
    int a;
    int b;
    String s="test";

    Identifier_test(){
    a=5;
    b=6;
}

Identifier_test(int p,int q){
    a=p;
    b=q;
}
    public static void main(String arg[]) {
        Identifier_test x=new Identifier_test(5,-9);
        System.out.println("Result is "+(x.a+x.b));
    }
}