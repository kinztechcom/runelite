package net.runelite.rs.api;

import net.runelite.api.PacketBufferNode;
import net.runelite.mapping.Import;

public interface RSPacketBufferNode extends PacketBufferNode {

    @Import("clientPacket")
    RSClientPacket getClientPacket();

    @Import("clientPacketLength")
    int getClientPacketLength();

}
