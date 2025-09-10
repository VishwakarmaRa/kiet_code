package collect;

public class emp implements Comparable<emp>{
     String name;
     int id;
     
     public emp(String name, int id){
    	 this.name=name;
    	 this.id=id;
     }

//     alt+shift+s=shorcut to print toString
	 @Override
	 public String toString() {
		return "emp [name=" + name + ", id=" + id + "]";
	 }
	 
	 @Override
	public int compareTo(emp o) {
		return this.id-o.id;
	}
     
    
     
}
