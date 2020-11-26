package synchronization.examples.lock;

 class University {

	private String principal;
	
	protected String uniname;
	
	final String department="hello";

	public String getPrincipal() {
		return principal;
	}

	final void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getUniname() {
		return uniname;
	}

	public void setUniname(String uniname) {
		this.uniname = uniname;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "University [principal=" + principal + ", uniname=" + uniname + ", department=" + department + "]";
	}

	public University(String principal, String uniname) {
		super();
		this.principal = principal;
		this.uniname = uniname;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  University(String principal) {
		super();
		this.principal = principal;
	}
	


	
}
