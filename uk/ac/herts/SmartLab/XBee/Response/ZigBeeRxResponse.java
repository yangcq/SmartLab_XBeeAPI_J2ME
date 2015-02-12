package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.Device.Address;

public class ZigBeeRxResponse extends ZigBeeRxBase {
	public ZigBeeRxResponse(APIFrame frame) {
		super(frame);
	}

	public int GetReceiveStatus() {
		return this.GetFrameData()[11];
	}

	public byte[] GetReceivedData() {
		int len = this.GetReceivedDataLength();
		byte[] data = new byte[len];
		System.arraycopy(this.GetFrameData(), 12, data, 0, len);
		return data;
	}

	public Address GetRemoteDevice() {
		byte[] data = new byte[10];
		System.arraycopy(this.GetFrameData(), 1, data, 0, 10);
		return new Address(data);
	}

	public int GetReceivedDataOffset() {
		return 12;
	}

	public int GetReceivedDataLength() {
		// TODO Auto-generated method stub
		return this.GetPosition() - 12;
	}

	public byte GetReceivedData(int index) {
		// TODO Auto-generated method stub
		return this.GetFrameData()[12 + index];
	}
}