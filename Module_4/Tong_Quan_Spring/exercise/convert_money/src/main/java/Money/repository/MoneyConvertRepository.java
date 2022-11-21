package Money.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MoneyConvertRepository implements IMoneyConvertRepository {
    @Override
    public double convert(double usd) {
        return usd * 23000;
    }
}
