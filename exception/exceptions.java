/**
 * exceptions
 */
public class exceptions {

    public static void main(String[] args) {
        try {
            int sum=0;
            int ariterror=0;
            for (int i = 0; i < args.length; i++) {
                sum+=Integer.parseInt(args[i]);
                ariterror=sum/Integer.parseInt(args[i]);
            }
            
            System.out.println("Sum= "+sum);
            } catch (NumberFormatException nfe) {
            System.err.println("One of the command-line argument is not an integer");
        }
        catch (ArithmeticException nfe){
            System.err.println("Can't divide by Zero");
        }
    }
}