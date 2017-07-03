/*
 * Copyright (c) 2017 SpaceToad and the BuildCraft team
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at https://mozilla.org/MPL/2.0/
 */

package buildcraft.builders.filling;

import net.minecraft.util.EnumFacing;

public enum EnumParameterFacing implements IParameter {
    WEST(EnumFacing.WEST),
    EAST(EnumFacing.EAST),
    NORTH(EnumFacing.NORTH),
    SOUTH(EnumFacing.SOUTH);

    public final EnumFacing facing;

    EnumParameterFacing(EnumFacing facing) {
        this.facing = facing;
    }
}
