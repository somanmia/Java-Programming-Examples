package String;
public class StringBulder {
    public static void main(String[] args) {
        String str="Bangla";
        StringBuilder sb=new StringBuilder(str);
        sb.append("des");
        System.out.println("Append Method Use: "+sb);
        sb.appendCodePoint(104);
        System.out.println("AppendCodePont Method Use: "+sb);
        sb.insert(1,"@");
        System.out.println("Insert Method Use: "+sb);
        sb.replace(1,3,"a");
        System.out.println("Replace Method Use: "+sb);
        sb.reverse();
        System.out.println("Reverse Method Use: "+sb);
        sb.deleteCharAt(0);
        System.out.println("DeleteCharAt method Use: "+sb);
        sb.delete(0,sb.toString().length()-1);
        System.out.println("Delete Method Use: "+sb);
    }
 
}
