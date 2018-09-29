package multithreading;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Tyre ob= new Tyre();
         ob.start();
         Seat ob1= new Seat();
         ob1.start();
         Engine ob2= new Engine();
         ob2.start();
         Frame ob3= new Frame();
         ob3.start();
	}

}
