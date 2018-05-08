package listen;

import org.testng.IExecutionListener;

public class IExecutionListernerEx implements IExecutionListener {

	@Override
	public void onExecutionStart() {
		
		System.out.println("The TEst started");
		
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("The Test finished");
		
	}

}
