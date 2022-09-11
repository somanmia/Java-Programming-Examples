public class String_method_exercise_1 {
    public static void main(String[] args) {
        
        
              // Strng Basic ....//
          char chararray[]={'a','b','c'};
          String a=new String(chararray);
          System.out.println("Char Array To String: "+a);
          String c="10";
          char k=Character.toUpperCase('k');
          System.out.println(k);
          System.out.println("String to Double Conversion: "+Double.parseDouble(c));
          
            
          //End of Basic................//
          System.out.println("METHOD REGERANCE");
            String str="canada";
            System.out.println("CharAt Method Use: "+str.charAt(0));
            System.out.println("Code Point Add Method use: "+str.codePointAt(1));
            System.out.println("UpperCase Method Use: "+str.toUpperCase());
            System.out.println("toLowerCase Method Use: "+str.toLowerCase());
            
            String gmail="admin@gmail.com";
            if(gmail.endsWith("@gmail.com")){
                System.out.println(" endsWith Method Use = Valid Gmail");
            }else{
                System.out.println("endsWith Method Use = Not Valid Gmail");
            }
            String phone="+88015454541";
            if(phone.startsWith("880")){
                System.out.println("startsWith Method Use: = Bd phone number is Valid ");
            }else{
                                System.out.println("startsWith Method Use: = Bd phone number is UnValid ");

            }
            
            String mail="admin@gmail.com";
            if(mail.contains("@")){
                System.out.println("Valid Mail");
            }else{
                System.out.println("Not Valid Mail");
            }
            String replace="bangladesh";
            String rep=replace.replaceAll("[aeiou]","");
            System.out.println("Remove Vowel: "+rep);
            String spremove="Dhaka is the capital of Bangladesh";
           
            String x="sherpur";
            char ch[]=x.toCharArray();
            for(int i=0;i<ch.length;i++){
                System.out.printf("Char Array [ %d ] = %c\n",i,ch[i]);
            }
            
            
    }
}
