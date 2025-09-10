package collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class collection_type {

public static void main(String[] args) {
	
//	Type safe collection: we already define the type of data.
	ArrayList<String> names=new ArrayList<>();
	names.add("Rahul");
	names.add("Raj");
	names.add("deepak");
	names.add("Ananya");
	names.add("Aakash");
	
    System.out.println(names);
    System.out.println(names.get(0));
    System.out.println(names.get(1));
//    names.remove(1);
//    names.remove("deepak");
    System.out.println(names);
    
    System.out.println(" size of list: "+names.size());
    
    System.out.println(names.contains("Rahul"));
   
//    check list is empty or not
    System.out.println(names.isEmpty());
    
//    setting values
    names.set(2, "Shubhi");
    names.add(1,"Sandeep");
    
    
    System.out.println(names);
//    names.clear();
//    System.out.println(names);
    
    Vector<String> vec=new Vector<>();
    vec.addAll(names);
    System.out.println("vec: "+vec);
    
//    does not maintain insertion order, have unique values.
    
    HashSet<Integer> hs=new HashSet<>();
    hs.add(6);
    hs.add(7);
    hs.add(9);
    hs.add(1);
    System.out.println(hs);
    
    
    
    
//    Untype safe collection: kisi type ka data aa sakta hai.
     
//     ArrayList list=new ArrayList();
//     list.add(1);
//     list.add("Rahul");
//     list.add(12.34);
//    
//     System.out.println(list);
//     
//     list.remove(1);
//     System.out.println(list);
    
	
}
}
