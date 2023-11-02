
public class DemoEmployeeproject {

	public static void main(String[] args) {
		
		
	//	DBController.create(101,"SanthoshKumar", 56000);
		
	//	DBController.delete(2);
		
	//DBController.update(1, "Praveena L", 70000);
		
	//DBController.display();
		
		int ch=1;
		Scanner sc = new Scanner(System.in);
		
	do
	{
		System.out.println("CRUD Operation\n===================");
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Delete Employee");
		System.out.println("4.Show Employee");
		System.out.println("5.Exit");
		
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("Enter employee name and salary");
				DBController.create(sc.next(), sc.nextDouble());
				break;
			case 2:
				System.out.println("Enter employee id, name and salary");
				DBController.update(sc.nextInt(),sc.next(), sc.nextDouble());
				break;
			case 3:
				System.out.println("Enter employee id");
				DBController.delete(sc.nextInt());
				break;
			case 4:
				
				DBController.display();
				break;
			default:
				System.out.println("Invalid Option");
		}
		
		
	}while(ch!=5);
	
		
		

	}

}
