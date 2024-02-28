package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
    
    private List<State> states = new ArrayList<>();
    private State initialState;
    private Map<String, Integer> integerVariables = new HashMap<>();

    public List<State> getStates() {
        return states;
    }

    public State getInitialState() {
        return initialState;
    }

    public State getState(Object object) {
        for (State state : states) {
            if (state.getName().equals(object)) {
                return state;
            }
        }
        return null;
    }
    
    public void addState(State state) {
        if (getState(state.getName()) == null) {
            states.add(state);
        }
    }
    
    public void setInitialState(State state) {
        this.initialState = state;
    }

    public int numberOfIntegers() {
        return integerVariables.size();
    }

    public boolean hasInteger(String name) {
        return integerVariables.containsKey(name);
    }
    
    public void addIntegerVariable(String name, int value) {
        integerVariables.put(name, value);
    }

    public int getIntegerValue(String variableName) {
        if (!integerVariables.containsKey(variableName)) {
            throw new IllegalArgumentException("Variable not found: " + variableName);
        }
        return integerVariables.get(variableName);
    }

    public void incrementIntegerVariable(String variableName) {
        if (!integerVariables.containsKey(variableName)) {
            throw new IllegalArgumentException("Variable '" + variableName + "' must be initialized before being incremented.");
        }
        int currentValue = integerVariables.get(variableName);
        integerVariables.put(variableName, currentValue + 1);
    }
    
    public void updateIntegerVariable(String variableName, int newValue) {
        // This method will set the variable to the new value
        integerVariables.put(variableName, newValue);
    }

    public void decrementIntegerVariable(String variableName) {
        if (!integerVariables.containsKey(variableName)) {
            throw new IllegalArgumentException("Variable '" + variableName + "' must be initialized before being decremented.");
        }
        int currentValue = integerVariables.get(variableName);
            integerVariables.put(variableName, currentValue - 1);
    }


}
