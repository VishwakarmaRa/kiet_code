package collect;

import java.util.ArrayList;
import java.util.Scanner;

public class Arralist {
		     public static void main(String[] args) {
		         Scanner sc = new Scanner(System.in);

		         System.out.print("Enter number of products: ");
		         int n = sc.nextInt();
		         sc.nextLine(); // ✅ consume the leftover newline

		         ArrayList<String> product = new ArrayList<>();
		         System.out.println("Enter product names:");
		         for (int i = 0; i < n; i++) {
		             product.add(sc.nextLine());
		         }

		         System.out.println("Products: " + product);
		     }
		 


}
