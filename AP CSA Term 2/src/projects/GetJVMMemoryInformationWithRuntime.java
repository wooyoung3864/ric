package projects;

public class GetJVMMemoryInformationWithRuntime {
	
	public static void main(String[] args) 
	{
		Runtime runtime = Runtime.getRuntime();
		
		long freeMemory  = runtime.freeMemory();
		System.out.println("Free memory in JVM (bytes): " + freeMemory);
		 
        long maxMemory = runtime.maxMemory();
        System.out.println("Max memory in JVM (bytes): " + maxMemory);
 
        long totalMemory = runtime.totalMemory();
        System.out.println("Total memory in JVM (bytes): " + totalMemory);
        
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vendor.version"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.vendor.url.bug"));
        System.out.println(System.getProperty("java.specification.name"));
        System.out.println(System.getProperty("java.specification.vendor"));
        System.out.println(System.getProperty("java.specification.version"));
        System.out.println(System.getProperty("java.vm.name"));
        System.out.println(System.getProperty("java.vm.vendor"));
        System.out.println(System.getProperty("java.vm.version"));
        System.out.println(System.getProperty("java.vm.info "));
        System.out.println(System.getProperty("java.vm.specification.name"));
        System.out.println(System.getProperty("java.vm.specification.vendor "));
        System.out.println(System.getProperty("java.vm.specification.version "));
        System.out.println(System.getProperty(" java.runtime.name"));
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.class.version"));
        System.out.println(System.getProperty("jdk.debug"));
        System.out.println(System.getProperty("sun.java.launcher"));
        System.out.println(System.getProperty("sun.management.compiler"));
        
        System.gc();
    
	}
}
