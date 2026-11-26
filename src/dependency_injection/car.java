package dependency_injection;

public class car {
    Engine engine=new Engine();// car is responsible for creating an engine
    // car is tightly coupled in engine
    public void carStart(){
        engine.start();
    }
}
