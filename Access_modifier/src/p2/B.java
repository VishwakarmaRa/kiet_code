package p2;

import p1.A;
public class B extends A {
	
	 public void dis(){
	    	System.out.println("Data:" +data);
	        show();
	   }
	public static void main(String[] args) {
         B b=new B();
         b.dis();
    }
}

