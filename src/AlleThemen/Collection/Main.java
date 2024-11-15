package AlleThemen.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


   String[]worter={"aya","nour","sara","nansi"};
    Map<Character,Collection<String>>neugefügt=erzeugeIndex.erzeugeIndex(worter);
        System.out.println(neugefügt);

}
}