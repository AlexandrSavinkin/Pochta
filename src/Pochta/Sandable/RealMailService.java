package Pochta.Sandable;

public class RealMailService implements MailService{
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }

    @Override
    public String getFrom() {
        return null;
    }

    @Override
    public String getTo() {
        return null;
    }
}
