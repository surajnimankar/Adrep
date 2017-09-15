import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExecutorServiceAss {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		executeRunnable();
		submitRunnable();
		submitCallable();
		InvokeAny();
		InvokeAll();
		
	}
		
	private static void executeRunnable() {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task; execute called");
			}
		});

		executorService.shutdown();
	}
	
	private static void submitRunnable() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		@SuppressWarnings("rawtypes")
		Future future = executorService.submit(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task; submit Runnable called");
			}
		});
		future.get();  //returns null if the task has finished correctly.
		executorService.shutdown();
	}
	
	private static void submitCallable() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Object> future = executorService.submit(new Callable<Object>(){
		    public Object call() throws Exception {
		        System.out.println("Asynchronous Task; submit Callable called");
		        return "Callable Result";
		    }
		});

		System.out.println("future.get() = " + future.get());
		executorService.shutdown();
	}
	
	private static void InvokeAny() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Set<Callable<String>> callables = prepareCallables();

		String result = executorService.invokeAny(callables);

		System.out.println("result of Invoke Any = " + result);
		
		executorService.shutdown();
	}
	
	private static void InvokeAll() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Set<Callable<String>> callables = prepareCallables();

		List<Future<String>> futures = executorService.invokeAll(callables);

		for(Future<String> future : futures){
		    System.out.println("future.get = " + future.get());
		}
		executorService.shutdown();
	}

	private static Set<Callable<String>> prepareCallables() {
		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 3";
		    }
		});
		return callables;
	}
}