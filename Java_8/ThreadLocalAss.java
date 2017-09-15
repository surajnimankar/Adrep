

/*
 * The ThreadLocal class in Java enables you to create variables that can only be read and written by the same thread.
 * Thus, even if two threads are executing the same code, and the code has a reference to a ThreadLocal variable, 
 * then the two threads cannot see each other's ThreadLocal variables.
 */

public class ThreadLocalAss {
	
	private static ThreadLocal myThreadLocal = new ThreadLocal();
		
	//generic threadlocal
	private static ThreadLocal<String> genThreadLocal = new ThreadLocal<>();
	
	private static ThreadLocal InitValueThreadLocal = new ThreadLocal<String>() {
	    @Override 
	    protected String initialValue() {
	        return "This is the initial value";
	    }
	};  
	
	public static void main(String[] args) throws InterruptedException {
		myThreadLocal.set("A thread local value");
		System.out.println((String)myThreadLocal.get());
		
		genThreadLocal.set("Hello  Generic ThreadLocal");
		System.out.println(genThreadLocal.get());
		
		System.out.println(InitValueThreadLocal.get());
		
		MyRunnable sharedRunnableInstance = new MyRunnable();
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate
        
        /**
         * This example creates a single MyRunnable instance which is passed to two different threads. 
         * Both threads execute the run() method, and thus sets different values on the ThreadLocal instance. 
         * If the access to the set() call had been synchronized, and it had not been a ThreadLocal object,
         * the second thread would have overridden the value set by the first thread.
         * However, since it is a ThreadLocal object then the two threads cannot see each other's values. 
         * Thus, they set and get different values.
         */
	}
	
	
	public static class MyRunnable implements Runnable {
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

        @Override
        public void run() {
            threadLocal.set((int)(Math.random() * 100D));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
       }
                System.out.println(threadLocal.get());
        }
    }
}
