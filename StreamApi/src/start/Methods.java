package start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
     public static void main(String[] args) {
		
//  Filter  	 
    	 List<String> names=List.of("Aman", "Ajay", "Abhishek", "Ayushi"," Deepak");
		List<String> l1=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(l1);
		
//		forEach
		names.stream().forEach(e->{
			System.out.println(e);
		});
		names.stream().forEach(System.out::println);
		
//		Sorted:by default asc me print karega elements
		List<Integer> list2=new ArrayList<>();
		list2.add(12);
	    list2.add(34);
	    list2.add(23);
	    list2.add(78);
	    list2.stream().sorted().forEach(System.out::println);

//	    max and min
	    Integer val=list2.stream().min((x,y)->x.compareTo(y)).get();
	    System.out.println("min "+val);
	    
	    Integer val1=list2.stream().max((x,y)->x.compareTo(y)).get();
	    System.out.println("max "+val1);
	    
	    List<Integer> nums=Arrays.asList(2,5,3,6,9);
	    Stream<Integer> data=nums.stream();
	    Stream<Integer> sortdata=data.sorted();
	    sortdata.forEach(n->System.out.print(+n+" "));
	    System.out.println();
	    
		for(int a:nums) {
			System.out.print(+a*2+" ");
		}
		
//	   
	}
}
