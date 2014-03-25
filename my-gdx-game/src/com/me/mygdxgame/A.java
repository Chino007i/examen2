package com.me.mygdxgame;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;







public class A {
	//static int X;
	//	final int Y=200;

public static void main(String[]args){
	

	//	A a=new A();	
	//	A b=new A();	
	//	a.X=100;

	//System.out.println(A.X);
	
	File f;
	f=new File("Mi Archivo");
	try
	{
		FileWriter w=new FileWriter(f);
		BufferedWriter bw=	new BufferedWriter(w);
		PrintWriter wr=new PrintWriter(bw);
		wr.write("Escribiendo mi archivo");
		wr.append("Escribiendo un poco mas");
		
		wr.close();
		bw.close();
	}
	catch(Exception e)
	{
	};
}
	}
