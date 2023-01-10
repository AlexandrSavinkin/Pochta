package Pochta.Sandable;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    //Stepik code: start
    public static class UntrustworthyMailWorker implements MailService {


        @Override
        public Sendable processMail(Sendable mail) {
            return null;
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

    public static class Spy implements MailService {
        private  final static Logger LOGGER = Logger.getLogger(Spy.class.getName());
        private Logger logger;
        String message = MailMessage.class.

        public Spy(Logger logger) {
            this.logger = logger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (getFrom().equals(AUSTIN_POWERS)) {
               logger.log(Level.WARNING, "Detected target mail correspondence:" + getFrom() + "to" + getTo() + );
           } else if (getTo().equals(AUSTIN_POWERS)) {
                logger.log(Level.WARNING, "Detected target mail correspondence:" + from + "to" + to + message);
           } else
                logger.log(Level.INFO, "Usual correspondence:" + from + "to" + to + message);

                return null;
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


    public static class Thief extends java.lang.Package implements MailService {
        int result = 0;
        int minPrise = getPrice();

        public Thief(String content, int price) {
            super(content, price);
        }

        public Thief(int price) {
            super(price);
        }

        public int getStolenValue() {
            result += getPrice();
            return result;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            return null;
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

    public static class Inspector implements MailService {


        @Override
        public Sendable processMail(Sendable mail) {
            return null;
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


    //Stepik code: end

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Inspector inspector = new Inspector();

        Spy spy = new Spy(logger);
        Thief thief = new Thief(10000);
        MailService[] variousWorkers = new MailService[]{spy, thief, inspector};
        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(variousWorkers);

        AbstractSendable correspondence[] = {
                new MailMessage("Oxxxymiron", "Гнойный", "Я здесь чисто по фану, поглумиться над слабым\n" +
                        "Ты же вылез из мамы под мой дисс на Бабана...."),
                new MailMessage("Гнойный", "Oxxxymiron", "....Что? Так болел за Россию, что на нервах терял ганглии.\n" +
                        "Но когда тут проходили митинги, где ты сидел? В Англии!...."),
                new MailMessage("Жриновский", AUSTIN_POWERS, "Бери пацанов, и несите меня к воде."),
                new MailMessage(AUSTIN_POWERS, "Пацаны", "Го, потаскаем Вольфовича как Клеопатру"),
                new MailPackage("берег", "море", new java.lang.Package(32)),
                new MailMessage("NASA", AUSTIN_POWERS, "Найди в России ракетные двигатели и лунные stones"),
                new MailPackage(AUSTIN_POWERS, "NASA", new java.lang.Package(2500000)),
                new MailPackage(AUSTIN_POWERS, "NASA", new java.lang.Package(1000)),
                new MailPackage("Китай", "КНДР", new java.lang.Package(99)),
                new MailPackage(AUSTIN_POWERS, "ИГИЛ (запрещенная группировка", new java.lang.Package(9000)),
                new MailMessage(AUSTIN_POWERS, "Психиатр", "Помогите"),
        };
        Arrays.stream(correspondence).forEach(parcell -> {
            try {
                worker.processMail(parcell);
            } catch (StolenPackageException e) {
                logger.log(Level.WARNING, "Inspector found stolen package: " + e);
            } catch (IllegalPackageException e) {
                logger.log(Level.WARNING, "Inspector found illegal package: " + e);
            }
        });
    }
}