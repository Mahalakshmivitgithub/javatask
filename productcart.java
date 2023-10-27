import java.util.*;

class productcart{
	String name;
	double price;
	public productcart(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		LinkedList<productcart> itm=new LinkedList<>();
		itm.add(new productcart("carrots",90));
		itm.add(new productcart("beans",75));
                itm.add(new productcart("onions",55));
		double totalcost=0.0;
		Scanner s=new Scanner(System.in);
		while(true)
	{
			System.out.println("1.Add item to cart");
			System.out.println("2.Remove item from cart");
			System.out.println("3.View cart and total price");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			int ch=s.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("Enter item name:");
				String itname=s.next();
				System.out.println("Enter item price:");
				double itprice=s.nextDouble();
				productcart sc=new productcart(itname,itprice);
				itm.add(sc);
				totalcost+=itprice;
				break;
				
			case 2:
				System.out.println("Enter the item to remove:");
				String removeit=s.next();
				for(productcart it:itm)
				{
					if(it.name.equals(removeit))
					{
						totalcost-=it.price;
						itm.remove(it);
						System.out.println(removeit+"removed from the cart");
						break;
					}
				}
				break;
				
			case 3:
				System.out.println("Items in the cart:");
				for(productcart it:itm)
				{
					System.out.println(it.name+"-"+"Rs."+it.price);
				}
				System.out.println("Totalcost: RS."+totalcost);
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!!! please enter the valid choice to proceed!");

			}
		}

	}

}