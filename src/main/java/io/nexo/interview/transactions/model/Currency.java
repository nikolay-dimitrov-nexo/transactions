package io.nexo.interview.transactions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Currency {

    private int id;
    private String name;
    private BigDecimal usdRate;

}
