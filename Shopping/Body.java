package Shopping;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class Body {
    static int id = 100;
    HashMap<String, CartEntry> map = new HashMap<String, CartEntry>();

    //insert
    public void Insert(String Category, String product, int quantity, int price){ id++;
        map.put(String.valueOf(id),new CartEntry(Category,product, quantity, price));
        System.out.println("Item:"+id+" added to cart entry successfully.");
    }
    //removing
    public void delete(String id){
        map.remove(id);
    }
    //viewing
    public void view(){
        for(Map.Entry<String, CartEntry>view:map.entrySet()){
            System.out.println("Item Id:"+view.getKey()+" "+view.getValue().toString());
        }
    }
    //Summary item
    public void summary(){
        double total=0;
        for(Map.Entry<String,CartEntry>summary:map.entrySet()){
            System.out.println( summary.getKey()+" "+summary.getValue().getProduct()
                                                +" "+summary.getValue().getQuantity()
                                                +" "+summary.getValue().getPrice());
            total=total+(summary.getValue().getQuantity()*summary.getValue().getPrice());
        }
        System.out.println("Amount is:"+total);
    }
    //Overall summary
    public void overall(){
        HashMap<String, CartEntry> mark = map.entrySet().stream()
                .sorted((i1, i2)-> i1.getValue().getCategory().compareTo(i2.getValue().getCategory()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(j1,j2)->j1,HashMap::new));
        Set<String> set = new HashSet<String>();
        for(Map.Entry<String,CartEntry> end:mark.entrySet()){
            set.add(end.getValue().getCategory());
        }
        for(String j:set){
            double overall=0;
            for(Map.Entry<String,CartEntry> end: map.entrySet()){
                if(end.getValue().getCategory().equalsIgnoreCase(j)){
                    overall=overall+(end.getValue().getQuantity()*end.getValue().getPrice());
                    System.out.println(end.getKey()+" "+end.getValue().toString());
                }
            }
            System.out.println("Total amount to pay:"+j +" "+overall+"\n");
        }
    }
}