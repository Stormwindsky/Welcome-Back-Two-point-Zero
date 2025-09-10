/*    */ package net.mcreator.welcomebackhorsetwopointzero.client.renderer;
/*    */ 
/*    */ import net.mcreator.welcomebackhorsetwopointzero.entity.PigHorseEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.PigModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class PigHorseRenderer extends MobRenderer<PigHorseEntity, PigModel<PigHorseEntity>> {
/*    */   public PigHorseRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(PigHorseEntity entity) {
/* 19 */     return new ResourceLocation("return_to_exclusive_mobs:textures/entities/pig_horse.png");
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/client/renderer/PigHorseRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */