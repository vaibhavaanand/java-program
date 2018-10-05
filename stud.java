interface sturoll
{
void rollno();
void name();
void branch();
}

class stud implements sturoll
{
public void rollno()
{
System.out.println("1234");
}
public void name()
{
System.out.println("ABC");
}
public void branch()
{
System.out.println("CSE");
}
public static void main(String[]args)
{
stud s=new stud();
System.out.println("rollno:");
s.rollno();
System.out.println("name:");
s.name();
System.out.println("branch");
s.branch();
stud2 b=new stud2();
System.out.println("branch");
b.branch();
System.out.println("rollno:");
b.rollno();
System.out.println("name:");
b.name();
}}
class stud2 implements sturoll
{
public void branch()
{
System.out.println("CSE");
}
public void rollno()
{
System.out.println("1234");
}
public void name()
{
System.out.println("ABC");
}
}
