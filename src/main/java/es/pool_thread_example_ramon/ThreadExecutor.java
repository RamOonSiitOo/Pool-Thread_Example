package es.pool_thread_example_ramon;

public class ThreadExecutor implements Runnable {
	public static int cont=0;
	int numTarea;
	
	public ThreadExecutor(int n) {
		numTarea=n;
	}
	
	public void run() {
		for(int i=0; i<10000;i++) {
			//cont++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Esta es la tarea num: "+numTarea+ " imprimiendo: "+i);
		}
	}
	
}
