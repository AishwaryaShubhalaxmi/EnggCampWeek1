package multithreading;

class Tyre extends Thread{
	int tyres=0;
	public void run()
	{
		while(tyres<4)
		{
			try{
				tyres++;
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
				}
			new Count().count1();
				System.out.println("tyres " +  tyres);
			}
		}
	}


class Seat extends Thread{
	int seats=0;
	public void run()
	{
		while(seats<5)
		{
			try{
				seats++;
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
				}
			new Count().count2();
				System.out.println("seats " +  seats);
			}
		}
	}


class Engine extends Thread{
	int engines=0;
	public void run()
	{
		while(engines<1)
		{
			try{
				engines++;
				Thread.sleep(7000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
				}
			new Count().count3();
				System.out.println("engines " +  engines);
			}
		}
	}


class Frame extends Thread{
	int frames=0;
	public void run()
	{
		while(frames<1)
		{
			try{
				frames++;
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
				}
			new Count().count4();
				System.out.println("frames " +  frames);
			}
		}
	}

class Count{
	static int tyres,seats,engines,frames=0;
	void count1(){
		tyres++;
	}
	void count2(){
		seats++;
	}
	void count3(){
		engines++;
	}
	void count4(){
		frames++;
	}
	{
	if(tyres >=4 && seats>=5 && engines>=1 && frames>=1){
		System.out.println("Car made ");
		System.exit(0);
	}
}
}

