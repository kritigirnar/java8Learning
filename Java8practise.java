import java.util.*;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Integer> intList= new ArrayList<Integer>();
		intList.add(56);
		intList.add(32);
		intList.add(5117);
		intList.add(443);
		
		// collect
	List<Integer>llist=	intList.stream().collect(Collectors.toList());
llist.stream().forEach(System.out::println);

//Count
Long count=intList.stream().count();
System.out.println(count);

//sorted (by default natural ordering)

intList.stream().sorted().forEach(a->System.out.println(a));

Intlist.stream().sorted ((a,b)-> (a.getName().compareTo(b.getName())).forEach(System.out::printing));
// sorting wit( filtering)
Long countn= intList.stream().filter(a-> a>100).sorted().count();
System.out.println(countn);

//Decreaing order
intList.stream().sorted((a,b)->b.compareTo(a)).forEach
(System.out::println);
//increasing order
List.stream().sorted(a,b)->a.compareTo(b)).forEach(System.out::println);

//min value
Integer miun= intList.stream().min((a,b)->a.compareTo(b)).get();
System.out.println(miun);
// max value
 
 Integer maxu= intList.stream().max((a,b)-> a.compareTo(b)).get();
System.out.println(maxu);
System.out.println("with obj arrat");
