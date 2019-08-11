package net.runelite.rs.api;

import net.runelite.api.PacketWriter;
import net.runelite.mapping.Import;

public interface RSPacketWriter extends PacketWriter
{

    @Import("serverPacketLength")
    @Override
    int getServerPacketLength();

    @Import("serverPacket")
    @Override
    RSServerPacket getServerPacket();

    @Import("currentIncomingPacket")
    @Override
    RSServerPacket getCurrentIncomingPacket();

    @Import("previousIncomingPacket")
    @Override
    RSServerPacket getPreviousIncomingPacket();

    @Import("writePacket")
    void writePacket(RSPacketBufferNode writer);

}
