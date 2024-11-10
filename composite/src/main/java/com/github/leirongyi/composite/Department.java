package com.github.leirongyi.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 部门 (Composite 持有子组件，可以是叶子节点，也可以是组合节点)
 */
public class Department implements Employee {
    private String name;
    private final List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }
    // 添加子员工或子部门
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    // 移除子员工或子部门
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        // 委托给每个员工或部门
        employees.forEach(Employee::showDetails);
    }
}
