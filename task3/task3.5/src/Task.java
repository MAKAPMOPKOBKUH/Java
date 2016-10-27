class Task {
	
	public static void main(String[] args) {
		
		float f1 = 0.0f/1.0f;
		float f2 = 0.0f/-1.0f;
		System.out.println("f1="+f1);
		System.out.println("f2="+f2);
		System.out.println("f1==f2: "+(f1==f2));
		compare(f1, f2);	
	}
	
	public static void compare(float a, float b){
		int a1 = Float.floatToIntBits(a);
		int b1 = Float.floatToIntBits(b);
		System.out.println("a : "+ Integer.toBinaryString(a1));
		System.out.println("b : "+ Integer.toBinaryString(b1));
		System.out.println("a == b: "+(a1 == b1));
	}
}