public class array{
    public static void main(String arg[]) {
        int b[]=new int[] {1,2,3,4,5,10};
        
        int sum=0;
       /*
        for (int i=0;i<b.length;i++){
            sum=sum+b[i];
        }
        System.out.println(sum);
        */
        for (int i:b){
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
}