package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.Device.Address;

public abstract class RxResponseBase extends ResponseBase {
	public RxResponseBase(APIFrame frame) {
		super(frame);
	}

	public abstract int GetReceiveStatus();

	public abstract Address GetRemoteDevice();

	public abstract byte[] GetReceivedData();

	public abstract int GetReceivedDataOffset();
	
	public abstract int GetReceivedDataLength();
	
	public abstract byte GetReceivedData(int index);
}