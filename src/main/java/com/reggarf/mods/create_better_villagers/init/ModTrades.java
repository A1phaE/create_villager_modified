package com.reggarf.mods.create_better_villagers.init;



import com.reggarf.mods.create_better_villagers.Create_better_villagers;
import com.reggarf.mods.create_better_villagers.config.ModConfigs;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

@EventBusSubscriber
public class ModTrades {
    public ModTrades() {
    }

    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event) {
        //================================================================
        //                      ANDESITE_WORKER
        //================================================================
        if (Create_better_villagers.CONFIG.common.ENABLE_ANDESITE_WORKER) {
            if (event.getType() == ModVillagers.ANDESITE_WORKER.value()) {
                //LEVEL 1

                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.GEARBOX, 2), 3, 5, 0.07f));
                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.SHAFT, 4), 3, 5, 0.07f));
                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.LARGE_COGWHEEL, 2), 3, 5, 0.07f));
                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1), new ItemStack(AllItems.ANDESITE_ALLOY.get(), 4), 3, 5, 0.07f));
                //LEVEL 2
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllBlocks.ANDESITE_FUNNEL, 5), 4, 5, 0.05f));
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllBlocks.ANDESITE_TUNNEL, 4), 2, 5, 0.05f));
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1), new ItemStack(AllBlocks.COGWHEEL, 3), 4, 5, 0.05f));
                //LEVEL 3
                event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(AllItems.IRON_SHEET.get(), 6), 3, 5, 0.07f));
                event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllItems.ROSE_QUARTZ.get(), 4), 3, 5, 0.05f));
                //LEVEL 4
                event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(AllItems.FILTER.get(), 2), 3, 5, 0.05f));
                event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(AllItems.ATTRIBUTE_FILTER.get(), 2), 3, 5, 0.05f));
                //LEVEL 5
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1), new ItemStack(AllItems.PROPELLER.get(), 2), 3, 5, 0.05f));
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1), new ItemStack(AllItems.WHISK.get(), 2), 3, 5, 0.05f));

            }
        }

        //================================================================
        //                      BRASS_WORKER
        //================================================================
        if (Create_better_villagers.CONFIG.common.ENABLE_BRASSWORKER) {
            if (event.getType() == ModVillagers.BRASSWORKER.value()) {
                //LEVEL 1

                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1), new ItemStack(AllItems.BRASS_INGOT.get(), 2), 5, 4, 0.07f));
                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(AllBlocks.SEQUENCED_GEARSHIFT, 2), 3, 4, 0.07f));
                //LEVEL 2
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllBlocks.MECHANICAL_CRAFTER, 2), 4, 5, 0.05f));
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(AllBlocks.ROTATION_SPEED_CONTROLLER, 2), 2, 5, 0.05f));
                //LEVEL 3
                event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(AllBlocks.MECHANICAL_ARM, 2), 2, 5, 0.07f));
                event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.TRACK, 6), 3, 5, 0.05f));
                //LEVEL 4
                event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllBlocks.RAILWAY_CASING, 4), 3, 5, 0.05f));
                event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllItems.BRASS_INGOT.get(), 5), 3, 5, 0.05f));
                //LEVEL 5
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.SMART_FLUID_PIPE, 2), 10, 5, 0.05f));
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(AllItems.BRASS_HAND.get(), 2), 4, 5, 0.05f));
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.DISPLAY_LINK, 2), 10, 5, 0.05f));
            }
        }
        //================================================================
        //                      COPPER_WORKER
        //================================================================
        if (Create_better_villagers.CONFIG.common.ENABLE_COPPERWORKER) {
            if (event.getType() == ModVillagers.COPPERWORKER.value()) {
                //LEVEL 1

                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllItems.COPPER_SHEET.get(), 3), 5, 5, 0.07f));
                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1), new ItemStack(AllBlocks.FLUID_PIPE, 2), 3, 5, 0.07f));

                //LEVEL 2
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.MECHANICAL_PUMP, 1), 5, 5, 0.05f));
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.COPPER_VALVE_HANDLE, 1), 10, 5, 0.05f));

                //LEVEL 3
                event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllBlocks.FLUID_TANK, 2), 5, 5, 0.07f));
                event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.HOSE_PULLEY, 1), 10, 5, 0.05f));

                //LEVEL 4
                event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.ITEM_DRAIN, 2), 10, 5, 0.05f));
                event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),  new ItemStack(AllBlocks.STEAM_ENGINE, 1), 10, 5, 0.05f));

                //LEVEL 5
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllBlocks.SMART_FLUID_PIPE, 2), 10, 5, 0.05f));
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1), new ItemStack(AllBlocks.SPOUT, 2), 10, 5, 0.05f));
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.PORTABLE_FLUID_INTERFACE, 2), 10, 5, 0.05f));
            }
        }
        if (Create_better_villagers.CONFIG.common.ENABLE_MINER) {
            if (event.getType() == ModVillagers.MINER.value()) {
                //LEVEL 1
                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Blocks.ANDESITE, 7), 10, 5, 0.07f));
                event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllBlocks.DEPOT, 2), 10, 5, 0.07f));
                //LEVEL 2
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(AllItems.ZINC_INGOT.get(), 4), 10, 5, 0.05f));
                event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(AllBlocks.CRUSHING_WHEEL.get(), 2), 10, 5, 0.05f));
                //LEVEL 3
                event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Blocks.TORCH, 20), 10, 5, 0.07f));
                event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(Blocks.IRON_BLOCK, 2), 10, 5, 0.05f));
                //LEVEL 4
                event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllItems.SWEET_ROLL.get(), 4), 10, 5, 0.05f));
                event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(AllItems.BUILDERS_TEA.get(), 2), 10, 5, 0.05f));
                //LEVEL 5
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(AllItems.ZINC_INGOT.get(), 8), 4, 5, 0.05f));
                event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.COPPER_INGOT, 12), 4, 5, 0.05f));
            }
        }

        //================================================================
        //                      CRYSTAL_HARVESTER
        //================================================================

        //if (event.getType() == ModVillagerProfessions.CRYSTAL_HARVESTER.get()) {
        //	}
    }
}
