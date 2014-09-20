package stock.selector.model;

public class DemarkSelectResult extends SelectResult {
	private int setupNumber = 0;

	private int countDownNumber=0;
	
	public int getCountDownNumber() {
		return countDownNumber;
	}

	public void setCountDownNumber(int countDownNumber) {
		this.countDownNumber = countDownNumber;
	}

	public int getSetupNumber() {
		return setupNumber;
	}

	public void setSetupNumber(int setupNumber) {
		this.setupNumber = setupNumber;
	}

}
