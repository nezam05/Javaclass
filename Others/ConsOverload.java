public class ConsOverload{
    int a=5;
    int b=4;
    
    int add(){
        int sum=a+b;
        return sum;
    }
    ConsOverload(){
        a=10;
        b=12;
    }
    ConsOverload(int m,int n){
        a=m;
        b=n;
    }

 public static void main(String arg[]) {
     ConsOverload x=new ConsOverload();
     int y=x.add();
     System.out.println(y);
     
 
    // what: overloading with parameter
    ConsOverload p=new ConsOverload(20,30);
    int q=p.add();
    System.out.println(q);
 }
}