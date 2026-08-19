import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!codes.keySet().contains(code) && !codes.values().contains(country))
            setDialingCode(code,country);
    }

    public Integer findDialingCode(String country) {
        for(Integer i:codes.keySet()) {
            if(codes.get(i).equals(country))
                return i;
        }
        
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(codes.values().contains(country)) {
            codes.remove(findDialingCode(country));
            setDialingCode(code,country);
        }
    }
}
