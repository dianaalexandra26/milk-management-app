package model;

public enum FarmingType {
	TRADITIONAL("LECHERIA TRADICIONAL"),
	SPECIALIZED("LECHERIA ESPECIALIZADA"),
	DOUBLE_PURPOSE("DOBLE PROPOSITO");
	
	String type;

	private FarmingType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
}
