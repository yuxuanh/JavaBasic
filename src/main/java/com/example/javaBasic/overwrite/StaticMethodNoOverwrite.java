package com.example.javaBasic.overwrite;
/**
* @author yuxuanh
* @email 516060214@qq.com
* @version create time: 2019年12月6日 下午12:40:55
* Desc: 
*/
public class StaticMethodNoOverwrite {
	static int hello=1;
	int end=1;
	
	public static void show(){
		System.out.println("father show");
	}
	
	public void method(){
		System.out.println("father method");
	}
}
