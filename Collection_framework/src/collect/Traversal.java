package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversal {
    public static void main(String[] args) {
    	ArrayList<String> names=new ArrayList<>();
    	names.add("Rahul");
    	names.add("Raj");
    	names.add("deepak");
    	names.add("Ananya");
    	names.add("Aakash");
    	
//    	for Each loop
//    	for(String str:names) {
//    		System.out.print(" "+str);
//    	}
    	
    	for(String s: names) {
    		System.out.println(s);
    	}
////    	System.out.println();
////    	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//////      iterator: can traverse elements in forward direction only
      Iterator<String> itr=names.iterator();
    	while(itr.hasNext()) {
   		String s=itr.next();
  		System.out.print(" "+s);
     	}
   	 System.out.println();
   	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//   	backward direction traversal:use ListIterator give size of collection in argument names.size(
//////    	to traversing from backward
  	 ListIterator<String> itr1=names.listIterator(names.size());
   	 while(itr1.hasPrevious()) {
   		 String s=itr1.previous();
  		 System.out.print(" "+s);
  	 }
////    	 System.out.println();
////    	 System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//////    	 forEach
////    	 names.forEach(str->{
////    		 System.out.print(" "+str);
////    	 });
//    	 
	}
}
