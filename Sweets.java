package com.epam;
import java.io.*;
import java.util.*;

	
	


public class Sweets
{
    static int price;
	static int milk_based_chocolate;
	static int white_chocolate;
	static int dark_chocolate;
	static int weight,count;
	public static void main(String args[])
	{        Scanner sc=new Scanner(System.in);
	
        int i,sum=0,k;
        		
		 	System.out.println("Enter the number of gifts");
		 	count=sc.nextInt();
		 	for(i=0;i<count;i++)
		 	{
		System.out.println("Enter details of sweets");
		price=sc.nextInt();
		milk_based_chocolate=sc.nextInt();
		white_chocolate=sc.nextInt();
		dark_chocolate=sc.nextInt();
		weight=sc.nextInt();
		 	
	
		
        
	


NewYearGift_Sweets s=new NewYearGift_Sweets(price,milk_based_chocolate,white_chocolate,dark_chocolate,weight);
s.sort_chocolates();
sum=sum+weight;
}



System.out.println("Total weight is "+sum);

       
    
}
       
}

 class NewYearGift_Sweets {
  static	int price;
 static	int milk_based_chocolate;
static	int white_chocolate;
static	int dark_chocolate;
static	int weight;
static	int count;
static	int milk=0;
static int white=0;
static int dark=0;
	static int candy=0;
	static	 int i=0,k;
	
public	 NewYearGift_Sweets(int price,int milk_based_chocolate,int white_chocolate,int dark_chocolate,int weight)
	{
	   this.price=price;
		this.milk_based_chocolate=milk_based_chocolate;
		this.white_chocolate=white_chocolate;
		this.dark_chocolate=dark_chocolate;
		this.weight=weight;
	}
	 static void sort_chocolates()
	 {
		 
		 
		 
		 if(price>100 && milk_based_chocolate==1 && white_chocolate==0 && dark_chocolate==0 && weight>10)
		 {
			 milk=milk+1;
			 
		 }
		 else if(price>100 && milk_based_chocolate==0 && white_chocolate==1 && dark_chocolate==0 && weight>10)
		 {
			 white=white+1;
			 
		 }
		 else if(price>100 && milk_based_chocolate==0 && white_chocolate==0 && dark_chocolate==1 && weight>10)
		 {
			 dark=dark+1;
			 
		 }
		 else if(price<100 && milk_based_chocolate==0 && white_chocolate==0 && dark_chocolate==0 && weight<10)
		 {
			 candy=candy+1;
		 }
		 else
		 {
			 System.out.println(" not a sweet");
		 }
		 
		     System.out.println(" chocolates");

System.out.println("Milk "+milk);
System.out.println("White "+white);
System.out.println("Dark "+dark);
System.out.println("Candy "+candy);

		 }
		 
}	 


          
         
	



