package org.example.week13.vjezba2.task5;

public class TrafficLightContext {
    private  TrafficLightState state;

    public TrafficLightContext( ){
        state = new RedLightState();
    }

    public void setState(TrafficLightState state){
        this.state=state;
    }

    public void transitionToRed( ){
        state.transitionToRed();

    }
    public void transitionToGreen( ){

        state.transitionToGreen();
    }
    public void transitionToYellow( ){

        state.transitionToYellow();

    }

}


class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToRed(); // Should stay in Red state
        context.transitionToGreen();

        context.setState(new GreenLightState());

        context.transitionToGreen();

}
}