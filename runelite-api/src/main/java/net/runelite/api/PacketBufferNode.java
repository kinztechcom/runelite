package net.runelite.api;

public interface PacketBufferNode {

    ClientPacket getClientPacket();

    int getClientPacketLength();

}
