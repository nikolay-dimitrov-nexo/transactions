package io.nexo.interview.transactions.service;

import io.nexo.interview.transactions.model.Currency;
import io.nexo.interview.transactions.repository.CurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private static final Map<Integer, BigDecimal> ltvMap = Map.of(1, new BigDecimal("50"),
                                                                  2, new BigDecimal("50"),
                                                                  3, new BigDecimal("20"));

    private final CurrencyRepository currencyRepository;

    public Optional<Currency> getCurrencyById(int id) {
        return currencyRepository.findCurrencyById(id);
    }

    public BigDecimal getLtvForCurrencyId(int id) {
        return ltvMap.get(id);
    }

}
