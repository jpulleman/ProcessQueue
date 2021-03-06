// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package processqueue.actions;

import processqueue.queuehandler.QueueHandler;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Stop all running and scheduled Queued actions. Depending on the boolean parameter it throws an exception in the executing microflow or waits for it to finish without starting new actions.
 * 
 * When shutting down gracefully is true the Queue waits for the Actions to finish.
 */
public class ShutdownAllQueues extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.Boolean Gracefully;

	public ShutdownAllQueues(IContext context, java.lang.Boolean Gracefully)
	{
		super(context);
		this.Gracefully = Gracefully;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		QueueHandler.getQueueHandler().stopProcess(this.Gracefully);
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ShutdownAllQueues";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
