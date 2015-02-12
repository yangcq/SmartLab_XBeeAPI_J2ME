package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.Device.Address;

public class SensorReadResponse extends ZigBeeRxBase {
	public SensorReadResponse(APIFrame frame) {
		super(frame);
	}

	
	public int GetReceivedDataOffset() {
		return -1;
	}

	
	public int GetReceivedDataLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public byte GetReceivedData(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public byte[] GetReceivedData() {
		return null;
	}

	
	public Address GetRemoteDevice() {
		byte[] data = new byte[10];
		System.arraycopy(this.GetFrameData(), 1, data, 0, 10);
		return new Address(data);
	}

	
	public int GetReceiveStatus() {
		return this.GetFrameData()[11];
	}

	public int GetOneWireSensor() {
		return this.GetFrameData()[12];
	}

	public int GetAD0() {
		return this.GetFrameData()[13] << 8 | this.GetFrameData()[14];
	}

	public int GetAD1() {
		return this.GetFrameData()[15] << 8 | this.GetFrameData()[16];
	}

	public int GetAD2() {
		return this.GetFrameData()[17] << 8 | this.GetFrameData()[18];
	}

	public int GetAD3() {
		return this.GetFrameData()[19] << 8 | this.GetFrameData()[20];
	}

	public int GetThemometer() {
		return this.GetFrameData()[21] << 8 | this.GetFrameData()[22];
	}
}