package mikku;

public class Customer {
	private String name;
	private String address;
	private String contact;
	private String email;
	private String prooftype;
	private String proofid;
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
	void register()
	{
		++a;
		System.out.println("name		:"+getName()+"\n"+"address		:"+getAddress()+"\n"+"contactno	:"+getContact()+"\n"+"email		:"+getEmail()+"\n"+"proof type	:"+getProoftype()+"\n"+"proof Id	:"+getProofid());
		System.out.println("You have registered successfully. Your register number is "+a);
	}
}
