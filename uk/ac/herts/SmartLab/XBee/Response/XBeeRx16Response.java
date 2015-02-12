package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.Device.Address;

public class XBeeRx16Response extends XBeeRxBase {
	public XBeeRx16Response(APIFrame frame) {
		super(frame);
	}

	
	public int GetReceiveStatus() {
		return this.GetFrameData()[4];
	}

	
	public byte[] GetReceivedData() {
		int len = this.GetReceivedDataLength();
		byte[] data = new byte[len];
		System.arraycopy(this.GetFrameData(), 5, data, 0, len);
		return data;
	}

	
	public int GetReceivedDataOffset() {
		return 5;
	}

	
	public Address GetRemoteDevice() {
		return new Address(new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, GetFrameData()[1], GetFrameData()[2] });
	}

	
	public int GetRSSI() {
		return this.GetFrameData()[3] * -1;
	}

	
	public int GetReceivedDataLength() {
		return this.GetPosition() - 5;
	}

	
	public byte GetReceivedData(int index) {
		return this.GetFrameData()[5 + index];
	}
}