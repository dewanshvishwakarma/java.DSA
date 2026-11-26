package dependency_injection;

public class SMS_send implements notification {

    @Override
    public void send() {
        System.out.println("sms is sending ");
    }
}
