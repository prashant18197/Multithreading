package synchronization.immutable;

public final class Company {

	
	public final String name;
	
	public final String address;

	public Company(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + "]";
	}
	
	
	
}
