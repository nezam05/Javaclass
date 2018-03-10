public class addition {
    public static void main(String arg[]){
        //int a = Integer.parseInt(arg[i]);
        int sum = 0;
        for ( int i = 0; i <arg.length; ++i){
            int a = Integer.parseInt(arg[i]);
            if (a >= 0){       
                sum += a;
                System.out.println(sum);
            }
            else if(a < 0) {
                sum += a;
            System.out.println("enter a value greater than 0 \n"+"Sum of the value entered: "+sum);
                break;   
            
            
            }     
        }
        //System.out.println(sum);
    }
}
