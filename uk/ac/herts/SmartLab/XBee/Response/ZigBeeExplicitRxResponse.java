package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.Device.Address;
import uk.ac.herts.SmartLab.XBee.Device.ExplicitAddress;

public class ZigBeeExplicitRxResponse extends ZigBeeRxBase {
	public ZigBeeExplicitRxResponse(APIFrame frame) {
		super(frame);
	}

	
	public Address GetRemoteDevice() {
		byte[] address = new byte[10];
		byte[] explicit = new byte[6];
		System.arraycopy(this.GetFrameData(), 1, address, 0, 10);
		System.arraycopy(this.GetFrameData(), 11, explicit, 0, 6);

		return new ExplicitAddress(address, explicit);
	}

	
	public int GetReceiveStatus() {
		return this.GetFrameData()[17];
	}

	
	public byte[] GetReceivedData() {
		int len = this.GetReceivedDataLength();
		byte[] data = new byte[len];
		System.arraycopy(this.GetFrameData(), 18, data, 0, len);
		return data;
	}

	
	public int GetReceivedDataOffset() {
		return 18;
	}

	
	public int GetReceivedDataLength() {
		// TODO Auto-generated method stub
		return this.GetPosition() - 18;
	}

	
	public byte GetReceivedData(int index) {
		// TODO Auto-generated method stub
		return this.GetFrameData()[18 + index];
	}
}