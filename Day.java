import java.io.*;
public class eo
{
public static void main (String args[])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int rem,suraj,ltdoy,codey,codem,date,month,year;
System.out.println("*Enter your date of birthday");
date=Integer.parseInt(in.readLine());
System.out.println("");
System.out.println("*Enter your month of your birthday");
month=Integer.parseInt(in.readLine());
System.out.println("");
System.out.println("*Enter your year of your birthday");
year=Integer.parseInt(in.readLine());
System.out.println("");
System.out.println("----------------------------------------------------------------------------------------------");
  
System.out.println("use this code for month");
System.out.println("jan=1; feb=4; mar=4; april=0; may=2; jun=5; july=0; aus=3; sep=6; oct=1; nov=4; dec=6;");
System.out.println("if you are born in leaf year then use this code");
System.out.println("jan leaf=0; feb leaf=3; and from march to december use above code");
System.out.println("*Enter the month code ");
codem=Integer.parseInt(in.readLine());
System.out.println("----------------------------------------------------------------------------------------------");

System.out.println("use this code for year");

System.out.println("if you born between 1600-1699 year = 6 ");
System.out.println("if you born between 1700-1799 year = 4  ");
System.out.println("if you born between 1800-1899 year = 2 ");
System.out.println("if you born between 1900-1999 year = 0 ");
System.out.println("if you born between2000-2099 year = 6 ");
System.out.println("if you born between 2100-2199 year = 4 ");

System.out.println("*Enter your year code");
codey=Integer.parseInt(in.readLine());
System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("             ");
System.out.println("              ");
System.out.println("*Enter the last two digits of date of birth year");
ltdoy=Integer.parseInt(in.readLine());
System.out.println("----------------------------------------------------------------------------------------------");

System.out.println("                       ");
System.out.println("collecting all your details");
System.out.println("");
System.out.println("wait...1 sec");
System.out.println(" ");
System.out.println("");
System.out.print("Date = "+date);
System.out.print("/"+month);
System.out.println("/"+year);
System.out.println("month code :- "+codem);
System.out.println("year code :- "+codey);
System.out.println("last two digit of year ="+ltdoy);
System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("");
System.out.println("Wait.....");
suraj= date+codem+codey+ltdoy+ltdoy/4;
rem= suraj%7;
System.out.println("You are born in =");
if(rem==1)
System.out.println("Sunday");
else if(rem==2)
System.out.println("Monday");
else if(rem==3)
System.out.println("Tuesday");
else if(rem==4)
System.out.println("Wednesday");
else if(rem==5)
System.out.println("Thursday");
else if(rem==6)
System.out.println("Friday");
else if(rem==0)
System.out.println("Saturday");
else
System.out.println("you have enter any wrong ditails please try again");
}
}
