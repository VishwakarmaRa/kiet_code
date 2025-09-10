package collect;
import java.util.*;
public class practice_class {
    public static void main(String[] args) {
//		int arr[]=new int[5];
//		for(int i=0; i<5; i++) {
//			arr[i]=i;
//		}
//		arr[5]=12;
//		System.out.println(arr[5]);
    	
    	ArrayList<Integer> list=new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	System.out.println(list);
    	list.remove(2);
    	System.out.println(list);
    	list.removeFirst();
    	System.out.println(list);
    	
    	list.add(5);
    	System.out.println(list);
    	
    	List<String> names=new ArrayList<>();
    	names.add("Rahul");
    	names.add("Raj");
    	names.add("Deepak");
    	names.add("Sandeep");
    	names.add("Shubhi");
    	
    	for(String s:names) {
    		System.out.println(s);
    	}
    	
    	System.out.println("++++++++++++++++++++++++Forward traverse+++++++++++++++++++++++++++");
    	Iterator<String> str=names.iterator();
    	while(str.hasNext()) {
    		System.out.println(str.next());
    	}
    	System.out.println("++++++++++++++++++++++++Backward traverse+++++++++++++++++++++++++++");
    	
    	ListIterator<String> itr=names.listIterator(names.size());
    	
    	while(itr.hasPrevious()) {
    		System.out.println(itr.previous());
    	}
    	
    	
    	
	}
    
}
