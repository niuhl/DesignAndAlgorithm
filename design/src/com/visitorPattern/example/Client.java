package com.visitorPattern.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niuhonglei on 2017/9/14.
 */
public class Client {
    public static void main(String[] args) {
       Visitor visitor= new Visitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(visitor);
        }
        System.out.println("本公司的月工资总额："+visitor.getTotalSalary());
    }

    //模拟 出 公司 的 人员 情况， 我们 可以 想象 这个 数据 是 通过 持久 层 传递 过来 的
    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<Employee>();
        //产生 张三 这个 员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob(" 编写 Java 程序， 绝对 的 蓝领、 苦工 加 搬运工");
        zhangSan.setName(" 张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(1);
        empList.add(zhangSan);
        //产生 李四 这个 员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob(" 页面 美工， 审美 素质 太 不流 行了！");
        liSi.setName(" 李四");
        liSi.setSalary(1900);
        liSi.setSex(1);
        empList.add(liSi);
        //再 产生 一个 经理
        Manager wangWu = new Manager();
        wangWu.setName(" 王 五");
        wangWu.setPerformance(" 基本上 是 负值， 但是 我会 拍马屁 呀");
        wangWu.setSalary(18750);
        wangWu.setSex(0);
        empList.add(wangWu);
        return empList;
    }
}
