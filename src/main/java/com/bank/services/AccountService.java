package com.bank.services;

import com.bank.models.Account; 
import com.bank.models.AccountType;
import com.bank.models.CheckingAccount;
import com.bank.models.FixedAccount;
import com.bank.models.SavingAccount;
import com.bank.dao.AccountDAO; 


public class AccountService {
    private final AccountDAO accountDAO;
    private int accountIdCounter = 1;

    public AccountService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public boolean createAccount(String accountType) {
        try {
            AccountType type = AccountType.valueOf(accountType);
            String accountId = String.format("%03d%06d", 1, accountIdCounter++);
            Account account = switch (type) {
                case CHECKING -> new CheckingAccount(accountId, "1");
                case SAVING -> new SavingAccount(accountId, "1");
                case FIXED -> new FixedAccount(accountId, "1");
            };
            accountDAO.addAccount(account);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public void showAccounts() {
        accountDAO.getAllAccounts().forEach(System.out::println);
    }
}