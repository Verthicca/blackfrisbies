package com.blackfrisbies.mod.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class DiscGroup extends ItemGroup {
    public DiscGroup(String label){super(label);}
    @Override
    public ItemStack createIcon() {return new ItemStack(Items.MUSIC_DISC_CAT);}
}
