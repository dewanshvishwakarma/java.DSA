package dependency_injection;

public class EmailSend implements notification {

    @Override
    public void send() {
        System.out.println("email is sending");
    }
}
