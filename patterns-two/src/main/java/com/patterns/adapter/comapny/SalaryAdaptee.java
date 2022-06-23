package com.patterns.adapter.comapny;

import com.patterns.adapter.comapny.newhrsystem.CompanySalaryProcessor;
import com.patterns.adapter.comapny.newhrsystem.Employee;
import com.patterns.adapter.comapny.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor companySalaryProcessor = new CompanySalaryProcessor();
        return companySalaryProcessor.calculateSalaries(employees);
    }
}
