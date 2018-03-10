public class MoneyJar {
    String purpose;
    double amount = 500;
    double target;
    double surplus;

    void add(double sum) {
        amount = amount + sum;
        surplus = amount - target;
        System.out.println(amount+"\t"+surplus);
    }

    double takeOut(double sum) {
        double sumReturned = 0;
        if (amount >= sum) {
            amount = amount - sum;
            sumReturned = sum;
        } else {
            sumReturned = amount;
            amount = 0;
        }
        surplus = amount - target;
        return sumReturned;
    }

    double getAmount() {
        return amount;
    }

    void setTarget(double newTarget) {
        target = newTarget;
        surplus = amount - target;
    }

    double getTarget() {
        return target;
    }
}