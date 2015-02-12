package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.Type.ATCommand;

public abstract class CommandResponseBase extends ResponseBase implements
		ICommandResponse {
	public CommandResponseBase(APIFrame frame) {
		super(frame);
	}

	public int GetFrameID() {
		return GetFrameData()[1];
	}

	public abstract ATCommand GetRequestCommand();

	public abstract int GetCommandStatus();

	public abstract byte[] GetParameter();
}