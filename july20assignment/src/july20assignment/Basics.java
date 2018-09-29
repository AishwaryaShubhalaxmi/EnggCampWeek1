package july20assignment;

public class Basics {
	// static int x=5;
  //   int y=x;
	int x=5;
//	static int y=x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Basics b= new Basics();
     System.out.println(b.x);
     System.out.println(new Basics().x);
    // System.out.println(b.y);                                    static-> load time
    //  System.out.println(y);                                     non static-> run time
      
	}

}
