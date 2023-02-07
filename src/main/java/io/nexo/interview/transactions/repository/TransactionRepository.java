package io.nexo.interview.transactions.repository;

import static io.nexo.interview.transactions.model.Constants.LOGGED_USER;
import io.nexo.interview.transactions.model.Transaction;
import io.nexo.interview.transactions.model.TransactionType;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class TransactionRepository {

    public List<Transaction> findAll() {
        List<Transaction> transactionLog = new ArrayList<>();
        transactionLog.add(new Transaction(LOGGED_USER, 1, TransactionType.DEPOSIT, new BigDecimal("0.3")));
        transactionLog.add(new Transaction(UUID.randomUUID(), 1, TransactionType.DEPOSIT, new BigDecimal("0.1")));
        transactionLog.add(new Transaction(LOGGED_USER, 1, TransactionType.WITHDRAWAL, new BigDecimal("0.2")));
        transactionLog.add(new Transaction(LOGGED_USER, 2, TransactionType.DEPOSIT, new BigDecimal("2")));
        transactionLog.add(new Transaction(LOGGED_USER, 2, TransactionType.WITHDRAWAL, new BigDecimal("0.3")));
        transactionLog.add(new Transaction(UUID.randomUUID(), 2, TransactionType.WITHDRAWAL, new BigDecimal("0.1")));
        transactionLog.add(new Transaction(LOGGED_USER, 2, TransactionType.WITHDRAWAL, new BigDecimal("0.2")));
        transactionLog.add(new Transaction(LOGGED_USER, 3, TransactionType.DEPOSIT, new BigDecimal("20000")));
        transactionLog.add(new Transaction(UUID.randomUUID(), 3, TransactionType.WITHDRAWAL, new BigDecimal("2000")));
        transactionLog.add(new Transaction(UUID.randomUUID(), 3, TransactionType.WITHDRAWAL, new BigDecimal("5000")));
        transactionLog.add(new Transaction(UUID.randomUUID(), 3, TransactionType.DEPOSIT, new BigDecimal("2000")));
        transactionLog.add(new Transaction(LOGGED_USER, 3, TransactionType.WITHDRAWAL, new BigDecimal("5000")));
        return transactionLog;
    }
}
