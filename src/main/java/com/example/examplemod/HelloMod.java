package com.example.examplemod;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = HelloMod.MODID, version = HelloMod.VERSION)
public class HelloMod
{
    public static final String MODID = "HelloMod";
    public static final String VERSION = "1.0";

    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event ){

    }



}
