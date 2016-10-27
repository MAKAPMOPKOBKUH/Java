import java.math.*;

class Task {
	
	public static void main(String[] args) {
		
		float sum = 500; 
		float percent = 0.000001f;  
		float sum_percent = 0;
		for(int i = 1; i <= 12; i++) {
			sum_percent = sum * percent + sum_percent * percent;
		}
		sum += sum_percent;
		System.out.println("Cумма на счете через год: " + sum);
		
		BigDecimal sum_bd = new BigDecimal("500");
		BigDecimal percent_bd = new BigDecimal("0.000001");
		BigDecimal sum_percent_bd = new BigDecimal("0");
		
		for(int i = 1; i <= 12; i++) 
			sum_percent_bd = sum_bd.add(sum_bd.multiply(percent_bd));
			System.out.println("Cумма на счете через год: " + sum_percent_bd);
	}
}