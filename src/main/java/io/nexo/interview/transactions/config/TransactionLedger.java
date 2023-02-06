package io.nexo.interview.transactions.config;

import static io.nexo.interview.transactions.model.Constants.LOGGED_USER;
import io.nexo.interview.transactions.model.Currency;
import io.nexo.interview.transactions.model.Transaction;
import io.nexo.interview.transactions.model.TransactionDirection;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class TransactionLedger {

    @Bean
    public List<Transaction> ledger() {
        List<Transaction> ledger = new ArrayList<>();
        ledger.add(new Transaction(LOGGED_USER, Currency.BTC, TransactionDirection.INCOMING, new BigDecimal("0.3")));
        ledger.add(new Transaction(UUID.randomUUID(), Currency.BTC, TransactionDirection.INCOMING, new BigDecimal("0.1")));
        ledger.add(new Transaction(LOGGED_USER, Currency.BTC, TransactionDirection.OUTGOING, new BigDecimal("0.2")));
        ledger.add(new Transaction(LOGGED_USER, Currency.ETH, TransactionDirection.INCOMING, new BigDecimal("2")));
        ledger.add(new Transaction(LOGGED_USER, Currency.ETH, TransactionDirection.OUTGOING, new BigDecimal("0.3")));
        ledger.add(new Transaction(UUID.randomUUID(), Currency.ETH, TransactionDirection.OUTGOING, new BigDecimal("0.1")));
        ledger.add(new Transaction(LOGGED_USER, Currency.ETH, TransactionDirection.OUTGOING, new BigDecimal("0.2")));
        ledger.add(new Transaction(LOGGED_USER, Currency.DOGE, TransactionDirection.INCOMING, new BigDecimal("20000")));
        ledger.add(new Transaction(UUID.randomUUID(), Currency.DOGE, TransactionDirection.OUTGOING, new BigDecimal("2000")));
        ledger.add(new Transaction(UUID.randomUUID(), Currency.DOGE, TransactionDirection.OUTGOING, new BigDecimal("5000")));
        ledger.add(new Transaction(UUID.randomUUID(), Currency.DOGE, TransactionDirection.INCOMING, new BigDecimal("2000")));
        ledger.add(new Transaction(LOGGED_USER, Currency.DOGE, TransactionDirection.OUTGOING, new BigDecimal("5000")));
        return ledger;
    }
}
