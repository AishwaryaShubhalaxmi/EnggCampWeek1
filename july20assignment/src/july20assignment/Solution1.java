package july20assignment;

public class Solution1 {
	int x=10;
	static{
		System.out.println("Inside static class");
	}
	{
		System.out.println("Inside non static block");
	}
    Solution1(){
    	System.out.println("Inside constructor");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Inside main");
       new Solution1();
       new Solution1();
       
	}

}
