import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge397 {

    // M, D, C, L, X, V, I
    // 1000, 500, 100, 50, 10, 5, 1
    private List<String> order = Arrays.asList("M", "D", "C", "L", "X", "V", "I");
    private Map<String, String> cheatSheet = new HashMap<>() {{ put("M", "DD");put("D", "CCCCC"); put("C", "LL"); put("L", "XXXXX"); put("X", "VV"); put("V", "IIIII"); }};



    public boolean numcompare(String a, String b) {
        return getNum(a) < getNum(b);
    }

    private int getNum(String s) {
        int i=0;
        s = s.toUpperCase();

        for(String c: s.split("")) {
            if(cheatSheet.get(c) != null) {
                i += getNum(cheatSheet.get(c));
            } else {
                i += 1;
            }
        }

        return i;
    }


}