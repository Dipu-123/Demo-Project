package pack;

public class Mythread extends Thread{
public void run() {
	Thread th=Thread.currentThread();
	for(int i=0;i<=5;i++) {
		System.out.println(i+"\t"+th.getName());
		try {
			Thread.sleep(500);
		}catch(Exception ex) {
			
		}
	}
}
		
	}






