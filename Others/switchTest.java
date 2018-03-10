public class switchTest {
    public static void main(String a[]) {
        int ch=-10;
        switch (ch) {
            case 1:
                ch++;
                break;
            case 2: ch++; break;
            default:ch++;
            case 3: ch++; break;
            case 4: ch++;
                break;
        }
        System.out.println(ch);
    }
}