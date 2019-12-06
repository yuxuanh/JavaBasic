package com.example.javaBasic.init;

/**
* @author yuxuanh
* @email 516060214@qq.com
* @version create time: 2019年12月6日 上午10:44:45
* Desc: result is 
* 构造块
* 构造函数
* 构造块
* 构造函数
* 静态块
* ........
* main
* 构造块
* 构造函数
*/
public class StaticOnlyOnce {
	public StaticOnlyOnce(){
		System.out.println("构造函数");
	}
	
	
	{
		System.out.println("构造块");
	}

	/**
	 * 静态块和下面两个静态参数互换位置，结果不一样
	 */
	public static StaticOnlyOnce t1=new StaticOnlyOnce();
	public static StaticOnlyOnce t2=new StaticOnlyOnce();
	static
	{
		System.out.println("静态块");
		System.out.println(StaticOnlyOnce.t1);
	}
	
	
	public static void main(String[] args) {
		System.out.println("main");
		StaticOnlyOnce t=new StaticOnlyOnce();
	}
}
