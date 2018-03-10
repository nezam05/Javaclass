/**
 * multipleException
 */
public class multipleException {
    public static void main(String[] args) {
    int x[]={1,2,3,4,5};
    try {
        //System.out.println("x[6]"+x[6]);
        System.out.println("x[3]: "+x[3]);
        //x[3]=30/0;
        //String a= null;
        // if (a.equals("ggg")){
        //     System.out.println("Same");
        // }
        // else {
        //     System.out.println("Not Same");
        // }
    } catch (ArithmeticException ae) {
        System.out.println("Arithmetic Exception");
    }
    catch (ArrayIndexOutOfBoundsException oe){
        System.out.println("not in index");
    }
    catch(NullPointerException ie){
       System.out.println("Null Pointer Exception error");
   }
    catch (Exception ex){
        System.out.println("Exception super class");
    }
    finally {
        System.out.println("it will be printed always");
    }
}
    
}