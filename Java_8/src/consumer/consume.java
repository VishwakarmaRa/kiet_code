package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consume {
      public static void main(String[] args) {
		Consumer<String> consu=s->System.out.println(s);
		consu.accept("I am Rahul ");
		Consumer<List<Integer>> list1=li->{
			for(Integer i:li) {
				System.out.print(+i+100+" ");
			}
		};
//		System.out.println();
		Consumer<List<Integer>> list2=li->{
			for(Integer i:li) {
				System.out.print(+i+" ");
			}
		};
		System.out.println();
//		list1.accept(Arrays.asList(1,2,3,4));
		Consumer<List<Integer>> list=list2.andThen(list1);
		list.accept(Arrays.asList(1,2,3,4,5));
	}
}
