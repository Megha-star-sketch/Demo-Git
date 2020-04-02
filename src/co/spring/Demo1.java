package co.spring;

public class Demo1 {
	int eid;
	String name;
	Address address;
	public Demo1()
	{
		System.out.println("--Demo Constructed--");
	}
	//Constructor Injection
	public Demo1(Address address)
	{
		this.address=address;
	}
	
	
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Demo1 [eid=" + eid + ", name=" + name + ", address=" + address + "]";
	}
	public void myInit()
	{
		System.out.println("--Object Intialization--");
	}
	public void myDestroy()
	{
		System.out.println("--Object Destroy--");
	}

}
