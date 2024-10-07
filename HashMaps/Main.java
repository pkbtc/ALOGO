import java.util.HashMap;
import java.util.HashSet;
class MapusingHash{
    private Entity[] entities;
    public MapusingHash(){
        entities = new Entity[100];

    }
    private class Entity{
        String key;
        String value;

        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
    public void put(String key,String value){
        int hash=Math.abs(key.hashCode())%entities.length;
        entities[hash]=new Entity(key,value);


    }
    public String get(String key){
        int hash=Math.abs(key.hashCode())%entities.length;
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        else {
            return null;
        }
    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode())%entities.length;
        entities[hash]=null;
    }
}
public class Main {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("test",1);
        System.out.println(map.get("test"));

        HashSet<String> set = new HashSet<String>();
        set.add("test");
        set.add("hello");
        set.add("test");
        System.out.println(set);    
        MapusingHash mapusingHash = new MapusingHash();
        mapusingHash.put("test","hello");
        mapusingHash.put("test1","hello1");
        mapusingHash.put("test2","hello2");
        mapusingHash.remove("test");
        System.out.println(mapusingHash.get("test"));
    }
}
