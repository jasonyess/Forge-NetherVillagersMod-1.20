package net.jasonyes.nethervillagersmod.block;

import java.util.function.Supplier;
import net.jasonyes.nethervillagersmod.NetherVillagersMod;
import net.jasonyes.nethervillagersmod.block.custom.NetherGatherersTableBlock;
import net.jasonyes.nethervillagersmod.block.custom.NetherSourcersTableBlock;
import net.jasonyes.nethervillagersmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, NetherVillagersMod.MODID);

    public static final RegistryObject<Block> NETHER_SOURCERS_TABLE
            = registerBlock("nether_sourcers_table", () -> new NetherSourcersTableBlock(BlockBehaviour.Properties.copy(Blocks.ENCHANTING_TABLE)));
    public static final RegistryObject<Block> NETHER_GATHERERS_TABLE
            = registerBlock("nether_gatherers_table", () -> new NetherGatherersTableBlock(BlockBehaviour.Properties.copy(Blocks.ENCHANTING_TABLE)));
    public static final RegistryObject<Block> NETHER_LOOTERS_TABLE
            = registerBlock("nether_looters_table", () -> new NetherGatherersTableBlock(BlockBehaviour.Properties.copy(Blocks.ENCHANTING_TABLE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
