package main.metamodel;

public class Transition{
	
	private int operationValue;
	
	private String event;
	private State targetState;
	private boolean hasSet, hasIncrement, hasDecrement;
	private String operationVariableName;
	
	private boolean isConditional;
	private String conditionVariableName;
	private Integer conditionComparedValue;
	private boolean conditionEqual, conditionGreaterThan, conditionLessThan;
	private boolean operation;
	
	public String getEvent() {
		return event;
	}

	public State getTarget() {
		return targetState;
	}
	
	public void setTargetState(State targetState) {
		this.targetState = targetState;
	}

	public boolean hasSetOperation() {
		return hasSet;
	}

	public boolean hasIncrementOperation() {
		return hasIncrement;
	}

	public boolean hasDecrementOperation() {
		return hasDecrement;
	}

	public String getOperationVariableName() {
		return operationVariableName;
	}

	public boolean isConditional() {
		return isConditional;
	}

	public String getConditionVariableName() {
		return conditionVariableName;
	}

	public Integer getConditionComparedValue() {
		return conditionComparedValue;
	}

	public boolean isConditionEqual() {
		return conditionEqual;
	}

	public boolean isConditionGreaterThan() {
		return conditionGreaterThan;
	}

	public boolean isConditionLessThan() {
		return conditionLessThan;
	}

	public boolean hasOperation() {
		return operation;
	}
	
	// Operations
	public void setOperationSet(String variableName, int value) {
	    this.operation = true;
	    this.hasSet = true;
	    this.operationVariableName = variableName;
	    this.operationValue = value;
	}

	public void setOperationIncrement(String variableName) {
	    this.operation = true;
	    this.hasIncrement = true;
	    this.operationVariableName = variableName;
	}

	public void setOperationDecrement(String variableName) {
	    this.operation = true;
	    this.hasDecrement = true;
	    this.operationVariableName = variableName;
	}

	// Conditions
	public void setConditionGreaterThan(String variableName, int value) {
	    this.isConditional = true;
	    this.conditionVariableName = variableName;
	    this.conditionComparedValue = value;
	    this.conditionGreaterThan = true;
	    this.conditionEqual = false;
	    this.conditionLessThan = false;
	}

	public void setConditionLessThan(String variableName, int value) {
	    this.isConditional = true;
	    this.conditionVariableName = variableName;
	    this.conditionComparedValue = value;
	    this.conditionLessThan = true;
	    this.conditionEqual = false;
	    this.conditionGreaterThan = false;
	}

	public void setConditionEquals(String variableName, int value) {
	    this.isConditional = true;
	    this.conditionVariableName = variableName;
	    this.conditionComparedValue = value;
	    this.conditionEqual = true;
	    this.conditionGreaterThan = false;
	    this.conditionLessThan = false;
	}
	
	public void setEvent(String event) {
		this.event = event;
	}
	
	public int getOperationValue() {
	       return operationValue;
	}

}
