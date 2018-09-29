package multithreading;
class Multi2 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
public class MultithreadingSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
	Multi2 m=new Multi2();
	Multi2 m1=new Multi2();
	m.start();
	m1.start();
	}

}
