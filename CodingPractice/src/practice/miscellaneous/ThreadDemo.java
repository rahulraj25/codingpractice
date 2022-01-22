package practice.miscellaneous;

public class ThreadDemo {
public static void main(String[] args) {
	Thread t1 = new Thread(){
		@Override
		public void run() {
			for (int i = 1; i <= 10; i++) {
				if(i%2==0){
					System.out.println(i);
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
	};
	
	Thread t2 = new Thread(){
		@Override
		public void run() {
			for (int i = 1; i <= 10; i++) {
				if(i%2!=0){
					System.out.println(i);
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	};
	
	t1.start();
	t2.start();
	
	
}
}
