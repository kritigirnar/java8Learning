import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
class CallableEx implements Callable<Long>
{
    int n ;
    CallableEx(int ne)
    {
        this.n =ne;
    }
    
    public Long Call()
    {
        long mul=2;
        return mul*n;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
   		CallableEx = new Callable(5);
   		ExecutorService exectorService= Exexutors.newFixedThreadPool(10);
   		Future<Long> futureObj= exectorService.submit();
   		System.out.println(futureObj.get());
   		
   		
   		
   		
     		
   		
	}
}
