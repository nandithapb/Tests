package mikku;

public class Hotelroom {
	private String ac;
	private String cot;
	private String cable;
	private String wifi;
	private String laundary;
	static int total=0;
	int roomNo;
	int roomno=0;
	int booked[]=new int[25];
	int acd=1,acs=7,nacd=13,nacs=19;
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundary() {
		return laundary;
	}
	public void setLaundary(String laundary) {
		this.laundary = laundary;
	}
void display()
{
	if(getAc().equalsIgnoreCase("AC")) {
	total=total+1000;
	}
	else if(getAc().equalsIgnoreCase("nAC")){
	total=total+750;
	}
	if(getCot().equalsIgnoreCase("Double")){
		total=total+350;
	}
	if(getCable().equalsIgnoreCase("c")){
		total=total+50;
	}
	if(getWifi().equalsIgnoreCase("w")){
		total=total+200;
	}
	if(getLaundary().equalsIgnoreCase("l")){
		total=total+50;
	}
	System.out.println("The total charge is Rs. "+total);
	
	System.out.println("The services chosen are\n");
		if(getAc().equalsIgnoreCase("AC") && getCot().equalsIgnoreCase("Double")) {
		System.out.println("Double cot AC room");
		}
		else if(getAc().equalsIgnoreCase("AC") && getCot().equalsIgnoreCase("Single")) {
			System.out.println("Single cot AC room");
		}
		else if(getAc().equalsIgnoreCase("nAC") && getCot().equalsIgnoreCase("Double") ){
			System.out.println("Double cot non AC room");
			}
		else if(getAc().equalsIgnoreCase("nAC") && getCot().equalsIgnoreCase("Single") ){
		System.out.println("Single cot non AC room");
		}
		if(getCable().equalsIgnoreCase("c")){
			System.out.println("Cable connection enabled");
		}
		else { System.out.println("Cable connection is not enabled");
		}
		if(getWifi().equalsIgnoreCase("w")){
			System.out.println("Wi-Fi enabled"); }
		else { System.out.println("Wi-Fi is not enabled"); }
		if(getLaundary().equalsIgnoreCase("l")){
			System.out.println("with laundry service");}
		else { System.out.println("without laundry service"); }
}
void bookRoom()
{
	if(ac.equalsIgnoreCase("AC") && cot.equalsIgnoreCase("Double")) {
		roomno=acd;
		booked[acd]=1;
		acd++;
		}
		else if(ac.equalsIgnoreCase("AC") && cot.equalsIgnoreCase("Single")) {
			roomno=acs;
			booked[acs]=1;
			acs++;
		}
		else if(ac.equalsIgnoreCase("nAC") && cot.equalsIgnoreCase("Double") ){
			roomno=nacd;
			booked[nacd]=1;
			nacd++;
			}
		else if(ac.equalsIgnoreCase("nAC") && cot.equalsIgnoreCase("Single") ){
			roomno=nacs;
			booked[nacs]=1;
			nacs++;
		}
	System.out.println("thankyou for booking. Your room number is "+roomno);	
}
void checkStatus(int roomNo) {
	System.out.println(roomNo);
	
		if(booked[roomNo]==1) {
			System.out.println("Room number "+roomNo+" is  booked");
		}
		else {
			System.out.println("Room number "+roomNo+" is not booked");
		}
	
}
}