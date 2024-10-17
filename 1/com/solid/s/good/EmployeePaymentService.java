package com.solid.s.good;

public class EmployeePaymentService {
    private  EmployeeAdditionalPaymentService additionalPaymentService;

    public EmployeePaymentService(EmployeeAdditionalPaymentService additionalPaymentService)
    {
        this.additionalPaymentService = additionalPaymentService;
    }

    public int calculatePay(GoodEmployee employee) {
        return switch (employee.getStatus()) {
            case "A" -> 1000 + additionalPaymentService.getAdditionalPay(employee);
            case "B" -> 2000 + additionalPaymentService.getAdditionalPay(employee);
            default -> 0;
        };
    }
}
