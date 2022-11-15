package reponsitory;

import model.Payment;

import java.util.List;

public interface IPaymentReponsitory {
    List<Payment> findAll();
}
