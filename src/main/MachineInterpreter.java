package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	
	private Machine machine;
	private State currentState;
	
    public void run(Machine m) {
    	this.machine = m;
    	this.currentState = m.getInitialState();
    }

    public State getCurrentState() {
    	return currentState;
    }

    public void processEvent(String eventName) {
        boolean transitionFound = false;
        for (Transition transition : currentState.getTransitions()) {
            if (transition.getEvent().equals(eventName) && isConditionSatisfied(transition)) {
                executeOperation(transition);
                currentState = transition.getTarget();
                System.out.println("Transitioned to state: " + currentState.getName() + " on event: " + eventName);
                transitionFound = true;
                break;
            }
        }
        
        if (!transitionFound) {
            System.out.println("No transition found for event: " + eventName + " or condition not satisfied. Staying in state: " + currentState.getName());
        }
    }


    public int getInteger(String variableName) {
    	return machine.getIntegerValue(variableName);
    }
    
    private boolean isConditionSatisfied(Transition transition) {
        if (!transition.isConditional()) return true; // No condition to satisfy

        String variableName = transition.getConditionVariableName();
        int currentValue = machine.getIntegerValue(variableName);
        int comparedValue = transition.getConditionComparedValue();

        if (transition.isConditionEqual()) {
            return currentValue == comparedValue;
        } else if (transition.isConditionGreaterThan()) {
            return currentValue > comparedValue;
        } else if (transition.isConditionLessThan()) {
            return currentValue < comparedValue;
        }
        return false;
    }

    private void executeOperation(Transition transition) {
        if (!transition.hasOperation()) return; // No operation to execute

        String variableName = transition.getOperationVariableName();
        if (transition.hasSetOperation()) {
            System.out.println("Set operation executed for " + variableName + " to " + transition.getOperationValue());
            machine.updateIntegerVariable(variableName, transition.getOperationValue());
        } else if (transition.hasIncrementOperation()) {
            machine.incrementIntegerVariable(variableName);
            System.out.println("Increment operation executed for " + variableName);
        } else if (transition.hasDecrementOperation()) {
            machine.decrementIntegerVariable(variableName);
            System.out.println("Decrement operation executed for " + variableName + "; New Value: " + (machine.getIntegerValue(variableName)));
        }
    }

}
