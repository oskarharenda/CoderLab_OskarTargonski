package a_Zadania.b_Dzien_2.d_Optional_Date_Api;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AddressBook {

    private static final HashMap<String, String> phoneBookEntries = new HashMap<>();

    public AddressBook() {
        phoneBookEntries.put("Jan Kowalski", "Kraków Polna 11");
        phoneBookEntries.put("Marek Marecki", "016/161617");
    }


    public Optional<String> findAddressByName(String name) {
        for (Map.Entry<String,String> keyAndValue : phoneBookEntries.entrySet()){
            if(keyAndValue.getKey().equals(name)) {
                return Optional.of(keyAndValue.getValue());
            }
        }
        return Optional.empty();
    }

    public Optional<String> findNameByAddress(String phoneNumber) {
        for(Map.Entry<String, String> keyAndValue : phoneBookEntries.entrySet()){
            if(keyAndValue.getValue().equals(phoneNumber)) {
                return Optional.of(keyAndValue.getKey());
            }
        }
        return Optional.empty();

    }


}
