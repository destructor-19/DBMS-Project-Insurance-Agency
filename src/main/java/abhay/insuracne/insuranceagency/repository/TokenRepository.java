package abhay.insuracne.insuranceagency.repository;

import abhay.insuracne.insuranceagency.models.VerificationToken;

public interface TokenRepository {
    public VerificationToken getVerificationToken(String token);
    public void save(VerificationToken verificationToken);
}
