package overloading;

public class karthik {


public void worker(int id ) {
	System.out.println(id);
}
public void worker (String name) {
	System.out.println(name);
}
public void worker (float num ) {
	System.out.println(num);
}
public void worker (long mobile) {
	System.out.println("mobile");
	
}
public void worker (byte n) {
	System.out.println(n);
}

public void worker(Double salary) {
	System.out.println(salary);

}
   
public static void main(String[] args) {
	karthik k=new karthik();
	k.worker(1234);
	k.worker("jhgfd");
	k.worker(123456789);
	k.worker(112345667);
	k.worker(23456);
	k.worker(55);

	
	
}
} 

