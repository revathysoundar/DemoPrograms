package enumExample;

public enum WalkSignalSymbol {
	
	WALK(true),
	DONT_WALK(false);
	
	private final boolean shouldProceed;

	private WalkSignalSymbol(boolean shouldProceed) {
		this.shouldProceed = shouldProceed;
	}

	public boolean isShouldProceed() {
		return shouldProceed;
	}
	

}
