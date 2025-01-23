//Q1
import java.util.Scanner;
public class ASSIGNMENT05{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int inp=sc.nextInt();
   int oddcount=0;
   int divicount=0;
   for (int i=2;oddcount<inp;i++){
     for (int j=1;j<=i;j++){
       if (i%j==0){
         divicount++;}}
     if(divicount==2){
         System.out.println(i);
         oddcount++;}
     divicount=0;}}}

//Q2
import java.util.Scanner;
public class ASSIGNMENT05{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("The value of N:");
   int inp=sc.nextInt();
   int sum=0;
   for(int st=1;st<=inp;st++){
      for (int i=1;i<=st;i++){
        sum-=i;}}
   System.out.println("The value of y:"+sum);}}


//Q3
import java.util.Scanner;
public class ASSIGNMENT05{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Number:");
   int inp=sc.nextInt();
   int totdivi=0;
   while(inp%2==0){
     for (int i=1;i<=inp;i++){
        if (inp%i==0){
          totdivi++;}}
     System.out.println(inp+" has "+totdivi+" divisors");
     totdivi=0;
     inp=sc.nextInt();}}}
  
//Q4
import java.util.Scanner;
public class ASSIGNMENT05{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int inp=sc.nextInt();
   int oddcount=0;
   int oddsum=0;
   for(int i=1;i<=inp;i++){
     int x=sc.nextInt();
     int y=sc.nextInt();
     while(oddcount<y){
       if (x%2!=0){
         oddsum+=x;
         oddcount++;}
       x++;}
     System.out.println(oddsum);
     oddcount=0;
     oddsum=0;}}}    


//Q5
import java.util.Scanner;
public class ASSIGNMENT05{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int length=sc.nextInt();
   int width=sc.nextInt();
   for (int i=1;i<=width;i++){
     for (int j=1;j<=length;j++){
       System.out.print(j+" ");}
     System.out.println("");}}}
         

//Q6
import java.util.Scanner;
public class ASSIGNMENT05{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int height=sc.nextInt();
   for (int i=1;i<=height;i++){
     for (int k=1;k<=(height-i);k++){
       System.out.print("   ");}
     for (int j=1;j<=i;j++){
       if (j==i){
          System.out.print(j);}
       else{
         System.out.print(j+" ");}}
     System.out.println("");}}}

//Q7                                                   
import java.util.Scanner;
public class ASSIGNMENT05{
  public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Height:");
    int height=sc.nextInt();
    
    for(int i=1;i<=height;i++){
      for(int j=0;j<=height-i;j++){
        System.out.print(" ");
      }
      for(int k=1;k<=(2*i-1);k++){
        System.out.print(k+" ");
      }
      System.out.println();
    }
  }
}


//Q8
import java.util.Scanner;
public class ASSIGNMENT05{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Start: ");
   int num1=sc.nextInt();
   System.out.print("End: "); 
   int num2=sc.nextInt();
   int sum=0;
   System.out.println("Armstrong numbers: ");
   for (int i=num1;i<=num2;i++){
     int temp=i;
     int digit=String.valueOf(temp).length();
     while(temp>0){
        sum+= (int)Math.pow((temp%10),digit);
        temp/=10;} 
     if (sum==i){
       System.out.println(i);}
     sum=0;}}}
