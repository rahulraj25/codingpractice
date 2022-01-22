package practice.miscellaneous;
class ThreadSnippet {
	
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread(new MyRunnable()).start();
	}
}
class MyThread extends Thread {
	MyThread() {}
	MyThread(Runnable r) {super(r);}
	
	public void run(){
		System.out.println("Inside thread");
	}
}
class MyRunnable implements Runnable
{
	public void run(){
		System.out.println("Inside Runnable");
	}
}