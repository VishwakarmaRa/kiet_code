package collect;

import java.util.ArrayList;
import java.util.Collections;

public class comparre {
    public static void main(String[] args) {
//		ArrayList<Integer> l1=new ArrayList();
//		l1.add(12);
//		l1.add(3);
//		l1.add(9);
//		l1.add(1);
//		System.out.println(l1);
//		
//		Collections.sort(l1);
//		System.out.println(l1);
    	
//    	Use of comparable 
    	ArrayList<emp> e=new ArrayList<>();
    	e.add(new emp("Rahul",43));
    	e.add(new emp("Aakash",100));
    	e.add(new emp("Sandeep",2));
    	
    	System.out.println(e);
    	Collections.sort(e);
    	System.out.println(e);
    	
    	
    	
    	
    	
		
	}
}
