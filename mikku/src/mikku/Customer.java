package mikku;

public class Customer {
	private String name;
	private String address;
	private String contact;
	private String email;
	private String prooftype;
	private String proofid;
	//static int a=0;
	static int a=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProoftype() {
		return prooftype;
	}
	public void setProoftype(String prooftype) {
		this.prooftype = prooftype;
	}
	public String getProofid() {
		return proofid;
	}

	public void setProofid(String proofid) {
		this.proofid = proofid;
	}
	
	/*Customer(String name,String address,String contact,String email,String prooftype,String proofid)
	Customer()
	{
		this.name=name;
		this.address=address;
		this.contact=contact;
		this.email=email;
		this.prooftype=prooftype;
		this.proofid=proofid;
	}
	*/void register()
	{
		++a;
		System.out.println(getName()+"\n"+getAddress()+"\n"+getContact()+"\n"+getEmail()+"\n"+getProoftype()+"\n"+getProofid());
		System.out.println("You have registered successfully. Your register number is "+a);
	}
}
