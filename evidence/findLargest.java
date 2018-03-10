public class findLargest {
    public static void main(String arg[]) {
        int x0=Integer.parseInt(arg[0]);
        int x1=Integer.parseInt(arg[1]);
        int x2=Integer.parseInt(arg[2]);
      if (x0>x1 && x0>x2){
          System.out.println(x0+" is largest");
      }
      else if (x1>x2){
          System.out.println(x1+" is largest");
      }
      else {
          System.out.println(x2+" is largest");
        }

    }
}