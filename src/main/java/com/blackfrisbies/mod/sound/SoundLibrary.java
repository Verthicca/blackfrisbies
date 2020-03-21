package com.blackfrisbies.mod.sound;

import com.blackfrisbies.mod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SoundLibrary {

    private static final List<SoundEvent> sounds = new ArrayList();

    public static final SoundEvent HOME_FREE_SOLD = addEvent("sold","musicsold");
    public static final SoundEvent HOME_FREE_RING_OF_FIRE = addEvent("ringoffire", "musicringoffire");
    public static final SoundEvent HOME_FREE_ELVIRA = addEvent("elvira","musicelvira");
    public static final SoundEvent HOME_FREE_MAN_OF_SORROW = addEvent("manofsorrow","musicmanofsorrow");
    public static final SoundEvent HOME_FREE_HILLBILLY_BONE = addEvent("hillbillybone","musichillbillybone");
    public static final SoundEvent HOME_FREE_COUNTY_HARMONY = addEvent("countryharmony", "musiccountryharmony");
    public static final SoundEvent HOME_FREE_TRY_EVERYTHING = addEvent("tryeverything", "musictryeverything");

    public static final SoundEvent TOTO_AFRICA = addEvent("africa", "musicafrica");
    public static final SoundEvent TWRP_STARLIGHT_BRIGADE = addEvent("starlightbrigade", "musicstarlightbridage");
    public static final SoundEvent TIM_MISTY_MOUNTAINS = addEvent("mistymountains", "musicmistymountains");

    public static final SoundEvent ROCKTORWHO = addEvent("rocktorwho", "musicrocktorwho");
    public static final SoundEvent ROCKAFELLER_STREET = addEvent("rockafellerstreet", "musicrockafellerstreet");
    public static final SoundEvent WINDROSE_DIGGY = addEvent("diggydiggyhole", "musicdiggydiggyhole");
    public static final SoundEvent GLORY = addEvent("glory", "musicglory");
    public static final SoundEvent SURVIVOR = addEvent("survivor", "musicsurvivor");


    private static SoundEvent addEvent (String RessourcePath , String Name){
        SoundEvent sound = new SoundEvent(new ResourceLocation(Reference.MODID, RessourcePath)).setRegistryName(Name);
        sounds.add(sound);
        return sound;
    }

    public List<SoundEvent> getSounds() {
        return sounds;
    }

    @SubscribeEvent
    public void onRegisterSoundEvents(RegistryEvent.Register<SoundEvent> e)
    {
        for (SoundEvent se: sounds)
        {
            e.getRegistry().register(se);
        }
        sounds.clear();
    }
}
