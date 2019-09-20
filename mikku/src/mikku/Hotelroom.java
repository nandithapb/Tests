package mikku;

public class Hotelroom {
	private String ac;
	private String cot;
	private String cable;
	private String wifi;
	private String laundary;
	//int total=0;
	
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
System.out.println(getAc()+" "+getCot()+" "+getCable()+" "+getWifi()+" "+getWifi());	
}
}