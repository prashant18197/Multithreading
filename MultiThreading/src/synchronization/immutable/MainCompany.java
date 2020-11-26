package synchronization.immutable;

public class MainCompany {

	public static void main(String[] args) {
		Company c=new Company("siemens", "Baner");
		
		System.out.println(c);
		
		Integer a=90;
		a=a+10;
		System.out.println(a);
		
		System.out.println(""+(a+10));
		System.out.println(a);
		
		int x=10;
		System.out.println(""+(x+10));
		System.out.println(x);
		
		c=new Company("baner", "balewadi");
		System.out.println(c);
	}
}
