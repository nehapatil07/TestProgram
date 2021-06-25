package tests;

public class statictest {
static int i=10;
public static void main(String[] args) {
	System.out.println(statictest.i);
	statictest s=new statictest();
	System.out.println(s.i);
	
}
}
