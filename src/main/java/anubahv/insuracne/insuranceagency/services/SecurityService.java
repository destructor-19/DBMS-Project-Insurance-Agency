package anubahv.insuracne.insuranceagency.services;

public interface SecurityService {
    public String findLoggedInUsername();
    public void autoLogin(String username, String password);
    public void notVerified();
}
