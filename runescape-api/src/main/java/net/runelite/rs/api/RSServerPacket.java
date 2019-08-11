package net.runelite.rs.api;

import net.runelite.api.ServerPacket;
import net.runelite.mapping.Import;

public interface RSServerPacket extends ServerPacket {

    @Import("id")
    @Override
    int getID();

    @Import("length")
    @Override
    int getLength();

}
