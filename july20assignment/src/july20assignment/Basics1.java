package july20assignment;

class Solution {
	static int x = 5;
	//static private int y = 10;
	static int y=10;
	static protected int z = 9;
	static public int e = 1;

	public static void main() {
		System.out.println(x);

	}

}

public class Basics1 {

	static Solution s = new Solution();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.z);
		System.out.println(s.e);
	}

}
