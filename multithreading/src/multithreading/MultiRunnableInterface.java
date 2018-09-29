package multithreading;
class Multi1 implements Runnable{
	public void run(){
		System.out.println("Thread is running");
	}
}
public class MultiRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Multi1 m=new Multi1();
       Thread t1= new Thread(m);
       t1.start();
	}

}
