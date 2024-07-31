package other.tools;
//package tools;

public class Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public int sub(int n1, int n2)
	{
		return n1-n2;
	}
}




package tools;

public class AdvCalc extends Calc
{
	public int multi(int n1, int n2)
	{
		return n1*n2;
	}
	public int div(int n1, int n2)
	{
		return n1/n2;
	}
}




package other;

public class A
{
	
}




package com.google.Calculation;

//import tools.Calc;
//import tools.AdvCalc;
//import tools.*;
import other.tools.*;
//import.other.*;

//import java.util.ArrayList;
import java.lang.*;

public class Demo{
	public static void main(String args[])
	{
//		ArrayLis list=new ArrayList();
		
		Calc obj=new Calc();
		AdvCalc obj1=new AdvCalc();
		
		A obj2=new A();
		
		System.out.println();
	}
}