package methodref;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void print(String s) {
		System.out.println("String hai");
	}
   public static void main(String[] args) {
	 List<String> students=Arrays.asList("Alice","Bob","charlie");
	 students.forEach(s->System.out.println(s));
	 students.forEach(Test::print);/* method reference-> ::*/
	 
	 List<String> names=Arrays.asList("Alice","Bob","charlie");
	 List<Student> stu=names.stream().map(x->new Student(x)).collect(Collectors.toList());
	 System.out.println(stu);
	 List<Student> stu1=names.stream().map(Student::new).collect(Collectors.toList());  
	 /* constructor reference*/
	 System.out.println(stu1);
	 
   public void sendOTP(String medium) {
	 if(medium.equals("email")) {
		 System.out.println();
		 System.out.println();
	 }
   }
  }
}
