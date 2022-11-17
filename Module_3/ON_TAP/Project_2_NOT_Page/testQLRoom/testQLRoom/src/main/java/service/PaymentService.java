package service;

import model.Payment;
import reponsitory.IPaymentReponsitory;
import reponsitory.iml.PaymentReponsitory;

import java.util.List;

public class PaymentService implements IPaymentService{
    IPaymentReponsitory paymentReponsitory = new PaymentReponsitory();
    @Override
    public List<Payment> findAll() {
        return paymentReponsitory.findAll();
    }

}
