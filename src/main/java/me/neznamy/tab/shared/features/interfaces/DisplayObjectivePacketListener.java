package me.neznamy.tab.shared.features.interfaces;

import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.shared.packets.PacketPlayOutScoreboardDisplayObjective;

public interface DisplayObjectivePacketListener extends Feature {

	public boolean onPacketSend(TabPlayer receiver, PacketPlayOutScoreboardDisplayObjective packet);
}