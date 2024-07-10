package net.jasonyes.nethervillagersmod.villager;

import com.google.common.collect.ImmutableSet;
import net.jasonyes.nethervillagersmod.NetherVillagersMod;
import net.jasonyes.nethervillagersmod.block.ModBlocks;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, NetherVillagersMod.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS
            = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, NetherVillagersMod.MODID);

    public static final RegistryObject<PoiType> NETHER_SOURCERS_TABLE_POI
            = POI_TYPES.register("nether_sourcers_table_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.NETHER_SOURCERS_TABLE.get().getStateDefinition().getPossibleStates()), 1, 2));
    public static final RegistryObject<PoiType> NETHER_GATHERERS_TABLE_POI
            = POI_TYPES.register("nether_gatherers_table_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.NETHER_GATHERERS_TABLE.get().getStateDefinition().getPossibleStates()), 1, 2));
    public static final RegistryObject<PoiType> NETHER_LOOTERS_TABLE_POI
                = POI_TYPES.register("nether_looters_table_poi",
                () -> new PoiType(ImmutableSet.copyOf(ModBlocks.NETHER_LOOTERS_TABLE.get().getStateDefinition().getPossibleStates()), 1, 2));

    public static final RegistryObject<VillagerProfession> NETHER_SOURCER
            = VILLAGER_PROFESSIONS.register("nether_sourcer",
            () -> new VillagerProfession("nether_sourcer", holder -> holder.get() == NETHER_SOURCERS_TABLE_POI.get(),
                    holder -> holder.get() == NETHER_SOURCERS_TABLE_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));
    public static final RegistryObject<VillagerProfession> NETHER_GATHERER
            = VILLAGER_PROFESSIONS.register("nether_gatherer",
            () -> new VillagerProfession("nether_gatherer", holder -> holder.get() == NETHER_GATHERERS_TABLE_POI.get(),
                    holder -> holder.get() == NETHER_GATHERERS_TABLE_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));
    public static final RegistryObject<VillagerProfession> NETHER_LOOTER
            = VILLAGER_PROFESSIONS.register("nether_looter",
            () -> new VillagerProfession("nether_looter", holder -> holder.get() == NETHER_LOOTERS_TABLE_POI.get(),
                    holder -> holder.get() == NETHER_LOOTERS_TABLE_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_CLERIC));


    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
