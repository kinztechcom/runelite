package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPacketBufferNode;
import net.runelite.rs.api.RSPacketWriter;

@Mixin(RSPacketWriter.class)
public abstract class RSPacketWriterMixin implements RSPacketWriter
{

    @Shadow("client")
    private static RSClient client;

    @Inject
    @MethodHook(value = "writePacket", end = true)
    public final void printOutgoingPacket(RSPacketBufferNode node) {
        if(node != null && node.getClientPacket() != null &&
            node.getClientPacket().getID() != 22 && node.getClientPacket().getID() != 34) {
            client.getLogger().info("[Outgoing Packet]: ID: {} Size: {}", node.getClientPacket().getID(), node.getClientPacket().getLength());
        }
    }

}
