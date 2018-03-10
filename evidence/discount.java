public class discount {
    public static void main(String arg[]) {
       double a=0;
        double s=Double.parseDouble(arg[0]);
        double d=0;
        
        if (s>1000){
            d=(s*0.25);
            a=s+d;
            System.out.println("Total payment "+a);
        }
        else if(s>=700){
            d=s*0.2;
            a=s+d;
            System.out.println("Total payment "+a);
        }
        else if(s>=300){
            d=s*0.15;
            a=s+d;
            System.out.println("Total payment "+a);
        }
        else if (s>=100){
            d=s*0.1;
            a=s+d;
            System.out.println("Total payment "+a);
        }
        else {
            System.out.println("No discount \n"+ "Total Payment: "+s);
        }
    }

}