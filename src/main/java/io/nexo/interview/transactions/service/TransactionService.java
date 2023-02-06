package io.nexo.interview.transactions.service;

import io.nexo.interview.transactions.model.Transaction;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionService {


    private final List<Transaction> transactionLedger;

    public BigDecimal calculateUsdBalanceForUser(UUID userId) {
        BigDecimal balance = new BigDecimal("0.00");

        // Your code here

        return balance;
    }

    public BigDecimal calculateCreditLineForUser(UUID userId) {
        BigDecimal creditLine = new BigDecimal("0.00");

        // Your code here

        return creditLine;
    }

}
