package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.Device.Address;
import uk.ac.herts.SmartLab.XBee.Type.ATCommand;

public class RemoteCommandResponse extends CommandResponseBase {
	public RemoteCommandResponse(APIFrame frame) {
		super(frame);
	}

	
	public ATCommand GetRequestCommand() {
		return new ATCommand(new byte[] { this.GetFrameData()[12],
				this.GetFrameData()[13] });
	}

	
	public int GetCommandStatus() {
		return this.GetFrameData()[14];
	}

	
	public byte[] GetParameter() {
		int len = this.GetParameterLength();
		if (len > 15) {
			byte[] data = new byte[len];
			System.arraycopy(this.GetFrameData(), 15, data, 0, len);
			return data;
		} else
			return null;
	}

	public Address GetRemoteDevice() {
		byte[] data = new byte[10];
		System.arraycopy(this.GetFrameData(), 2, data, 0, 10);
		return new Address(data);
	}

	
	public int GetParameterOffset() {
		return 15;
	}

	
	public int GetParameterLength() {
		// TODO Auto-generated method stub
		return this.GetPosition() - 15;
	}

	
	public byte GetParameter(int index) {
		// TODO Auto-generated method stub
		return this.GetFrameData()[15 + index];
	}
}