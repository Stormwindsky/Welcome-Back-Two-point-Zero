/*    */ package net.mcreator.welcomebackhorsetwopointzero.init;
/*    */ 
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.neoforged.api.distmarker.Dist;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.common.Mod.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.client.event.EntityRenderersEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class ReturnToExclusiveMobsModEntityRenderers
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
/* 19 */     event.registerEntityRenderer((EntityType)ReturnToExclusiveMobsModEntities.PONEY_PIG.get(), net.mcreator.welcomebackhorsetwopointzero.client.renderer.PigHorseRenderer::new);
/* 20 */     event.registerEntityRenderer((EntityType)ReturnToExclusiveMobsModEntities.COW_HORSE.get(), net.mcreator.welcomebackhorsetwopointzero.client.renderer.CowHorseRenderer::new);
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/init/ReturnToExclusiveMobsModEntityRenderers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */