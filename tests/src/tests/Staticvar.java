package tests;

public class Staticvar {
	static int i = 10;  // static variable 
    int b = 20;         // non static variable 
  void display() {     // non static method
    // static int a = 50;  //here a compile time error shows
     System.out.println(i);
  }
  static void show() {      // static method 
    System.out.println(i); // OK
   // System.out.println(b);
    
    //if I want access non-static variable in static method,
    //compiler throw error
 }
public static void main(String[] args) { 
    Staticvar s1 = new Staticvar(); 
 
    s1.show();
    s1.display();
  }
}

