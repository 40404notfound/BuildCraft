/**
 * Copyright (c) 2011-2015, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.transport.statements;

import java.util.Locale;

import net.minecraft.client.renderer.texture.IIconRegister;

import buildcraft.api.statements.IStatementContainer;
import buildcraft.api.statements.IStatementParameter;
import buildcraft.api.statements.ITriggerInternal;
import buildcraft.core.statements.BCStatement;
import buildcraft.core.lib.utils.StringUtils;

public class TriggerClockTimer extends BCStatement implements ITriggerInternal {

	public enum Time {

		SHORT(5), MEDIUM(10), LONG(15);
		public static final Time[] VALUES = values();
		public final int delay;

		private Time(int delay) {
			this.delay = delay;
		}
	}
	public final Time time;

	public TriggerClockTimer(Time time) {
		super("buildcraft:timer." + time.name().toLowerCase(Locale.ENGLISH));

		this.time = time;
	}

	@Override
	public String getDescription() {
		return String.format(StringUtils.localize("gate.trigger.timer"), time.delay);
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		icon = iconRegister.registerIcon("buildcraft:triggers/trigger_timer_" + time.name().toLowerCase(Locale.ENGLISH));
	}

	@Override
	public boolean isTriggerActive(IStatementContainer source,
			IStatementParameter[] parameters) {
		return false;
	}
}
