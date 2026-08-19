import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> s = new HashSet<>();
        
        for(String i:cards) {
            s.add(i);
        }
        return s;
    }

    static boolean addCard(String card, Set<String> collection) {
        if(!collection.contains(card)) {
            collection.add(card);
            return true;
        }
        return false;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean ok1 = false, ok2 = false;
        for(String i:myCollection) {
            ok1 |= addCard(i,theirCollection);
        }
        for(String i:theirCollection) {
            ok2 |= addCard(i,myCollection);
        }
        return ok1 && ok2;
    }

    static Set<String> commonCards(List<Set<String>> l) {
        Set<String> s = new HashSet<String>();

        for(String i:l.get(0)) {
            int cont=0;
            for(Set<String> j:l) {
                if(j.contains(i))
                    cont++;
            }
            if(cont == l.size())
                s.add(i);
        }

        return s;
    }

    static Set<String> allCards(List<Set<String>> l) {
        Set<String> s = new HashSet<String>();

        for(Set<String> i:l) {
            for(String j:i) {
                s.add(j);
            }
        }

        return s;
    }
}
