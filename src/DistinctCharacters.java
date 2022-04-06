import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {
    public static Map<Character,Integer> findCount(String s){
        String str=s.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else
                map.put(str.charAt(i),1);
        }
        return map;
    }
}
