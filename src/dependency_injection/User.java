package dependency_injection;

public class User {
    notification notification;

    public User(notification notification){
        this.notification=notification;
    }

    public void UserSend(){
        notification.send();
    }
}
