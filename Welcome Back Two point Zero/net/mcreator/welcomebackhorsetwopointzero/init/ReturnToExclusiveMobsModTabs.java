/*    */ package net.mcreator.welcomebackhorsetwopointzero.init;
/*    */ 
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.CreativeModeTabs;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.common.Mod.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ReturnToExclusiveMobsModTabs
/*    */ {
/* 20 */   public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "return_to_exclusive_mobs");
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
/* 24 */     if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
/* 25 */       tabData.accept((ItemLike)ReturnToExclusiveMobsModItems.PONEY_PIG_SPAWN_EGG.get());
/* 26 */       tabData.accept((ItemLike)ReturnToExclusiveMobsModItems.COW_HORSE_SPAWN_EGG.get());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/init/ReturnToExclusiveMobsModTabs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */