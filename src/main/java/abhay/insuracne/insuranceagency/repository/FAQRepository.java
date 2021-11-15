package abhay.insuracne.insuranceagency.repository;

import abhay.insuracne.insuranceagency.models.FAQ;

import java.util.List;

public interface FAQRepository {
    public List<FAQ> findAll();
    public List<FAQ> findByTopic(String topic);
    public void save(FAQ faq);
}
