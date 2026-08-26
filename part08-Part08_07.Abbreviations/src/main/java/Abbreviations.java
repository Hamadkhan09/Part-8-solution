import java.util.HashMap;

public class Abbreviations {
    private HashMap< String , String> n ; 
    private String abbrevaition ;
    private String explanation ;

    public Abbreviations(){
        this.n = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation , String explanation ) {
        this.n.put(abbreviation ,explanation);
    }
    public boolean hasAbbreviation(String abbreviation) {
        if (this.n.containsKey(abbreviation)) {
            return true;
        } else {
            return false ;
        }
    }
    public String findExplanationFor(String abbrerviation ) {
        if (this.n.containsKey(abbrerviation)) {
           return this.n.get(abbrerviation) ;
        } 
        return null ;
    }
        
}
