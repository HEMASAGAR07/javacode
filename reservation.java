package Java_Practice;
import java.util.*;
import java.util.random.RandomGenerator;

class bus{
	  bus(int avl_bus,int dmg_bus){
		}
	}
 class ticket_booking extends bus{
	 int brandnew;
	 ticket_booking(int avl_bus,int dmg_bus,int newone) {
		 super(avl_bus,dmg_bus);
		 brandnew=newone;
		 }
	void booking_vij(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total tiks for banglore");
		int avl=sc.nextInt();
		System.out.println(avl+" number of tickets are available for booking");
		System.out.println("enter the total number of tickets u need");
		int need=sc.nextInt();
		int bal=avl-need;
		if(need<=avl) {
			System.out.println("Your Total fare ="+100*need+'\n'+"please pay to cashier ");
			System.out.println(bal+" tickets are left for booking"); 
			}
			else{
				System.out.println("No enough tickets available");}
		}
	void booking_bang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total tiks for banglore");
		int avl=sc.nextInt();
		System.out.println(avl+" number of tickets are available for booking");
		System.out.println("enter the total number of tickets u need");
		int need=sc.nextInt();
		int bal=avl-need;
		if(need<=avl) {
			System.out.println("Your Total fare ="+180*need);
			System.out.println(bal+" tickets are left for booking");
			}
			else{
				System.out.println("No enough tickets available");}
	}
	void booking_tpty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total tiks for banglore");
		int avl=sc.nextInt();
		System.out.println(avl+" number of tickets are available for booking");
		System.out.println("enter the total number of tickets u need");
		int need=sc.nextInt();
		int bal=avl-need;
		if(need<=avl) {
			System.out.println("Your Total fare ="+120*need);
			System.out.println(bal+" tickets are left for booking");
			}
			else{
				System.out.println("No enough tickets available");}
		}
		void selection(){
		Scanner sc = new Scanner(System.in);
		ticket_booking l= new ticket_booking(brandnew,brandnew,brandnew);
		System.out.println("Enter the number of your choice \n select 1 for booking to travel vijayawada \n Select 2 for travelling to banglore \n Select 3 for travelling to tirupathi");
		int s=sc.nextInt();
		if(s==1) {
		System.out.println("Thanks for choosing our company to travel ur trip \n We will safely take you to vijayawada");
		l.booking_vij();}
		else if(s==2) {
		System.out.println("Thanks for choosing our company to travel ur trip \n We will safely take you to banglore");
		l.booking_bang();}
		else if(s==3) {
		System.out.println("Thanks for choosing our company to travel ur trip \n We will safely take you to banglore");
		l.booking_tpty();}
		else
			System.out.println("Enter a valid number");
			}	
}
class thankyou extends ticket_booking{
	thankyou(int avl_bus, int dmg_bus, int newone) {
		super(avl_bus, dmg_bus, newone);
		System.out.println("the number of busses available for booking = "+avl_bus);
		System.out.println("the number of busses damaged = "+dmg_bus);
		System.out.println("the number of busses newone = "+newone);
	}
	void last(){
		System.out.println("Thank you and visit again");
	}
}
public class reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the service number of bus");
		int num=sc.nextInt();
		System.out.println("Enter the number of available busses");
		int k=sc.nextInt();
		System.out.println("Enter the number of damaged busses");
		int o=sc.nextInt();
		System.out.println("Enter the number of brand new busses");
		int y=sc.nextInt();
	    thankyou l= new thankyou(k,y,o);
		l.selection();
		System.out.println("Your service number is "+num);
		l.last();
		}

}
