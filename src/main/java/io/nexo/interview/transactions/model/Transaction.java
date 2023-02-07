package io.nexo.interview.transactions.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Transaction {

    private UUID userId;

    private int currencyId;

    private TransactionType direction;

    private BigDecimal amount;

}

