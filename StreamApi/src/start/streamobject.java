package start;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamobject {
   public static void main(String[] args) {
//	   first way to create stream object
	    Stream<Object> emptystr=Stream.empty();
	    String names[]= {"Aayush", "Rahul"," Ayushi"," shubhi"};
	    
	    Stream<String> stream1=Stream.of(names);
	    stream1.forEach(e->{
	    	System.out.print(e);
	    });
	    
//	    second way to create stream object-List, set
	     List<Integer> list2=new ArrayList<>();
	    list2.add(12);
	    list2.add(34);
	    list2.add(23);
	    list2.add(78);
	    
	    Stream<Integer> stream2=list2.stream();
	    stream2.forEach(e->{
	    	System.out.println(e);
	    });
	    
	    
	    
}
}
