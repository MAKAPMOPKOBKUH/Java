public class Calc {

    public static void main (String[] args){

        String s = args[0];
        char [] ch = s.toCharArray();
        String str1 = "";
        String str2 = "";
        String operator = "";
        char charTmp = ' ';
        int count = 0;
        int countFirsDigit = 0;
        int countSecondDigit= 0;
        double x = 0;
        double y = 0;

        while (count < ch.length - 1){
            char c = ch[countFirsDigit];

            if(Character.isDigit(c)){ 
                String strTmp = Character.toString(c);
                str1 = str1.concat(strTmp); //���������� ������������������ ��������
                x = Double.parseDouble(str1);
                countFirsDigit++; 
                count++; 
                countSecondDigit++; 

            } else {
                countSecondDigit++;
                count = countSecondDigit;

                charTmp = c; //���������� ��������
                operator = Character.toString(charTmp);

                char c2 = ch[countSecondDigit];

                if(Character.isDigit(c2)){
                    String strTmp = Character.toString(c2);
                    str2 = str2.concat(strTmp);
                    y = Double.parseDouble(str2);
                }
            }
        }
        if (operator.equals("*")){
            System.out.println("= " + (x * y));
        }
        if (operator.equals("/")){
            System.out.println("= " + (x / y));
        }
        if (operator.equals("+")){
            System.out.println("= " + (x + y));
        }
        if (operator.equals("-")){
            System.out.println("= " + (x - y));
        }
    }

}