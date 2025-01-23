//Task01(a)
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    int num= 24;
    while (num>=-6){
      if (num==-6){
        System.out.print(num);}
      else{
        System.out.print(num+", ");}
      num-=6;
    }
  }
}

//Task01(b)
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    int num= -10;
    while (num<=20){
      if (num==20){
        System.out.print(num);}
      else{
        System.out.print(num+", ");}
      num+=5;
    }
  }
}


//Task02
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("N = "); 
    int totn=sc.nextInt();
    int count=0;
    int sum=0;
    System.out.println("Input the 5 numbers:  ");
    for (int cou=1;cou<=totn;cou++){
      int num=sc.nextInt();
      sum+=num;
      count+=1;}
    System.out.println("The sum of "+totn+" no is: "+sum);
    System.out.println("The Average of is: "+(float)(sum/count));
  }
}

//Task03
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    while (true) {
      int inp=sc.nextInt();
      if (inp<0){
        System.out.println("Enter Number: "+inp);
        break;}
      else{
         System.out.println("Enter Number: "+inp);
         System.out.println(inp+"^2 = "+(int)Math.pow(inp,2) );}   
    }
  }
}

//Task04
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int inp=sc.nextInt();
    System.out.println("Divisors of "+inp+":");
    for(int cou=1;cou<=inp;cou++){
      if (inp%cou==0){
        System.out.println(cou);}
      else{
        continue;}
    }
  }
}



//Task05
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter an integer:");
    int inp=sc.nextInt();
    int neco=0;
    int poco=0;
    for(int cou=1;cou<=9;cou++){
       System.out.print("Enter number "+cou+" :");
       int num=sc.nextInt();
       if (num<0){
         neco+=1;}
       else{
         poco+=1;}}
    System.out.println(poco+" Non-negative Numbers");
    System.out.println(neco+" Negative Numbers");
  }
}


//Task06
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Input number of terms: ");
    int inp=sc.nextInt();
    int sum=0;
    int term=0;
    int count=1;
    System.out.println("The odd numbers are: ");
    while (count%2!=0){
      if (term<inp){
         System.out.println(count);
         sum+=count;
         term+=1;}
      else{
         break;}
      count+=2;}
    System.out.print("The Sum of odd Natural Numbers up to "+inp+" terms is: "+sum);
  }
}


//Task07
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int sum=0;
    for (int cou=0;cou<10;cou++){
       System.out.print("Enter number : ");
       int inp=sc.nextInt();
       sum+=inp;
       System.out.println("Sum = "+sum);}
  }
}

//Task08
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int inp=sc.nextInt();
    for (int cou=0;cou<=inp;cou++){
      if (cou%5==0 && cou%3!=0){
        System.out.println(cou);}
        else{
          continue;}
    }
  }
}

//Task09
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int inp=sc.nextInt();
    int count=0;
    while (true){
      if (inp>0){
         inp=(inp/10);
         count+=1;}
      else{
        break;}}
    System.out.println("Total digits = "+count);
  }
}

//Task10
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    int divi = 1;
    int cou = 0;
    int store = num;
    int po = 0;
    while(num>0){
        divi = num%10;
        cou+=1;
        num = num/10;}
    int digit = 0;
    while(store>0){
      po = (int)Math.pow(10, cou-1);
      digit = store/po;
      System.out.print(digit);
      store = store%po;
      cou-=1;
      if(store>0){
        System.out.print(",");} }
  }
}


//Task11
import java.util.Scanner;
public class Assignment04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int inp=sc.nextInt();
    int count=0;
    int sumdi=0;
    for (int i=1;i<=inp;i++){
      if (inp%i==0){
         count+=1;
         sumdi+=i;}
      else{
        continue;}}
    if ((sumdi-inp)==inp){
      System.out.printf("%d is not a prime number %n%d is a perfect number",inp,inp);}
    else if(count==2){
       System.out.printf("%d is a prime number %n%d is not a perfect number",inp,inp);}
    else{
       System.out.printf("%d is not a prime number %n%d is not a perfect number",inp,inp);}
  }
}