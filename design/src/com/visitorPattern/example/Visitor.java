package com.visitorPattern.example;

/**
 * Created by niuhonglei on 2017/9/14.
 */
public class Visitor implements IVisitor {
    private int commonTotalSalary=0;
    private int managerTotalSalary=0;
    private void calManagerSalary(int salary){
        this.managerTotalSalary = this.managerTotalSalary+salary*5;
    }
    private void calCommonEmployeeSalary(int salary){
        this.commonTotalSalary = this.commonTotalSalary+salary*2;
    }
    public int getTotalSalary(){
        return this.commonTotalSalary+this.managerTotalSalary;
    }
    @Override
    public void visit(CommonEmployee commonEmployee) {
        calCommonEmployeeSalary(commonEmployee.getSalary());
        System.out.println(getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        calManagerSalary(manager.getSalary());
        System.out.println(getManagerInfo(manager));
    }
    private String getBasicInfo(Employee employee){
        String info = "姓名:" + employee.getName() + "\t";
        info += "性别:" + employee.getSex() + "\t";
        info += "薪水:" + employee.getSalary() + "\t";
        return info;
    }
    private String getManagerInfo(Manager manager){
        String basicInfo=this.getBasicInfo(manager);
        String otherInfo = "业绩："+manager.getPerformance()+"\t";
        return basicInfo+otherInfo;
    }
    private String getCommonEmployeeInfo(CommonEmployee commonEmployee){
        String basicInfo=this.getBasicInfo(commonEmployee);
        String otherInfo = "工作："+commonEmployee.getJob()+"\t";
        return basicInfo+otherInfo;
    }
}
