package mikku;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
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
		//for booking room
		int total=0;
		//object for hotelroom
		Hotelroom room=new Hotelroom();
		String flag;
		do
		{
		System.out.println("Do you want ac?");
		ac=b.readLine();
		if(ac.equals("yes"))
		    {
			room.setAc("AC service is selected.");
			total=total+1000;
			System.out.println(total);
			}
		else if(ac.equals("no"))
		{
			room.setAc("Non-AC service is selected.");
			total=total+750;
			System.out.println(total);
		}
		
		System.out.println("Do you want double cot?");
		cot=b.readLine();
		if(cot.equals("yes"))
		{
			room.setCot("double cot service is selected.");
			total=total+350;
			System.out.println(total);
		}
		else if(cot.equals("no"))
		{
			room.setCot("Single cot service is selected.");
			total=total+0;
			System.out.println(total);
		}
		System.out.println("do you want cable connection?");
		cable=b.readLine();
		if(cable.equals("yes"))
		{
			room.setCable("with cable connection is selected.");
			total=total+50;
			System.out.println(total);
		}
		else if(cable.equals("no"))
		{
			room.setCable("without cable connection is selected.");
			total=total+0;
			System.out.println(total);
		}
		System.out.println("do you want Wi-Fi?");
		wifi=b.readLine();
		if(wifi.equals("yes"))
		{
			room.setWifi("WiFi service is selected");
			total=total+50;
			System.out.println(total);
		}
		else if(wifi.equals("no"))
		{
			room.setWifi("without WiFi service is selected");
			total=total+0;
			System.out.println(total);
		}
		System.out.println(" Do want Laundary service?");
		laundary=b.readLine();
		if(laundary.equals("yes"))
		{
			room.setLaundary("with laundary service is selected");
			total=total+50;
		}
		else if(laundary.equals("no"))
		{
			room.setLaundary("without laundary service is selected");
			total=total+0;
		}
		System.out.println("do you want to proceed? then press y else n");
		
		flag=b.readLine();
		if(flag.equals("y"))
		{
			System.out.println("the total amount is "+total);
		}
		
		}while(flag.equals("n"));
		System.out.println("\ndo you want to continue......then press y");
		n=b.readLine();
		}while(n.equals("y"));
		}
}