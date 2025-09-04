package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Student{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
}
public class function {
       public static void main(String[] args) {
		  Function<String, Integer> fun=x->x.length();
		  System.out.println(fun.apply("Rahul"));
		  
		  Function<String, String> fun2=s->s.substring(0,3);
		  System.out.println(fun2.apply("Rahul"));
		  
		  Function<List<Student>, List<Student>> stu=li->{
			  List<Student> res=new ArrayList<>();
			  for(Student s:li) {
				  if(fun2.apply(s.getName()).equalsIgnoreCase("rah")) {
					  res.add(s);
				  }
			  }
			  return res;
		  };
		  
		  Student s1=new Student("Rahul",1);
		  Student s2=new Student("Rahil",2);
		  Student s3=new Student("Radhe",3);
		  Student s4=new Student("Rutul",4);
				  
	      List<Student> stlist=Arrays.asList(s1,s2,s3,s4);
	      List<Student> filterStu=stu.apply(stlist);
	      System.out.println(filterStu);
		  
	      Function<Integer, Integer> f1=x->2*x;
	      Function<Integer, Integer> f2=x->x*x*x;
	      
	      int a=f1.andThen(f2).apply(4);
	      System.out.println(a);
	      
	      int b=f2.andThen(f1).apply(4); /* phle f2 action perform karega ip pe phir f2 ka op f1 ko inp milega*/
	      System.out.println(b); 
	      
	      int c=f1.compose(f2).apply(4); /* phle f2 action perform karega ip pe phir f2 ka op f1 ko inp milega*/
	      System.out.println(c);       
		  
	}
}
