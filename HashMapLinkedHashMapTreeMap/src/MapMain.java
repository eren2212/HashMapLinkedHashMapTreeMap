
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapMain {
    public static void mapYazdir(Map<Integer,String> map){
        map.put(1, "PHP");
        map.put(20, "Java");
        map.put(5, "Javascript");
        map.put(100,"Python");
        
        /*for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key:"+entry.getKey()+" Value : "+entry.getValue());
        }*/
        
        /*for(Integer key:map.keySet()){
            System.out.println("Key: "+ key +" value: "+map.get(key));
        }*/
        
        Collection<String> values = map.values();
        
        for(String s:values){
            System.out.println("Deger:"+s);
        }
        
   
        
    }
    public static void main(String[] args) {
        
        Map<Integer,String> hashmap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        
        System.out.println("------------------------------");
        mapYazdir(hashmap);
        System.out.println("------------------------------");
        mapYazdir(linkedHashMap);//burada girilen sıraya göre bastırır.
        System.out.println("------------------------------");
        mapYazdir(treeMap);//burada keylere göre sıralır.
        System.out.println("------------------------------");
        
    }
}
