package tests;

public class test2 {
static int i=10;
int b=20; 
void m1(){
System.out.println(i);
}
static void m2(){ 
    System.out.println(i);
}
public static void main(String[] args) { 
   test2 s =new test2();
   s.m1();
   test2 s1=new test2();
   s1.m2();
}
}