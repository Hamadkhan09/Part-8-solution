import java.util.Scanner;
public class UserInterface {
    private Scanner scan ;
    private TodoList list ;

    public UserInterface(TodoList list , Scanner scan) {
        this.scan = scan;
        this.list = list;
    }
    public void start() {
        while (true) {
            System.out.println("Command:");
            String i = scan.nextLine();
            if (i.equals("stop")) {
                break;
            }
            if (i.equals("add")) {
                System.out.println("To add:");
                String t = scan.nextLine();
                this.list.add(t);
            }
            if (i.equals("list")) {
                this.list.print();
            }
            if (i.equals("remove")) {
                System.out.println("Which one is removed?");
                int p = Integer.valueOf(scan.nextLine());
                this.list.remove(p);
            }
        }
    }
}
