package uk.ac.herts.SmartLab.XBee.Status;

public class ReceiveStatus {
	public static final int SUCCESS= 0x00;
	public static final int PACKET_ACKNOWLEDGED= 0x01;
	public static final int PACKET_WAS_A_BROADCAST= 0x02;
	public static final int PACKET_RECEIVED_ON_BOARDCAST_PAN= 0x04;
	public static final int BROADCAST_PACKET_RECEIVED_ON_BOARDCAST_PAN= 0x06;
	public static final int PACKET_ENCRYPTED_WITH_APS_ENCRYPTION= 0x20;
	public static final int PACKET_WAS_SENT_FROM_AN_END_DEVICE= 0x40;
	public static final int PACKET_ENCRYPTED_WITH_APS_ENCRYPTION_AND_ACKNOWLEDGED= 0x21;
	public static final int PACKET_WAS_A_BROADCAST_PACKET_ENCRYPTED_WITH_APS_ENCRYPTION= 0x22;
	public static final int PACKET_ACKNOWLEDGED_AND_WAS_SENT_FROM_AN_END_DEVICE= 0x41;
	public static final int PACKET_WAS_A_BROADCAST_PACKET_SENT_FROM_AN_END_DEVICE= 0x42;
	public static final int PACKET_WAS_SENT_FROM_AN_END_DEVICE_AND_ENCRYPTED_WITH_APS_ENCRYPTION = 0x60;
	public static final int ACKNOWLEDGED_PACKET_SENT_FROM_AN_END_DEVICE_AND_ENCRYPTED_WITH_APS_ENCRYPTION = 0x61;
	public static final int BROADCAST_PACKET_WAS_SENT_FROM_AN_END_DEVICE_AND_ENCRYPTED_WITH_APS_ENCRYPTION = 0x62;

}
