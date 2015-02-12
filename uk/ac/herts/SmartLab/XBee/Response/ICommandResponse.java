package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.Type.ATCommand;

public interface ICommandResponse {
	public int GetFrameID();

	public ATCommand GetRequestCommand();

	public int GetCommandStatus();

	public byte[] GetParameter();

	public int GetParameterOffset();
	
	public int GetParameterLength();
	
	public byte GetParameter(int index);
}