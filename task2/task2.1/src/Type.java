public class Type { 
public static void main(String args[]) { 

	for (int i = 0; i < args.length; ++i){ 
		long tmp = Long.parseLong(args[i]); 
		if (tmp >= Byte.MIN_VALUE && tmp <= Byte.MAX_VALUE){ 
			System.out.println(tmp+" - byte"); 
		} 
		else if (tmp >= Short.MIN_VALUE && tmp <= Short.MAX_VALUE){ 
			System.out.println(tmp+" - short"); 
		} 
		else if (tmp >= Integer.MIN_VALUE && tmp <= Integer.MAX_VALUE){
			System.out.println(tmp+" - int"); 
		} 
		else if (tmp >= Long.MIN_VALUE && tmp <= Long.MAX_VALUE){ 
			System.out.println(tmp+" - long"); 
		} 
	} 
} 
}