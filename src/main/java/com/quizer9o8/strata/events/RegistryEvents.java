package com.quizer9o8.strata.events;

import com.quizer9o8.strata.Strata;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

//This tells the game to run this class before anything else.
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents
{
    public static final Logger LOGGER = Strata.LOGGER;
    public static final String MOD_ID = Strata.MOD_ID;

    //ItemGroups
    //public static final ItemGroup DEBUG = Strata.DEBUG_TAB;
    public static final ItemGroup IGNEOUS = Strata.IGNEOUS_TAB;
    public static final ItemGroup SEDIMENTARY = Strata.SEDIMENTARY_TAB;
    public static final ItemGroup METAMORPHIC = Strata.METAMORPHIC_TAB;
    //public static final ItemGroup MISCELLANEOUS = Strata.MISCELLANEOUS_TAB;

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MOD_ID, name);
    }
}
