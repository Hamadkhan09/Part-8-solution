
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        Container container = new Container();

        while (true) {
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] s = input.split(" ");
            String p1 = s[0];
            int p2 = Integer.valueOf(s[1]);
            if (p1.equals("add")) {
                first.add(p2);
            }
            if (p1.equals("remove")) {
                second.remove(p2);
            }
            if (p1.equals("move")) {
                
                if(first.contains()>=p2) {
                    second.add(p2);
                    first.remove(p2);
                } else {
                    second.add(first.contains());
                    first.remove(first.contains());
                }
                
            }
        }
    }

}
