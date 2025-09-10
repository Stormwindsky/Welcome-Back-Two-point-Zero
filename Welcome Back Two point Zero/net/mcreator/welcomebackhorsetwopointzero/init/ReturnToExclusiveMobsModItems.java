/*    */ package net.mcreator.welcomebackhorsetwopointzero.init;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.neoforged.bus.api.IEventBus;
/*    */ import net.neoforged.neoforge.common.DeferredSpawnEggItem;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ReturnToExclusiveMobsModItems
/*    */ {
/* 18 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create((Registry)BuiltInRegistries.ITEM, "return_to_exclusive_mobs");
/* 19 */   public static final DeferredHolder<Item, Item> PONEY_PIG_SPAWN_EGG = REGISTRY.register("poney_pig_spawn_egg", () -> new DeferredSpawnEggItem((Supplier)ReturnToExclusiveMobsModEntities.PONEY_PIG, -3381760, -26368, new Item.Properties()));
/* 20 */   public static final DeferredHolder<Item, Item> COW_HORSE_SPAWN_EGG = REGISTRY.register("cow_horse_spawn_egg", () -> new DeferredSpawnEggItem((Supplier)ReturnToExclusiveMobsModEntities.COW_HORSE, -6737152, -39424, new Item.Properties()));
/*    */ 
/*    */ 
/*    */   
/*    */   public static void register(IEventBus bus) {
/* 25 */     REGISTRY.register(bus);
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/init/ReturnToExclusiveMobsModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */