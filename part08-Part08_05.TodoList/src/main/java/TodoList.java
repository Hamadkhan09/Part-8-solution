import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> s ;

    public TodoList() {
        this.s = new ArrayList<>();
    }
    public void add (String task) {
        this.s.add(task);
    }
    public void print() {
        int n =0 ;
        for ( int i = 0 ; i<this.s.size() ; i++) {
            n = i + 1;
            System.out.println(n+": "+this.s.get(i));
        }
    }
    public void remove(int number) {
        int i = 0 ;
        i =  number - 1 ;
        if (i<0) {
            this.s.remove(0);
        }
        else  {
            this.s.remove(i);
        }
        
    } 
}
