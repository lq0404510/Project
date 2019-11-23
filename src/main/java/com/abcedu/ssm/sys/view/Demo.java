package com.abcedu.ssm.sys.view;

/**
 * @program: Test01
 * @description:
 * @author: Every
 * @create: 2019-11-23 14:02
 **/
public class Demo {

    static Demo d1 = new Demo();
    static Demo d2 = new Demo();

    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public Demo() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }

}
