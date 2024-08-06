package learning.java;
import java.util.Scanner;
public class a10_shopping_menu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose the products from the menu below: ");
		System.out.println("1. Sugar");
		System.out.println("2. Salt");
		System.out.println("3. Tea");
		System.out.println("4. Biscuit");
		System.out.println("5. Choclate");
		System.out.println("6. Chips");
		System.out.println("7. Cold drink");
		System.out.println("8. Notebook");
		System.out.println("9. Pen");
		System.out.println("10. Toys");
		char ch = 0;
		int total=0;
		int sum=0;
		System.out.println("Enter the Product from the list:");
		int n=sc.nextInt();
		do {
	
				switch(n){
						case 1: System.out.println("Enter the units of the products:");
								int unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*50)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
								System.out.println("1. Sugar");
								System.out.println("2. Salt");
								System.out.println("3. Tea");
								System.out.println("4. Biscuit");
								System.out.println("5. Choclate");
								System.out.println("6. Chips");
								System.out.println("7. Cold drink");
								System.out.println("8. Notebook");
								System.out.println("9. Pen");
								System.out.println("10. Toys");
								System.out.println("Enter the Product from the list:");
								n=sc.nextInt();
								}
								break;
						case 2: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*20)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						case 3: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*60)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						case 4: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*20)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						case 5: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*40)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						case 6: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*20)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						case 7: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*60)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						case 8: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*40)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						case 9: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*5)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						case 10: System.out.println("Enter the units of the products:");
								unit=sc.nextInt();
								System.out.println("Your product for "+unit+" units costs you of "+(sum=(unit*500)));
								total=total+sum;
								System.out.println("Press Y/y for continue Shopping...");
								ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y') {
									System.out.println("Choose the products from the menu below: ");
									System.out.println("1. Sugar");
									System.out.println("2. Salt");
									System.out.println("3. Tea");
									System.out.println("4. Biscuit");
									System.out.println("5. Choclate");
									System.out.println("6. Chips");
									System.out.println("7. Cold drink");
									System.out.println("8. Notebook");
									System.out.println("9. Pen");
									System.out.println("10. Toys");
									System.out.println("Enter the Product from the list:");
									n=sc.nextInt();
									}
								break;
						default:System.out.println("This product is not yet in our menu we will add this product as soon as possible.");
				}	
		}while(ch=='Y'||ch=='y');
		
		System.out.println("Your Total Bill is : "+total);
		System.out.println("Thank You for shopping !!!");
		
		
}
}
		
