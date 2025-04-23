import java.util.*;
public class string {
    public static void main(String[] args) {
//        String s1="hello";
//        String s2=new String("helo");
//        System.out.println(s2);
//        String s = "Java Programming";
//        System.out.println(s.length());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//        System.out.println(s.charAt(2));
//        System.out.println(s.substring(5,10));
//        System.out.println(s.indexOf('a'));
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" Java");  // Modifies original string
//        System.out.println(sb);  // Output: Hello Java
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" Java");
//        System.out.println(sb);  // Output: Hello Java
//        StringTokenizer st=new StringTokenizer("my name is taran"," ");
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
        String str="madam";
        int n=str.length();
        char [] rts=new char[n];
        for(int i=0;i<n;i++){
            rts[n-i-1]=str.charAt(i);
        }
        System.out.println(rts);



    }
}
