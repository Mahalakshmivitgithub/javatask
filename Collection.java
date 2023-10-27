import java.util.*;
public class Collection {
public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter how much names you want to enter:");
		int n=sc.nextInt();
		System.out.println("Enter the names:");
		for(int i=1;i<=n;i++) {
			String name=sc.next();
			ar.add(name);
		}
		System.out.println("Original elements:"+ar);
		TreeSet<String> nl=new TreeSet<>(ar);
		System.out.println("After removing duplicates:"+nl);
		
		System.out.println("Sorted elements :"+nl);

	}
}