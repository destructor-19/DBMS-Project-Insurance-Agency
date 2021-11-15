package abhay.insuracne.insuranceagency.repository;

import abhay.insuracne.insuranceagency.models.Transaction;

import java.util.List;

public interface TransactionRepository {
    public void save(Transaction transaction);
    public List<Transaction> finalAll();
    public List<Transaction> findByUser(int userId);
}
