package logicalprograms;
import java.util.concurrent.TimeUnit;

public class StopWatch {

	public static void main(String[] args) 
	{
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		 
		 
        
        long timeElapsed = endTime - startTime;
 
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
          }

	}

