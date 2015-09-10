package com.datametica.test;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numLines=sc.nextInt();
		int count=1;
		String sign="";
		for (int i=0;i<numLines;i++)
		{
			sign="_";
		for(int j=numLines-1;j>=0;j--)
		{
			if(count>=j)
			{
				sign="*";
			}
		System.out.print(sign);
		}
		count++;
		System.out.println();
		}
	}

}
