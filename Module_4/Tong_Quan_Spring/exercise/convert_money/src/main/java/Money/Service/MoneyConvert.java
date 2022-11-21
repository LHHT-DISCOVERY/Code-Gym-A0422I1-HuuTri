package Money.Service;

import Money.repository.IMoneyConvertRepository;
import Money.repository.MoneyConvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyConvert  implements  IConvertMoney{
   @Autowired
    private MoneyConvertRepository moneyConvertRepository ;
    @Override
    public double convert(double usd) {
        return moneyConvertRepository.convert(usd);
    }
}
