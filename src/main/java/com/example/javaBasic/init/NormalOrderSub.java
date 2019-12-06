package com.example.javaBasic.init;
/**
* @author yuxuanh
* @email 516060214@qq.com
* @version create time: 2019年12月6日 上午11:10:42
* Desc: 
* result is 
====================================================
parent static!
SubStatic field:0
SubFinalStatic field:2
ParentStatic field:1
ParentFinalStatic field:2
====================================================
Sub static!
SubStatic field:0
SubFinalStatic field:2
====================================================
main
====================================================
parent not static!
SubStatic field:1
SubFinalStatic field:2
ParentStatic field:1
ParentFinalStatic field:2
Parent field:3
====================================================
parent construct！
====================================================
Sub no static!
SubStatic field:1
SubFinalStatic field:2
====================================================
Sub Construct!
*/
public class NormalOrderSub extends NormalOrderSuper {
    static int subStaticField = 1;
    
    final static int subFinalStaticField = 2;
    
    int subField = 3;
    
    static {
    	System.out.println("====================================================");
        System.out.println("Sub static!");
        System.out.println("SubStatic field:" + NormalOrderSub.subStaticField);
        System.out.println("SubFinalStatic field:" + NormalOrderSub.subFinalStaticField);
    }

    
    {
    	System.out.println("====================================================");
        System.out.println("Sub no static!");
        System.out.println("SubStatic field:" + NormalOrderSub.subStaticField);
        System.out.println("SubFinalStatic field:" + NormalOrderSub.subFinalStaticField);
    }
    
    public NormalOrderSub() {
    	System.out.println("====================================================");
        System.out.println("Sub Construct!");
    }
    
    public static void main(String[] args) {
    	System.out.println("====================================================");
    	System.out.println("main");
        new NormalOrderSub();
    }
}
