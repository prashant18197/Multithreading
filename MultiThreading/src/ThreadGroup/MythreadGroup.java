package ThreadGroup;

public class MythreadGroup extends Thread{
	
	
	
	public MythreadGroup(ThreadGroup group, String name) {
		super(group, name);
	}

	public MythreadGroup() {
		
	}
	public void run()
	{
		try
		{
			this.sleep(5000);
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup pg=new ThreadGroup("pg");
		
		ThreadGroup cg=new ThreadGroup(pg,"Demo");
		MythreadGroup th=new MythreadGroup(pg,"prashant");
		MythreadGroup th1=new MythreadGroup(pg,"ravi");

		th.start();
		th1.start();
		
		System.out.println("Active count :"+pg.activeCount());
		System.out.println("Active group count :"+pg.activeGroupCount());
		pg.list();
		
		Thread.sleep(10000);
		System.out.println("Active count :"+pg.activeCount());
		System.out.println("Active group count :"+pg.activeGroupCount());
		pg.list();
	}
}
