import java.util.*;
public class Tom {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if((n > 19) & (n < 31)) {
            if (n % 2 == 0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");


        }
    }
}
