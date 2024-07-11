package net.jasonyes.nethervillagersmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.jasonyes.nethervillagersmod.NetherVillagersMod;
import net.jasonyes.nethervillagersmod.item.ModItems;
import net.jasonyes.nethervillagersmod.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = NetherVillagersMod.MODID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event)
    {
        if (event.getType() == ModVillagers.NETHER_SOURCER.get())
        {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.CRIMSON_FUNGUS, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.CRIMSON_ROOTS, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.WEEPING_VINES, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.NETHER_SPROUTS, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.TWISTING_VINES, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.WARPED_ROOTS, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.WARPED_FUNGUS, 32),
                    5, 5, 0.05f));

            // Level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 2),
                    new ItemStack(Items.QUARTZ, 16),
                    4, 20, 0.05f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 2),
                    new ItemStack(Items.NETHER_WART, 16),
                    4, 20, 0.05f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 2),
                    new ItemStack(Items.GHAST_TEAR, 16),
                    4, 20, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 2),
                    new ItemStack(Items.GLOWSTONE_DUST, 32),
                    5, 20, 0.05f));

            // Level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 8),
                    new ItemStack(Items.BLAZE_ROD, 5),
                    2, 50, 0.05f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 8),
                    new ItemStack(Items.ANCIENT_DEBRIS, 2),
                    2, 50, 0.05f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 8),
                    new ItemStack(Items.WITHER_SKELETON_SKULL, 1),
                    2, 50, 0.05f));
        }
        else if (event.getType() == ModVillagers.NETHER_GATHERER.get())
        {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.NETHERRACK, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.NETHER_BRICKS, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.RED_NETHER_BRICKS, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.BASALT, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.BLACKSTONE, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.CRIMSON_STEM, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.WARPED_STEM, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.CRIMSON_NYLIUM, 32),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.WARPED_NYLIUM, 32),
                    5, 5, 0.05f));

            // Level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.SOUL_SAND, 16),
                    5, 20, 0.05f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.SOUL_SOIL, 16),
                    5, 20, 0.05f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.MAGMA_BLOCK, 16),
                    5, 20, 0.05f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.QUARTZ_BLOCK, 16),
                    5, 20, 0.05f));
        }
        else if (event.getType() == ModVillagers.NETHER_LOOTER.get())
        {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 1),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    5, 5, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 1),
                    new ItemStack(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    5, 5, 0.05f));

            // Level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 2),
                    EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SOUL_SPEED, 1)),
                    2, 20, 0.05f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.EMERALD_SHARD.get(), 2),
                    new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1),
                    2, 20, 0.05f));
        }
    }
}
