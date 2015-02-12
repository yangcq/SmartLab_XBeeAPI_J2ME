package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.Device.Address;

public class XBeeRx64Response extends XBeeRxBase {
	public XBeeRx64Response(APIFrame frame) {
		super(frame);
	}

	
	public int GetReceiveStatus() {
		return this.GetFrameData()[10];
	}

	
	public int GetReceivedDataOffset() {
		return 11;
	}

	
	public byte[] GetReceivedData() {
		int len = this.GetReceivedDataLength();
		byte[] data = new byte[len];
		System.arraycopy(this.GetFrameData(), 11, data, 0, len);
		return data;
	}

	
	public Address GetRemoteDevice() {
		return new Address(new byte[] { GetFrameData()[1], GetFrameData()[2],
				GetFrameData()[3], GetFrameData()[4], GetFrameData()[5],
				GetFrameData()[6], GetFrameData()[7], GetFrameData()[8], 0x00,
				0x00 });
	}

	
	public int GetRSSI() {
		return this.GetFrameData()[9] * -1;
	}

	
	public int GetReceivedDataLength() {
		return this.GetPosition() - 11;
	}

	
	public byte GetReceivedData(int index) {
		return this.GetFrameData()[11 + index];
	}
}