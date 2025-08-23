package start;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class learn {
    public static void main(String[] args) {
		List<Integer> l1=new ArrayList();
		for(int i=0; i<10; i++) {
			l1.add(i);
		}
		Stream<Integer> sm=l1.stream();
		List<Integer> l2=sm.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		
		
	}
}
