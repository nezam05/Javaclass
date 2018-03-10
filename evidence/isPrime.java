public class isPrime {
    public static void main(String a[]) {
        int x=Integer.parseInt(a[0]);
        if (x<3){
            System.out.println("Enter a number greater than 2");
        }
        else {
        for (int i=2;i<x;i++){
           if (x%i==0){
                System.out.println(x+" is not a prime number");
                break;
            }
            else {
                System.out.println(x+" is a prime number");
                break;
            }
        } 
    }
    }
}