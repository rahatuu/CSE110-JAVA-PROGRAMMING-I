//Q01
import java.util.Arrays;
import java.util.Scanner;
public class Assignment07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N=");
    int N=sc.nextInt();
    int[] arr= new int[N];
    for(int i=0;i<N;i++){
       System.out.print("Enter a number:");
       arr[i]=sc.nextInt();}
    System.out.println("The elements of the array are:");
    for (int j=0;j<N;j++){
      System.out.println(j+": "+arr[j]);}
       
    int[]arra=new int[N+1];
    for (int k=0;k<N;k++){
      arra[k]=arr[k];}
    System.out.print("Enter another number: ");
    arra[N]=sc.nextInt();
    System.out.println("After resizing the array: ");
    for (int l=0;l<N+1;l++){
      if (l==N){
         System.out.print(arra[l]);}
      else{
        System.out.print((arra[l])+" ");}}}}
      
//Q02
import java.util.Arrays;
import java.util.Scanner;
public class Assignment07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] arr= {9, -5, 7, 9, -5, 5, 7};
    int len=arr.length;
    System.out.println("Before removing duplicates: ");
    for (int l=0;l<len;l++){
      if (l==len-1){
         System.out.print(arr[l]);}
      else{
        System.out.print((arr[l])+" ");}}
    System.out.println();
    for(int i=0;i<len;i++){
       for (int j=i+1;j<len;j++){
         if(arr[j]==arr[i]){
           arr[j]=0;}}}
    System.out.println("After replacing duplicates with 0: ");
    for (int k=0;k<len;k++){
      if (k==len){
         System.out.print(arr[k]);}
      else{
        System.out.print((arr[k])+" ");}}}}
    
//Q03
import java.util.Arrays;
import java.util.Scanner;
public class Assignment07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int N=sc.nextInt();
    int[] arr= new int[N];
    for(int i=0;i<N;i++){
       System.out.print("Enter a number: ");
       arr[i]=sc.nextInt();}    
    int[] newarr= new int[N];
    for(int i=N-1;i>=0;i--){
       newarr[(N-1)-i]=arr[i];} 
    
    System.out.println("Reversed using a new array: ");
    for (int j=0;j<N;j++){
      if (j==N){
        System.out.print(newarr[j]);}
      else{
        System.out.print((newarr[j])+" ");}}
    System.out.println();
    
    System.out.println("Reversed the original array: ");    
    for (int k=N-1;k>=0;k--){
      if (k==0){
        System.out.print(arr[k]);}
      else{
        System.out.print((arr[k])+" ");}}}}

//Q04
import java.util.Arrays;
import java.util.Scanner;
public class Assignment07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N= ");
    int N=sc.nextInt();
    int[] arr= new int[N];
    for (int l=0;l<N;l++){
         arr[l]=sc.nextInt();}
    System.out.println("Original array: ");
    for (int k=0;k<N;k++){
        System.out.print((arr[k])+" ");}
    System.out.println();
    for(int i=0;i<N;i++){
         if(arr[i]>0){
             arr[i]=1;}
         else if (arr[i]<0){
           arr[i]=0;}}
    System.out.println("After modifying: ");
    for (int j=0;j<N;j++){
      System.out.print((arr[j])+" ");}}}

//Q05
import java.util.Arrays;
import java.util.Scanner;
public class Assignment07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N= ");
    boolean flag=false;
    int index=0;
    int N=sc.nextInt();
    int[] arr= new int[N];
    for (int l=0;l<N;l++){
         System.out.print("Enter a number: ");
         arr[l]=sc.nextInt();}
    int numfind=sc.nextInt();
    for (int i=0;i<N;i++){
      if (arr[i]==numfind){
        index=i;
        flag=true;
        break;}
      else{
        flag=false;}}
    if (flag==false){
        System.out.println("Element not found");}
    else{
      System.out.println(numfind+" is at index "+index);}}}
   
//Q06
import java.util.Arrays;
import java.util.Scanner;
public class Assignment07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int N=sc.nextInt();
    double[] arr= new double[N];
    double sum=0.0;
    for(int i=0;i<N;i++){
       System.out.print("Enter a number:");
       arr[i]=sc.nextDouble();
       sum+=arr[i];}
    double max=0.0;
    double min=0.0;
    int maxindex=0;
    int minindex=0;
    for (int j=0; j<N;j++){
      if (j==0){
         max=arr[j];
         min=arr[j];}
      if (max<arr[j]){
        max=arr[j];
        maxindex=j;}
      if(min>arr[j]){
        min=arr[j];
        minindex=j;}}
    System.out.println("Maximum element "+max+" found at index "+maxindex);
    System.out.println("Minimum element "+min+" found at index "+minindex);
    System.out.println("Summation: "+sum);
    System.out.println("Average: "+(float)sum/N);}}
      
//Q07
import java.util.Scanner;
public class Assignment07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] arr=  {-5,10,-7,-5};
    System.out.println("Input array: ");
    for (int k=0;k<arr.length;k++){
        System.out.print((arr[k])+" ");}
    System.out.println();
    int[] newarr=new int [arr.length];
    int count=0;
    boolean flag = false;
    for (int i=0; i<arr.length;i++){
      if (newarr[0]==0){count++;newarr[0]=arr[0];i++;}
      flag = false;
      for (int j=0; j<count;j++){
        if (arr[i]==newarr[j]){
          flag = true;
          break;}
        if (flag!=true && j==count-1){
          newarr[count++]=arr[i];}}}
    System.out.println("New array: ");
    for (int i = 0; i < count; i++) {
            System.out.print(newarr[i] + " ");}}}

//Q08       
import java.util.Scanner;
public class Assignment07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int M = sc.nextInt();
        int[] arr = new int[M];
        System.out.println("Please enter the elements of the arr1:");
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();}
        System.out.print("Please enter the length of array 2: ");
        int N = sc.nextInt();
        int[] newarr = new int[N];
        System.out.println("Please enter the elements of the arr2:");
        for (int j = 0; j < N; j++) {
            newarr[j] = sc.nextInt(); }
        boolean subset = true;
        for (int k = 0; k < newarr.length; k++) {
            boolean found = false;
            for (int l = 0; l < arr.length; l++) {
                if (newarr[k] == arr[l]) {
                    found = true;
                    break;}}
            if (!found) { 
                subset = false;
                break;}}
        if (subset) {
            System.out.println("Array 2 is a subset of Array 1.");}
        else {
            System.out.println("Array 2 is not a subset of Array 1.");}}}
