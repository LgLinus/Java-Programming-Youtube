package videoeighteen;

public class ThreadAndRunnable {

	public ThreadAndRunnable() {

	}

	public static void main(String[] args) {
		ThreadAndRunnable prog = new ThreadAndRunnable();
//		 prog.ex1();
//		prog.ex2();
		prog.ex3();
	}

	public void ex1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public void ex2() {

//		new Thread(new RunnableExample()).start();
		Thread threadVar = new Thread(new RunnableExample());
		threadVar.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadVar.interrupt();
	}



	public void ex3() {
		
		Thread threadVar = new ThreadExample();
		threadVar.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		threadVar.interrupt();
	}

	private class RunnableExample implements Runnable{

		@Override
		public void run() {
			int number = 0;
			boolean running = true;
			while(running){
				System.out.println(number);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					running = false;
//					e.printStackTrace();
				}
				number++;
			}
		}
	}

	private class ThreadExample extends Thread{
		@Override 
		public void run(){
			int number = 0;
			boolean running = true;
			while(running){
				System.out.println(number);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					running = false;
//					e.printStackTrace();
				}
				number++;
			}
		}
		}
	
	
}
