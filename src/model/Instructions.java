package model;

public class Instructions {
	private String Instructions;

	public Instructions(String instructions) {
		Instructions = instructions;
	}

	public String getInstructions() {
		return Instructions;
	}

	public void setInstructions(String instructions) {
		Instructions = instructions;
	}

	@Override
	public String toString() {
		return Instructions;
	}

}
