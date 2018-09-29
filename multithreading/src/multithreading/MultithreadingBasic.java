package multithreading;
class Multi extends Thread{
	public void run(){
		System.out.println("Thread is running");
	}
}
public class MultithreadingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Multi m= new Multi();
      m.start();
	}

}
