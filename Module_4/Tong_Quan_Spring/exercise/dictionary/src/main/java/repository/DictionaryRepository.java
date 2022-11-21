package repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {

    private static  Map<String , String>  stringStringMap  = new HashMap<>();
    static {
        stringStringMap.put("hello" , "xin chào");
        stringStringMap.put("goodbyes" , "tạm biệt");
        stringStringMap.put("Hi" , "xin chào");
        stringStringMap.put("byes" , "xin chào");
    }


    @Override
    public String findVocabulary(String key) {
        if(stringStringMap.get(key) == null){
            return "KO có trong từ điển ";
        }
        return stringStringMap.get(key);
    }
}
