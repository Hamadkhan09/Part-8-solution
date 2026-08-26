public class Container {
    private int amount ;

   
    public void add(int t ) {
        if (t>0) {
            this.amount = this.amount + t ;
        if (this.amount>100) {
            this.amount=100;
        }
        }

    }
    public void move(int t) {
        this.amount = this.amount - t ;
        if (this.amount<=0) {
            this.amount= 0 ;
        }
    }
    public void remove(int t) {
        if (t>0) {
            this.amount = this.amount - t ;
        if (this.amount<=0) {
            this.amount= 0 ;
        }
        }
    }
    public int contains(){
        return this.amount;
    }
    public String toString() {
        return this.amount+"/100" ;    }

}

