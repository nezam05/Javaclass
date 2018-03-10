public class getFactorial {
    public static void main(String a[]) {
        int x=Integer.parseInt(a[0]);
        int result=1;
        for (int i=1;i<=x;i++){
            result*=i;
        }
        System.out.println("factorial of "+x +" is: "+result);
    }

}