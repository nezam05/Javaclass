public class Test{

    int add(int x,int y){
        return (x+y);
    }
    float add(int x,float y){
        return (x+y);
    }
    String add(String x,float y,int z){
        return (x+y+z);
    }
    float add(float x,int y){
        return (x+y);
    }
    public static void main(String a[]) {
        Test t=new Test();
        System.out.println(t.add("number is ", 100.0f,123));
        System.out.println(t.add(12,100.0f));
        System.out.println(t.add(15,100));
    }
}