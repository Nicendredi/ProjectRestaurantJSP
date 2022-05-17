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
		StringBuilder builder = new StringBuilder();
		builder.append("Instructions [");
		if (Instructions != null) {
			builder.append("Instructions=");
			builder.append(Instructions);
		}
		builder.append("]");
		return builder.toString();
	}

}
