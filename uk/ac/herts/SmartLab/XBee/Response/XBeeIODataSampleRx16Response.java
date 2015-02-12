package uk.ac.herts.SmartLab.XBee.Response;

import uk.ac.herts.SmartLab.XBee.APIFrame;
import uk.ac.herts.SmartLab.XBee.IOSamples;
import uk.ac.herts.SmartLab.XBee.Device.Address;

public class XBeeIODataSampleRx16Response extends XBeeIODataSampleRxBase {
	public XBeeIODataSampleRx16Response(APIFrame frame) {
		super(frame);
	}

	public int GetRSSI() {
		return GetFrameData()[3] * -1;
	}

	public int GetReceivedDataLength() {
		return 0;
	}

	public byte GetReceivedData(int index) {
		return 0;
	}

	public IOSamples GetIOSamples() {
		return SamplesParse(this.GetFrameData(), 5);
	}

	public int GetReceiveStatus() {
		return this.GetFrameData()[4];
	}

	public Address GetRemoteDevice() {
		return new Address(new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, GetFrameData()[1], GetFrameData()[2] });
	}

	public byte[] GetReceivedData() {
		return null;
	}

	public int GetReceivedDataOffset() {
		return -1;
	}
}