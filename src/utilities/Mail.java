package utilities;

public class Mail
{
    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setupServerProperties();
        mail.draftEmail();
        mail.sendEmail();
    }

    private void setupServerProperties() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.port","547");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        newSession = Session.getDefaultInstance(properties,null);
    }

    private void sendEmail() {

    }

    private void draftEmail() {
        String[] emailRecipients = {"abc@gmail.com", "xyz@gmail.com"};
        String emailSubject = "Test Mail";
        String emailBody = "Test Body of Email";
        mimeMessage = new MimeMessage(newSession);

        for (int i = 0; i < emailRecipients.length; i++) {
            mimeMessage.addRecipent(Message.ReceipentType.TO, new InternetAddresses(emailReceipients[i]));
        }
        mimeMessage.setSubject(emailSubject);
    }
}