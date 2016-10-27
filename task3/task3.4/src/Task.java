import java.util.*;

class Task{
	
	public static void main(String[] args) {
		
		float a = 0.3f;
		float b = 0.4f;
		float sum = a + b;
		float c = 0.7f;
		//2
		System.out.println(sum == c);
		compare(sum, c);	
	}
	
	public static void compare(float a, float b){
		
		if (Float.isNaN(a) && Float.isNaN(b)){
			System.out.println("a = b");
		}
		else {
			System.out.println("Enter accuracy: ");
			System.out.println(a);
			System.out.println(b);
			Scanner in = new Scanner(System.in);
			int accuracy = in.nextInt();
			System.out.println("a = b : " + (Math.abs(a-b) < Math.pow(10, -accuracy)));
		}
	}
}