package common;

/**
 * This adapter is for the externally-sourced commands to  interact with the local system,
 * specifically the DataPacketCRAlgoCmd.
 * Here we specify the target recipient in sendTo() method to IReceiver type.
 * 
 * algoCmd拿到datapacket之后，用这个cmd2modelAdapter跟local system沟通，特别是跟mixeddictionary沟通
 */
public interface ICRCmd2ModelAdapter extends ICmd2ModelAdapter<IReceiver, ICRMessageType> {

	/**
	 * Send a data packet to the chat room corresponding with the receiver
	 * @param id the class id, i.e. message type
	 * @param data the data
	 */
	public <T extends ICRMessageType> void sendToChatRoom(Class<T> id, T data);
}
