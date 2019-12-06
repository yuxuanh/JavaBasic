package com.example.javaBasic.overwrite;
/**
* @author yuxuanh
* @email 516060214@qq.com
* @version create time: 2019年12月6日 下午12:42:22
* Desc: 
*/
public class StaticMethodNoOverwriteSub extends StaticMethodNoOverwrite{
	static int hello=2;
	int end=2;
	
	public static void show(){
		System.out.println("sub show");
	}
	
	public void method(){
		System.out.println("sub method");
	}
	
	public static void main(String[] args) {
		StaticMethodNoOverwrite temp=new StaticMethodNoOverwriteSub();
		temp.show();
		temp.method();
		System.out.println(temp.hello);
		System.out.println(temp.end);
	}
}
