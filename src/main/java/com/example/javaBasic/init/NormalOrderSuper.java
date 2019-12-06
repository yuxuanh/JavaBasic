package com.example.javaBasic.init;
/**
* @author yuxuanh
* @email 516060214@qq.com
* @version create time: 2019年12月6日 上午11:09:08
* Desc: use in NormalOrderSub
*/
public class NormalOrderSuper {
static int parentStaticField = 1;
    
    final static int parentFinalStaticField = 2;
    
    int parentSubField = 3;

    static {
    	System.out.println("====================================================");
        System.out.println("parent static!");
        System.out.println("SubStatic field:" + NormalOrderSub.subStaticField);
        System.out.println("SubFinalStatic field:" + NormalOrderSub.subFinalStaticField);
        System.out.println("ParentStatic field:" + parentStaticField);
        System.out.println("ParentFinalStatic field:" + parentFinalStaticField);
    }
    
    
    {
    	System.out.println("====================================================");
        System.out.println("parent not static!");
        System.out.println("SubStatic field:" + NormalOrderSub.subStaticField);
        System.out.println("SubFinalStatic field:" + NormalOrderSub.subFinalStaticField);
        System.out.println("ParentStatic field:" + parentStaticField);
        System.out.println("ParentFinalStatic field:" + parentFinalStaticField);
        System.out.println("Parent field:" + parentSubField);
    }
    
    public NormalOrderSuper() {
    	System.out.println("====================================================");
        System.out.println("parent construct！");
    }
    
    public static void main(String[] args) {
		new NormalOrderSuper();
	}
}
