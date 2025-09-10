package collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
  public static void main(String[] args) {
	  
//	    does not maintain insertion order, have unique values
//	  backed by hashmap
	  HashSet<Integer> hs=new HashSet<>();
	    hs.add(6);
	    hs.add(7);
	    hs.add(9);
	    hs.add(1);
	    System.out.println(hs);
	    
//	    maintains insertions order
	    Set<Integer> s=new LinkedHashSet<>();
	    s.add(23);
	    s.add(6);
	    s.add(54);
	    s.add(4);
	    System.out.println(s);
	    
//	sorted order    
	    Set<Integer> s=new TreeSet<>();
	    s.add(23);
	    s.add(6);
	    s.add(54);
	    s.add(4);
	    System.out.println(s);
	    
	    
}
}
