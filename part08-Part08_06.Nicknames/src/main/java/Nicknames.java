
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nn = new HashMap<>();
        nn.put("matthew" , "matt");
        nn.put("michael" , "mix");
        nn.put("arthur", "artie");
        System.out.println(nn.get("matthew"));
    }

}
