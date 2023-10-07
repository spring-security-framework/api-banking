package com.vn.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="account_transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountTransactions {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name="account_number")
    private Integer accountNumber;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name="transaction_dt")
    private Date transactionDt;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name="transaction_type")
    private String transactionType;

    @Column(name = "transaction_amt")
    private Integer transactionAmt;

    @Column(name = "closing_balance")
    private Integer closingBalance;

    @Column(name = "create_dt")
    private String createDt;
}
