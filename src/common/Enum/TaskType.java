package common.Enum;

public enum TaskType {
	TASK("TASK"), BUGREPORT("BUG REPORT"), TESTREQUEST("TEST REQUEST"), NEWFEATURE("NEW FEATURE"), IMPROVEMENT("IMPROVEMENT");
	
	private String type;
	
	TaskType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
