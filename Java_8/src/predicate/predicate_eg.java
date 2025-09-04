package predicate;

import java.util.function.Predicate;

class Student{
	private String name;
	private int rollno;
	
	
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
public class predicate_eg {
       public static void main(String[] args) {
    	   Predicate<Integer> iseven=x->x%2==0;
    	   System.out.println(iseven.test(4));
    	   Predicate<Integer> pred=x->x>10;
    	   System.out.println(pred.test(5));
    	   
    	   Predicate<String> startWithA=s->s.startsWith("A");
    	   System.out.println(startWithA.test("Aakash"));
    	   
    	   Predicate<String> endwithA=s->s.endsWith("A");
    	   System.out.println(endwithA.test("shamA")); /* case sensitive hota hai*/
    	   
    	   Predicate<Integer> even=n->n%2==0;
    	   Predicate<Integer> greterthan10=n->n>10;
    	   
    	   System.out.println(even.and(greterthan10).test(15)); /* and*/
    	   System.out.println(even.or(greterthan10).test(15));  /* or */
           System.out.println(even.negate().test(15));          /*negate()*/

           Student s1=new Student("Rahul",1);
           Student s2=new Student("Radha",2);
           
           
           
           
           Predicate<Student> preds=x->x.getRollno()>1;
           System.out.println(preds.test(s2));
           
           Predicate<Object> predObj=Predicate.isEqual("Rahul");
           System.out.println(predObj.test("Rahul"));
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
    	   
	}
}
