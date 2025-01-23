//Task1
 //a) Legal cause this is a valid identifier. It follows all the rules for Java identifiers.
 //b) Illegal cause identifiers cannot start with a digit.
 //c) Illegal cause identifiers cannot contain periods and cannot start with a digit.
 //d) Legal cause this is a valid identifier. It follows all the rules for Java identifiers. But starting with lowercase would be better.
 //e) Illegal cause identifiers cannot contain quotation marks.
 //f) Although it is unusual but a valid identifier. Identifiers can start with a dollar sign $. But it is suggested to use more user friendly variables.
 //g) Illegal cause identifiers cannot contain forward slashes.
 //h) Illegal cause identifiers cannot contain hyphens. Hyphens are interpreted as the subtraction operator.
 //i) Illegal cause identifiers cannot contain the plus sign. The plus sign is an arithmetic operator.
 //j) Illegal cause identifiers cannot contain single quotation marks.
 //k) Illegal cause return is a reserved keyword in Java and cannot be used as an identifier.

//Task2.1,2.2,2.3
public class Assignment02{
  public static void main(String[] args){
  int inte1= 345;
  int inte2=234;
  System.out.println(inte1);
  System.out.println(inte2);
  System.out.println("Sum of two integers: "+(inte1+inte2));
  System.out.println("Product of two integers: "+(inte1*inte2));
  System.out.println("Division of two integers: "+(inte1/inte2));
  }
}

//Task2.4
public class Assignment02{
  public static void main(String[] args){
  double inte1= 345;
  double inte2= 234;
  System.out.println(inte1);
  System.out.println(inte2);
  System.out.println("Sum of two integers: "+(inte1+inte2));
  System.out.println("Product of two integers: "+(inte1*inte2));
  System.out.println("Division of two integers: "+(inte1/inte2));
  }
}

//Task2.5
public class Assignment02{
  public static void main(String[] args){
  double inte1= 345;
  int inte2= 234;
  System.out.println(inte1);
  System.out.println(inte2);
  System.out.println("Sum of two integers: "+(inte1+inte2));
  System.out.println("Product of two integers: "+(inte1*inte2));
  System.out.println("Division of two integers: "+(inte1/inte2));
 }
}

//Task2.6
public class Assignment02{
  public static void main(String[] args){
  String inte1= "wuwwe";
  String inte2= "courses";
  int inte3= 4454;
  System.out.println(inte1);
  System.out.println(inte2);
  System.out.println("Sum of two strings: "+inte1+" "+inte2);
  System.out.println("Sum of two strings: "+inte1+inte3);
  System.out.println("Sum of two strings: "+inte3+inte2);
  }
}
  
//Task3
public class Assignment02{
  public static void main(String[] args){
  int rad= 4;
  double circum=(2*Math.PI*4) ;
  double area=(Math.PI*Math.pow(4,2)) ;
  System.out.println(circum);
  System.out.println(area);
  }
}
  
//Task4
public class Assignment02{
  public static void main(String[] args){
    int integ=3254;
    int la2=integ%100;
    System.out.println(la2);
    }
}

//Task5
public class Assignment02{
  public static void main(String[] args){
    int inches=1000;
    double metre=inches*0.0254;
    System.out.println(inches+" inch is "+metre+" meters");
    }
}

//Task6a
public class Assignment02{
  public static void main(String[] args){
      int a=56;
      int b=24;
      int c=a;
      a=b;
      b=c; 
      System.out.println(a);
      System.out.println(b);
    }
}

//Task6b
public class Assignment02{
  public static void main(String[] args){
    int a=56;
    int b=24;
    a=(54+26)-a;
    b=(54+26)-a;
    System.out.println(a);
    System.out.println(b);
    }
}

//Task7
public class Assignment02{
  public static void main(String[] args){
    int mnts=3456789;
    int yr=mnts/(365*24*60);
    int remnts=mnts%(365*24*60);
    int days=remnts/(24*60);
    System.out.println(mnts+" minutes is approximately "+yr+" years and "+days+" days");
    }
}

//Task8
public class Assignment02{
  public static void main(String[] args){
    int a=2;
    int b=5;
    int c=8;
    int d=((2*b)*((c-a)/3))+7;
    System.out.print(d);
   }
}

//Task9
import java.util.*;
public class Assignment02{
    public static void main(String[] args) {
        Scanner HelloWorld= new Scanner(System.in); 
        int n = HelloWorld.nextInt();
        System.out.println(n+"×1="+n*1);
        System.out.println(n+"×2="+n*2);
        System.out.println(n+"×3="+n*3);
        System.out.println(n+"×4="+n*4);
        System.out.println(n+"×5="+n*5);
        System.out.println(n+"×6="+n*6);
        System.out.println(n+"×7="+n*7);
        System.out.println(n+"×8="+n*8);
        System.out.println(n+"×9="+n*9);
        System.out.println(n+"×10="+n*10);
    }
}


//Task10
public class Assignment02{
  public static void main(String[] args){
    int totnum=100;
    int start=1 ;
    int end=100;
    int sum=(totnum/2)*(start+end);
    System.out.print(sum);
   }
}

//Task11
public class Assignment02{
  public static void main(String[] args){
       double a=4.5;
       double b=9.5;
       double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
       System.out.printf("sin(A)= %f%ncos(A)= %f%nsin(B)=%f%ncos(B)=%f",(a/c),(b/c),(b/c),(a/c));
       
   }
}

//Task12
public class Assignment02{
  public static void main(String[] args){
    int stuid=23301569;
    int last2=stuid%100;
    System.out.println(last2%10);
    System.out.println(last2/10);
   }
}

//Task13
public class Assignment02{
  public static void main(String[] args){
    double dista=2500;
    double totime=(5+(56.0/60)+(23.0/3600));
    double velkmh=(dista/1000)/totime;
    double velmlh=(dista/1609)/totime;
    System.out.printf("Your velocity in km/h is: %.7f%nYour velocity in miles/h is: %.7f",velkmh,velmlh);
    
   }
}

//Task14
public class Assignment02{
  public static void main(String[] args){
    double a=8/2;
    double b=3;
    double s=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    double area= 6*s;
    double circum=((3*Math.sqrt(3))*Math.pow(s,2))/2.0;
    System.out.printf("Area of Hexagon is: %.2f%nCircumference of hexagon is: %.2f",area,circum);
    
   }
}

