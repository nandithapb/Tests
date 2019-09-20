package mikku;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main 
{
	public static void main(String args[]) throws IOException
	{
		//register
		String name;
		String address;
		String contact;
		String email;
		String prooftype;
		String proofid;
		String n;
		//room
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundary;
		int roomNo;
		
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		//Scanner b=new Scanner(System.in);
		
		do
		{
			//for register name
		System.out.println("enter your name");
		name=b.readLine();
		System.out.println("enter your address");
		address=b.readLine();
		System.out.println("enter your contact");
		contact=b.readLine();
		System.out.println("enter your email");
		email=b.readLine();
		System.out.println("enter your prooftype");
		prooftype=b.readLine();
		System.out.println("enter your proofid");
		proofid=b.readLine();
		Customer nanditha=new Customer();
		nanditha.setName(name);
		nanditha.setAddress(address);
		nanditha.setContact(contact);
		nanditha.setEmail(email);
		nanditha.setProoftype(prooftype);
		nanditha.setProofid(proofid);
		nanditha.register();
		int total=0;
		
		Hotelroom room=new Hotelroom();
		String flag = null;
		do
		{
		System.out.println("Menu\n1.Book\n2.Check status\n3.Exit\nEnter your choice");
		int choice=Integer.parseInt(b.readLine());
		switch(choice)
		{
		case 1:
		{
		System.out.println("Booking:\nPlease choose the services required");
		System.out.println("AC/non-AC(AC/nAC)");
		ac=b.readLine();
		room.setAc(ac);
		System.out.println("Cot(Single/Double)");
		cot=b.readLine();
		room.setCot(cot);
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=b.readLine();
		room.setCable(cable);
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=b.readLine();
		room.setWifi(wifi);
		System.out.println("Laundry service needed or not(L/nL)");
		laundary=b.readLine();
		room.setLaundary(laundary);
		room.display();	
		System.out.println("do you want to proceed? (yes/no)");
		flag=b.readLine();
		if(flag.equalsIgnoreCase("yes"))
		{
			room.bookRoom();
		}
		break;
		}
		case 2:
		{
			System.out.println("Check status\nEnter room number");
			roomNo=Integer.parseInt(b.readLine());
		    room.checkStatus(roomNo);
		    break;
		}
		case 3:
		{
			break;
		}
		}
		}while(flag.equalsIgnoreCase("yes"));
		n=b.readLine();
		}while(n.equals("y"));
		}
}