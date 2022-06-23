package com.patterns.adapter.comapny;

import com.patterns.adapter.comapny.newhrsystem.Employee;
import com.patterns.adapter.comapny.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {

    @Override
    public double totalSalary(String[][] workers, double[] salaries) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < salaries.length; i++) {
            employees.add(new Employee(
                    workers[i][0],
                    workers[i][1],
                    workers[i][2],
                    new BigDecimal(salaries[i])
            ));
        }
        return calculateSalaries(employees).doubleValue();
    }
}
