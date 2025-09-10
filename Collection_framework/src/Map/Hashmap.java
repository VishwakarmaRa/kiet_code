package Map;
import java.util.*;
public class Hashmap {
	public static void main(String[] args) {
		
	
//    HashMap<String, Integer> map=new HashMap<>();
		  Map<String, Integer> map=new HashMap<>();
    
    map.put("Java",2000);
    map.put("Python", 8000);
    map.put("Spring", 2000);
    map.put("C++", 3000);
    
    System.out.println(map);
    
    Integer s=map.get("Java"); /* gives value correspont to key */
    
     System.out.println(s);
     System.out.println(map.containsKey("Java"));
     System.out.println(map.containsValue(2000));
//    forEach method
     map.forEach((e1,e2)->{
        System.out.println(e1+"="+e2);
     });
     
     System.out.println("+++++++++++KeySet()++++++++++++++");
    
//     
     for(String key:map.keySet()) {
    	 Integer val=map.get(key);
    	 System.out.println("key:"+key+","+" val:"+val);
     }
       
     System.out.println("+++++++++++entrySet()++++++++++++++");
      
//     entrySet()
     for(Map.Entry<String, Integer> entry: map.entrySet()) {
    	 System.out.println("key: "+entry.getKey()+ " val: "+entry.getValue());
     }
     
       
   
	}
    
    
}
