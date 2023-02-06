package io.nexo.interview.transactions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public enum Currency {
    BTC(new BigDecimal("20 000"), new BigDecimal("50")),
    ETH(new BigDecimal("2000"), new BigDecimal("50")),
    DOGE(new BigDecimal("0.1"), new BigDecimal("20"))
    ;

    private final BigDecimal usdRate;
    private final BigDecimal ltv;

}
