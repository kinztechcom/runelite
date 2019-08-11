package net.runelite.api;

/**
 * Holds data about a written packet.
 */
public interface PacketWriter
{
    /**
     * The packet length of the current processed packet.
     * @return
     */
    int getServerPacketLength();

    /**
     * The packet currently being processed.
     * @return
     */
    ServerPacket getServerPacket();

    /**
     * The most recent processed incoming packet.
     * The difference between this and @{getServerPacket}
     *  is that this packet has been fully read & loaded.
     * @return
     */
    ServerPacket getCurrentIncomingPacket();

    /**
     * The most recent packet that was read, loaded, and fully processed.
     * At the time of calling this, there is another packet currently being processed.
     * @return
     */
    ServerPacket getPreviousIncomingPacket();

}