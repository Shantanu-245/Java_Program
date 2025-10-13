package Lambda_Expressions;
interface LightAction {
    void activate();
}

public class HomeLighting {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Lights ON - Motion detected");

        LightAction timeTrigger = () -> System.out.println("Lights DIMMED - Night mode activated");
 
        LightAction voiceTrigger = () -> System.out.println("Lights OFF - Voice command received");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}

