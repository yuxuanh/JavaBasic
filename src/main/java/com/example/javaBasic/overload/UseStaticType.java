package com.example.javaBasic.overload;

import java.util.ArrayList;
import java.util.Collection;

/**
* @author yuxuanh
* @email 516060214@qq.com
* @version create time: 2019年12月6日 下午12:19:14
* Desc: result is: static type
*/
public class UseStaticType {
	public static void main(String[] args) {
		UseStaticType temp=new UseStaticType();
		//这里静态类型是collection, 实际类型是arraylist
		//重载用静态类型
		Collection c = new ArrayList();
		temp.method(c);
	}
	
	public void method(Collection c){
		System.out.println("static type");
	}
	
	//重载只能是输入输出的区别，static是不算重载，放开会报错
//	public static void method(Collection c){
//		System.out.println("static medthod static type");
//	}
	
	public void method(ArrayList a){
		System.out.println("real type");
	}
}
