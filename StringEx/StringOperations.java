package StringEx;

public class StringOperations {
    public static void main(String[] args){
        String s= "Java Programming";
        int i=s.length();
        System.out.println("String length is:"+i);
        char c= s.charAt(5);
        System.out.println("CharAt index of is:"+c);
        System.out.println("substring is:"+s.substring(5));
        System.out.println("substring is:"+s.substring(0,4));
        System.out.println("lowercase is:"+s.toLowerCase());
        System.out.println("uppercase is:"+s.toUpperCase());
        System.out.println("replace of string is:"+s.replace('m','M'));
        System.out.println("Contains in a string is:"+s.contains("Jav"));

        String s1="Java Programming";
        String s2= new String(s1);
        
        System.out.println(s1==s2);  //checks reference in String
        System.out.println(s==s1);  //checks reference
        System.out.println(s==s2);  //checks reference

        System.out.println("\n"+s.equals(s1));  //checks values
        System.out.println(s1.equals(s2));  //checks values
        System.out.println(s.equals(s2));  //checks values

    }
}
