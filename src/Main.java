import java.util.*;

public class Main {
    public static final Random ran = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int san = 0;
        for (int i = 0; i < 400; i++) {
            int san1 =ran.nextInt(0, 20);
           list.add(san1);
            san += san1;
        }
            System.out.println( list.size()+" + "+list);
            System.out.println("="+san);

        HashSet<Integer> hashSet = new HashSet<>(list);
        int san2 = 0;
        for (int i = 0; i < hashSet.size(); i++) {
            san2+=i;
            System.out.print(san2+" ");
        }
        }
}



