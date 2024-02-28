package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {

    private Machine machine = new Machine();
    private State currentState;
    private Transition currentTransition;

    public Machine build() {
        finalizeTransition();
        return machine;
    }

    public StateMachine state(String name) {
        finalizeTransition();
        State existingState = machine.getState(name);
        if (existingState == null) {
            currentState = new State(name);
            machine.addState(currentState);
        } else {
            currentState = existingState;
        }
        currentTransition = null;
        return this;
    }

    public StateMachine initial() {
        if (currentState != null) {
            machine.setInitialState(currentState);
        }
        return this;
    }

    public StateMachine when(String event) {
        finalizeTransition();
        currentTransition = new Transition();
        currentTransition.setEvent(event);
        return this;
    }

    public StateMachine to(String targetStateName) {
        if (currentTransition == null) {
            throw new IllegalStateException("No transition defined. Please define a transition before setting its target state.");
        }
        State targetState = machine.getState(targetStateName);
        if (targetState == null) {
            targetState = new State(targetStateName);
            machine.addState(targetState);
        }
        currentTransition.setTargetState(targetState);
        currentState.addTransition(currentTransition);

        return this;
    }

    public StateMachine integer(String name) {
        machine.addIntegerVariable(name, 0);
        return this;
    }

    public StateMachine set(String variableName, int value) {
        if (currentTransition == null) {
            throw new IllegalStateException("No current transition defined for setting a variable.");
        }
        currentTransition.setOperationSet(variableName, value);
        return this;
    }

    public StateMachine increment(String variableName) {
        if (currentTransition == null) {
            throw new IllegalStateException("No current transition defined for incrementing a variable.");
        }
        currentTransition.setOperationIncrement(variableName);
        return this;
    }

    public StateMachine decrement(String variableName) {
        if (currentTransition == null) {
            throw new IllegalStateException("No current transition defined for decrementing a variable.");
        }
        currentTransition.setOperationDecrement(variableName);
        return this;
    }

    public StateMachine ifEquals(String variableName, int value) {
        if (currentTransition == null) {
            throw new IllegalStateException("Condition setting requires an active transition.");
        }
        currentTransition.setConditionEquals(variableName, value);
        return this;
    }

    public StateMachine ifGreaterThan(String variableName, int value) {
        if (currentTransition == null) {
            throw new IllegalStateException("Condition setting requires an active transition.");
        }
        currentTransition.setConditionGreaterThan(variableName, value);
        return this;
    }

    public StateMachine ifLessThan(String variableName, int value) {
        if (currentTransition == null) {
            throw new IllegalStateException("Condition setting requires an active transition.");
        }
        currentTransition.setConditionLessThan(variableName, value);
        return this;
    }

    private void finalizeTransition() {
        if (currentTransition != null && currentState != null) {
            if (!currentState.getTransitions().contains(currentTransition)) {
                currentState.addTransition(currentTransition);
            }
            currentTransition = null;
        }
    }
}
