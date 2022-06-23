package com.patterns.adapter.comapny.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

public interface SalaryProcessor {

    BigDecimal calculateSalaries(List<Employee> employees);
}
