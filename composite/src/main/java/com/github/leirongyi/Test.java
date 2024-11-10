package com.github.leirongyi;

import com.github.leirongyi.composite.Department;
import com.github.leirongyi.composite.Designer;
import com.github.leirongyi.composite.Developer;
import com.github.leirongyi.composite.Employee;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建员工对象
        Employee developer1 = new Developer("小雷", 1000);
        Employee developer2 = new Developer("小李", 2000);
        Employee designer = new Designer("小易", 3000);

        // 创建部门对象
        Department developmentDepartment = new Department("Development");
        Department designDepartment = new Department("Design");

        // 为部门添加员工
        developmentDepartment.addEmployee(developer1);
        developmentDepartment.addEmployee(developer2);
        designDepartment.addEmployee(designer);

        // 创建公司对象（顶层组合）
        Department company = new Department("MyCompany");

        // 将部门添加到公司
        company.addEmployee(developmentDepartment);
        company.addEmployee(designDepartment);

        // 显示公司结构
        company.showDetails();
    }
}