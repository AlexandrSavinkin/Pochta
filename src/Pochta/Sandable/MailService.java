package Pochta.Sandable;

public  interface MailService extends Sendable {
    Sendable processMail(Sendable mail);
}

