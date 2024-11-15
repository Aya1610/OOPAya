package AlleThemen.Collection;

import java.util.*;

public class erzeugeIndex {
    public static Map<Character, Collection<String>> erzeugeIndex (String []woerter) {
        Map<Character,Collection<String>>gefügt= new HashMap<>();
        for (int i = 0; i <woerter.length ; i++) {
            char ersteBuchstabe=woerter[i].charAt(0);
            if (!gefügt.keySet().contains(ersteBuchstabe)) {
                gefügt.put(ersteBuchstabe, new HashSet<>());
            }
            gefügt.get(ersteBuchstabe).add(woerter[i]);

        }return gefügt;


    }
}
