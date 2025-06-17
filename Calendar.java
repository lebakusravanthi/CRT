import java.util.Scanner;
public class Calender {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch (Day) {
		case "mon":
			System.out.println("java ");
			break;
		case "tue":
		    System.out.println("python ");
			break;
		case "wed":
			System.out.println(" c");
			break;
		case "thur":
			System.out.println("c++ ");
			break;
		case "fri":
			System.out.println("ai ");
			break;
		default:
			break;
		}
		 
      sc.close();
		
	}

}