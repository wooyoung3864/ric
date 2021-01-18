package random;

public class Crash {
    public static void main(String[] args) {
        
        Runtime runtime = Runtime.getRuntime();
		
		long freeMemory  = runtime.freeMemory();
		System.out.println("Free memory in JVM (bytes): " + freeMemory);
		 
        long maxMemory = runtime.maxMemory();
        System.out.println("Max memory in JVM (bytes): " + maxMemory);
 
        long totalMemory = runtime.totalMemory();
        System.out.println("Total memory in JVM (bytes): " + totalMemory);
        
        Object[] o = null;

        while (true) {
            o = new Object[] {o};
        }
    }
}
