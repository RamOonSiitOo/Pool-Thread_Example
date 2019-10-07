package es.pool_thread_example_ramon;
import java.util.concurrent.*;

public class Main{
public static void main(String[] args) {
    int nTareas = 5;
	int poolSize = 3;
	ThreadPoolExecutor myPool = new ThreadPoolExecutor(poolSize,poolSize,60000L,TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
	ThreadExecutor[] tareas = new ThreadExecutor[nTareas];
	for (int i = 0; i < nTareas; i++) {
		tareas[i] = new ThreadExecutor(i);
		myPool.execute(tareas[i]);
	}
		myPool.shutdown();
}
}