public class forTest {
    class delta{
        static boolean foo(char c){
            System.out.println(c);
            return true;
        }
    }
    public static void main(String a[]) {
        //int i=0;
        forTest n = new forTest();
        for (int i = 1; i < 4; i++) {
            if (i < 2)
                continue;
            System.out.println(i);
        }

        int x=10;
        while (x<=10){
            x--;
            System.out.println(x);
        }
        
        

    }

}