package io.nexo.interview.transactions.repository;

import io.nexo.interview.transactions.model.Currency;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

@Component
public class CurrencyRepository {

    private static final Map<Integer, Currency> currencies = Map.of(1, new Currency(1, "BTC", new BigDecimal("20000")),
                                                                        2, new Currency(2, "ETH", new BigDecimal("2000")),
                                                                        3, new Currency(3, "DOGE", new BigDecimal("0.1")));
    public Optional<Currency> findCurrencyById(int id) {
        return Optional.ofNullable(currencies.get(id));
    }
}
