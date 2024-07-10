package net.jasonyes.nethervillagersmod.item;

import net.jasonyes.nethervillagersmod.NetherVillagersMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NetherVillagersMod.MODID);

    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_SHARD = ITEMS.register("gold_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_SHARD = ITEMS.register("emerald_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHARD = ITEMS.register("copper_shard", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
