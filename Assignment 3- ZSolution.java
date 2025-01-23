//Task 01
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  if (a>b){ 
    if (a>c){
      System.out.println("largest number: "+a);}
    else{
      System.out.println("largest number: "+c);}}
  else if (b>c){
    System.out.println("largest number: "+b);}
  else{
    System.out.println("largest number: "+c);}
  }
}

//Task 02
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int mark=sc.nextInt();
  if (mark>89){
    System.out.println("Your grade is A");}
  else if (mark>84){
    System.out.println("Your grade is A-");}
  else if (mark>69){
    System.out.println("Your grade is B");}   
  else if (mark>56){
    System.out.println("Your grade is C");} 
  else if (mark>49){
    System.out.println("Your grade is D");}
  else{
    System.out.println("Your grade is F");}
  }
}

//Task 03
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  String ope=sc.next();
  if (ope.equals("+")){
    System.out.println(a+b);}
  else if (ope.equals("-")){
    System.out.println(a-b);}
  else if (ope.equals("*")){
    System.out.println(a*b);}
  else{  
    System.out.println(a/b);}
  }
}

//Task 04
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  if (a%5==0 && a%7==0){
    System.out.println("Divisible by Both");}
  else if (a%5==0 && a%7!=0){
    System.out.println("Invalid: Divisible by 5 Only");}
  else if (a%5!=0 && a%7==0){
    System.out.println("Invalid: Divisible by 7 Only");}
  else{ 
    System.out.println("No");}
  }
}

//Task 05
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int yr=sc.nextInt();
  if (yr%4==0){
    if (yr%100!=0){
       System.out.println(yr+" is a leap year");}
    else if (yr%100==0 && yr%400==0){
      System.out.println(yr+" is a leap year");}
    else{ 
      System.out.println(yr+" is not a leap year");}}
  else{
      System.out.println(yr+" is not a leap year");}
  }
}

//Task 06
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  if (num>0 && num%2==0){
      System.out.println("Number is positive and even");}
  else if (num>0 && num%2==1){
      System.out.println("Number is positive and odd");}
  else if (num<0){
      System.out.println("Number is negative");}
  else{
       System.out.println("Number is zero");}
  }
}

//Task 07
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int vx=sc.nextInt();
    if (vx>4){
      System.out.println("output: "+(int)(3*Math.pow(vx,2)+2));}
    else if (vx>1){
      System.out.println("output: "+(int)(Math.pow(vx,2)-1));}
    else if (vx>-1){
      System.out.println("output: "+(vx+1));}
    else{
       System.out.println("output: "+(2*vx));}
  }
}

//Task 08
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int sid=sc.nextInt();
  int a=sid%1000000;
  if (a/100000==1){
    System.out.println("Student Joined BRAC in Spring "+(sid/1000000));}
  else if (a/100000==2){
    System.out.println("Student Joined BRAC in Fall "+(sid/1000000));}
  else{ 
    System.out.println("Student Joined BRAC in Summer "+(sid/1000000));}
  }
}

//Task 09
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int sal=sc.nextInt();
  int age=sc.nextInt();
  if (age<18 || sal<10000){
    System.out.println("Your tax amounts in 0 Tk");}
  else if (10000<=sal && sal<=20000){
    System.out.println("Your tax amounts in "+(int)(sal*0.05)+" Tk");}
  else {
    System.out.println("Your tax amounts in "+(int)(sal*0.1)+" Tk");}
  }
}

//Task 10
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  float a=sc.nextFloat();
  float b=sc.nextFloat();
  float c=sc.nextFloat();
  if (a>b){
    if (a>c){
      System.out.println("Maximum number is "+a);}
    else{
      System.out.println("Maximum number is "+c);}}
  else if (b>c){
    System.out.println("Maximum number is "+b);}
  else{
    System.out.println("Maximum number is "+c);} 
  if (a<b){
    if (a<c){
      System.out.println("Minimum number is "+a);}
    else{
      System.out.println("Minimum number is "+c);}}
  else if (b<c){
    System.out.println("Minimum number is "+b);}
  else{
    System.out.println("Minimum number is "+c);} 
  }
}

//Task 11
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt(); 
  int c=sc.nextInt(); 
  if (a==b && a==c && b==c){
    System.out.println("This is a Equilateral triangle");}
  else if (a!=b && b!=c && c!=a){
    System.out.println("This is a Scalene triangle");}
  else {
    System.out.println("This is a Isosceles triangle");}
  }
}

//Task 12
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the amount the customer need to pay(Taka)");
  int togive=sc.nextInt();
  System.out.println("Enter the amount, customer gave(Taka)");
  int given=sc.nextInt(); 
  if ((given-togive)>0){
       System.out.println("The returned amount is "+(given-togive)+" taka");
       System.out.println("100 taka note: "+(given-togive)/100);
       System.out.println("50 taka note: "+((given-togive)%100)/50);
       System.out.println("20 taka note: "+(((given-togive)%100)%50)/20);
       System.out.println("10 taka note: "+((((given-togive)%100)%50)%20)/10);
       System.out.println("5 taka coin: "+(((((given-togive)%100)%50)%20)%10)/5);
       System.out.println("2 taka coin: "+((((((given-togive)%100)%50)%20)%10)%5)/2);
       System.out.println("1 taka coin: "+(((((((given-togive)%100)%50)%20)%10)%5)%2)/1);}
   else if ((given-togive)<0){   
      System.out.println("Please pay "+(togive-given)+" taka more.");}
   else {
      System.out.println("The returned amount is 0 taka");} 
  }
}

//Task 13
import java.util.Scanner;
public class Assignment03{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Input the 1st number: ");
  int a=sc.nextInt();
  System.out.println("Input the 2nd number: ");
  int b=sc.nextInt(); 
  System.out.println("Input the 3rd number: ");
  int c=sc.nextInt(); 
  if (a==b && a==c && b==c){
    System.out.println("All numbers are equal");}
  else if (a!=b && b!=c && c!=a){
    System.out.println("All numbers are different ");}
  else{ 
    System.out.println("Neither all are equal or different");}
  }
}