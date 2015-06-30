package javaconfig.mixedconfig;

public class MailServiceImpl implements MailService {

    @Override
    public void sendMail(String body) {
        System.out.println("Sending email: " + body);
    }

}
