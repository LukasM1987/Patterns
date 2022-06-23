package com.patterns.adapter.company;

import com.patterns.adapter.comapny.SalaryAdapter;
import com.patterns.adapter.comapny.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryAdapterTestSuite {

    @Test
    void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        //When
        double totalSalary = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());

        //Then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750.0);

    }
}
