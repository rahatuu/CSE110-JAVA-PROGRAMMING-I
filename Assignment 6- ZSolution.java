//Q1
import java.util.Scanner;
public class Assignment06{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    String inp=sc.nextLine();
    String newinp="";
    for(int i=0;i<inp.length();i++){
      if (97<=(int)inp.charAt(i) && (int)inp.charAt(i)<=122){
         newinp+=(char)((int)inp.charAt(i)-32);}
      else{
        newinp+=inp.charAt(i);}}
    System.out.println(newinp);}}
      
//Q2
import java.util.Scanner;
public class Assignment06{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    String inp=sc.nextLine();
    String newinp="";
    for(int i=inp.length()-1;i>=0;i--){
      newinp+=inp.charAt(i);}
    if (newinp.equals(inp)){
       System.out.println("true");}
    else{
      System.out.println("false");}}}

//Q3
import java.util.Scanner;
public class Assignment06{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    String inp=sc.nextLine();
    char sptr=sc.next().charAt(0);
    String newinp="";
    for(int i=0;i<inp.length();i++){
      if (inp.charAt(i)==sptr){
         System.out.println(newinp);
         newinp="";}
      else{
        newinp+=inp.charAt(i);}}
    System.out.println(newinp);}}
   
//Q4
import java.util.Scanner;
public class Assignment06{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    String inp=sc.nextLine();
    String newinp="";
    for(int i=inp.length()-1;i>=0;i--){
       newinp+=inp.charAt(i);}
    System.out.println(newinp);}}

//Q5
import java.util.Scanner;
public class Assignment06{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    String stri=sc.nextLine();
    String inp=stri.toLowerCase();
    int vcou=0;
    int ccou=0;
    for (int i=0;i<inp.length();i++){
      if (inp.charAt(i)=='a' || inp.charAt(i)=='e' || inp.charAt(i)=='i' || inp.charAt(i)=='o' || inp.charAt(i)=='u'){
        vcou++;}
      else if (inp.charAt(i) >= 'a' && inp.charAt(i) <= 'z'){  
        ccou++;}}
    if ((vcou>0 && vcou%3==0)&&(ccou>0 && ccou%5==0)){
      System.out.println("Aaarr! Me Plunder!!");}
    else
      System.out.println("Blimey! No Plunder!!");
    System.out.println(vcou);
    System.out.println(ccou);}}
             
//Q6
import java.util.Scanner;
public class Assignment06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String newinp = "";
        String rev = "";
        for (int i = inp.length() -1 ; i >= 0; i--) {
            if (inp.charAt(i) == ' ') {
                for (int j = newinp.length() - 1 ; j >= 0 ; j--) {
                    rev += newinp.charAt(j);}
                rev += " ";
                System.out.print(rev);
                newinp = "" ;
                rev = "";}
            else {
                newinp += inp.charAt(i);}}
        for (int j = newinp.length() - 1 ; j >= 0 ; j--) {
            rev += newinp.charAt(j);}
        System.out.print(rev);}}

//Q7
import java.util.Scanner;
public class Assignment06{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    String inp1=sc.nextLine();
    String inp2=sc.nextLine();
    String con="";
    for(int i=0;i<inp1.length();i++){
      if (inp2.indexOf(inp1.charAt(i))==-1){
        con+=inp1.charAt(i);}}
    for(int k=0;k<inp2.length();k++){
      if (inp1.indexOf(inp2.charAt(k))==-1){
         con+=(inp2.charAt(k));}}  
    System.out.println(con.toUpperCase());}}
         
//Q8
import java.util.Scanner;
public class Assignment06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stng = sc.nextLine(); 
        String newstr = ""; 
        int counter = 0; 
        for (int i = 0; i < stng.length(); i++) {
            char currentChar = stng.charAt(i);
            if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')) {
                if (counter % 2 == 0) {
                  newstr += Character.toLowerCase(currentChar);}
                else {
                  newstr += Character.toUpperCase(currentChar);}
                counter++;}
            else {
              newstr += currentChar;}}
        System.out.println(newstr);}}

//Q9
import java.util.Scanner;
public class ASSIGNMENT06{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String inp=sc.nextLine();
    int capcou=0;
    int lowcou=0;
    int digcou=0;
    int specou=0;
    for(int i=0;i<inp.length();i++){
      if (inp.charAt(i)>='A' && inp.charAt(i)<='Z'){
        capcou++;}
      else if (inp.charAt(i)>='a' && inp.charAt(i)<='b'){
        lowcou++;}
      else if(inp.charAt(i)>='0' && inp.charAt(i)<='9'){
        digcou++;}
      else{
        specou++;}}
    if (inp.length()>8){
      if (capcou>=1 && lowcou>=1 && digcou>=1 && specou>=1){
            System.out.println("True");}
      else{
        System.out.println("False");}}
    else{
      System.out.println("False");}}}