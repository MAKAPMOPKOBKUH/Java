public class CC{ 
public static void main(String[] args){ 
int chislo =Integer.parseInt(args[0], Integer.parseInt(args[1])), initial_system =Integer.parseInt(args[1]);//исходное сс 
int target_system = Integer.parseInt(args[2]);

System.out.println(initial_system + " CC - " + args[0]); 
System.out.println("10 CC -" + chislo);

int it_ch = 0; 
int i = 0; 
while(chislo > 0){ 
int p = chislo / target_system; 
int q = chislo % target_system; 

it_ch += Math.pow(10,i)*q; 
i++; 
chislo = p; 
} 

//System.out.println(target_system + "CC - "); 
if(it_ch==0) System.out.println(target_system + "CC - " + chislo); 
else System.out.println(target_system + " CC - " + it_ch); 
} 
}