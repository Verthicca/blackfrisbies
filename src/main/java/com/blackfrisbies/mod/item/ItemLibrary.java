package com.blackfrisbies.mod.item;


import com.blackfrisbies.mod.BlackFrisbies;
import com.blackfrisbies.mod.sound.SoundLibrary;
import com.blackfrisbies.mod.util.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemLibrary {
    private static final List<Item> items = new ArrayList();

    public static final Item DISC_SOLD = register("discsold",new ModMusicDisc(15, SoundLibrary.HOME_FREE_SOLD,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_RING_OF_FIRE = register("discringoffire",new ModMusicDisc(16, SoundLibrary.HOME_FREE_RING_OF_FIRE,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_ELVIRA = register("discelvira",new ModMusicDisc(17, SoundLibrary.HOME_FREE_ELVIRA,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_MAN_OF_SORROW = register("discmanofsorrow",new ModMusicDisc(18, SoundLibrary.HOME_FREE_MAN_OF_SORROW,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_HILLBILLY_BONE = register("dischillbillybone",new ModMusicDisc(19, SoundLibrary.HOME_FREE_HILLBILLY_BONE,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_COUNTRY_HARMONY = register("disccountryharmony",new ModMusicDisc(20, SoundLibrary.HOME_FREE_COUNTY_HARMONY,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));

    public static final Item DISC_AFRICA = register("discafrica",new ModMusicDisc(15, SoundLibrary.TOTO_AFRICA,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_STARLIGHTBRIGADE = register("discstarlightbrigade",new ModMusicDisc(15, SoundLibrary.TWRP_STARLIGHT_BRIGADE,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_MISTYMOUNTAINS = register("discmistymountains",new ModMusicDisc(15, SoundLibrary.TIM_MISTY_MOUNTAINS,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));

    public static final Item DISC_DIGGYDIGGY = register("discdiggydiggy",new ModMusicDisc(15, SoundLibrary.WINDROSE_DIGGY,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_GLORY = register("discglory",new ModMusicDisc(15, SoundLibrary.GLORY,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_ROCKAFELLER = register("discrockafeller",new ModMusicDisc(15, SoundLibrary.ROCKAFELLER_STREET,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_ROCKTORWHO = register("discrocktorwho",new ModMusicDisc(15, SoundLibrary.ROCKTORWHO,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_SURVIVOR = register("discsurvivor",new ModMusicDisc(15, SoundLibrary.SURVIVOR,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));
    public static final Item DISC_TRYEVERYTHING = register("disctryeverything",new ModMusicDisc(15, SoundLibrary.HOME_FREE_TRY_EVERYTHING,new Item.Properties().maxStackSize(1).group(BlackFrisbies.DISC_GROUP)));


    private static Item register(String name, Item item)
    {
        item.setRegistryName(Reference.MODID,name);
        items.add(item);
        return item;
    }
    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        items.forEach(item -> event.getRegistry().register(item));
        items.clear();
    }
}
