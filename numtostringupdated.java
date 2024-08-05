import java.util.*;
public class numtostringupdated
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println(); 
        String st="",str= in.nextLine();;
        int l = str.length();
        char ch,chr;
        for(int i =0;i<l;i++)
        {
            chr=str.charAt(i);
            for(int j=i+1;j<l;j++)
            {
                 ch = str.charAt(j);
                if(Character.isDigit(ch))
                st=st+ch;
                if(Character.isLetter(str.charAt(j))||j+1==l)
                {
                    m1(chr,st);
                    st="";
                    i=j-1;
                    break;
                }
            }
        }
    }
    static void m1(char chr,String st)
    {
        int value = Integer.parseInt(st);
        for(int i=0;i<value;i++)
        {
           System.out.print(chr); 
        }
    }
}
