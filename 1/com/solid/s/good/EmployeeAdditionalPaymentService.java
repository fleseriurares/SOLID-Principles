package com.solid.s.good;

public class EmployeeAdditionalPaymentService {

    public int getAdditionalPay(GoodEmployee employee) {
       int hoursWorked = employee.getHours();
       if(hoursWorked > 40)
       {
           return (hoursWorked - 40) * 100;
       }
        return 0;
    }
}
