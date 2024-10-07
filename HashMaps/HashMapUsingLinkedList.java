import java.util.*;

public class HashMapUsingLinkedList<K,V> {
    private class Entity{
        String key;
        V value;

        public Entity(String key2, V value2){
            this.key = (String) key2;
            this.value = (V) value2;
        }
    }
    ArrayList<LinkedList<Entity>> list;
    private int size=0;
    private float loadFactor=0.5f;

    public HashMapUsingLinkedList(){
        list=new ArrayList<>();
        for (int i = 0; i <10; i++) {
            list.add(new LinkedList<>());
        }

    }
    public void put(String key,V value){
        int hash=Math.abs(key.hashCode())%list.size();
        LinkedList<Entity> entities=list.get(hash);
        for(Entity entity:entities){
            if(entity.key.equals(key)){
                entity.value=value;
                return;
            }
            
        }
        if((float)(size)/list.size()>loadFactor){
            reHash();
        }
        entities.addFirst(new Entity(key,value));
        size++;
    }
    public void reHash(){
        System.out.println("rehashing");
        ArrayList<LinkedList<Entity>> oldList=list;
        list=new ArrayList<>();
        size=0;
        for (int i = 0; i<oldList.size()*2; i++) {
            list.add(new LinkedList<>());
        }
        for(LinkedList<Entity> entities:oldList){
            for(Entity entry:entities){
                put(entry.key,entry.value);
            }
        }
    }
    public V get(String key){
        int hash=Math.abs(key.hashCode())%list.size();
        LinkedList<Entity> entities=list.get(hash);
        for(Entity entity:entities){
            if(entity.key.equals(key)){
                return (V) entity.value;
            }
            
        }
        return null;
    }

}
