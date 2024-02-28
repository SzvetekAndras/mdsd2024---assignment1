package main;

import main.metamodel.Machine;

public class MainApplication {

    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine();
        final int NUMBER_TRACKS = 10;
        
        // the machine according to the test
        Machine machine = stateMachine
                .integer("track")
                .state("STOP").initial()
                    .when("PLAY").to("PLAYING").set("track", 1).ifEquals("track", 0)
                    .when("PLAY").to("PLAYING")
                .state("PLAYING")
                    .when("STOP").to("STOP")
                    .when("PAUSE").to("PAUSED")
                    .when("TRACK_END").to("STOP").ifEquals("track", NUMBER_TRACKS)
                    .when("TRACK_END").to("PLAYING").increment("track")
                .state("PAUSED")
                    .when("STOP").to("STOP")
                    .when("PLAY").to("PLAYING")
                    .when("FORWARD").to("PAUSED").increment("track").ifLessThan("track", NUMBER_TRACKS + 1)
                    .when("BACK").to("PAUSED").decrement("track").ifGreaterThan("track", 1)
                .build();
        
        // running the machine with a machine interpreter
        MachineInterpreter interpreter = new MachineInterpreter();
        interpreter.run(machine);
        
        interpreter.processEvent("PLAY");
        System.out.println("Current state: " + interpreter.getCurrentState().getName());
        System.out.println("Current track: " + interpreter.getInteger("track"));
    }
    
}
