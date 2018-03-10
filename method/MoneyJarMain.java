
public class MoneyJarMain {
    public static void main(String arg[]) {
        MoneyJar m = new MoneyJar();
        m.setTarget(100);

        System.out.println("Amount: " + m.getAmount());
        System.out.println("Target: " + m.getTarget());
        System.out.println("SumReturn " + m.takeOut(600));
        System.out.println(m.amount+"\t"+m.surplus);
    }

}
