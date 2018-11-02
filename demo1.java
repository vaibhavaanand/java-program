import java.util.*;
class customexception extends Exception
{
customexception()
{
System.out.println("There is an error");
}
}
public class demo1
{
public static void main(String[]se)
{
Scanner b=new Scanner(System.in);
System.out.println("enter the marks");
String a=b.next();
System.out.println("enter the subject name");
String d=b.next();
try
{
if (a.equals("40")&& d.equals("Dbms"))
{
System.out.println("pass");
}
else
{
throw new customexception();}
}
catch(Exception e)
{
System.out.println();
}
}
}
