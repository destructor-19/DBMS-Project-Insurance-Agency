package abhay.insuracne.insuranceagency.services;

import abhay.insuracne.insuranceagency.models.Transaction;

import java.util.List;

public interface TransactionService {
    public void add(Transaction transaction);
    public List<Transaction> getAll();
    public List<Transaction> getAllOfUser(int userId);
}
