/*    */ package net.mcreator.welcomebackhorsetwopointzero.client.renderer;
/*    */ 
/*    */ import net.mcreator.welcomebackhorsetwopointzero.entity.CowHorseEntity;
/*    */ import net.minecraft.client.model.CowModel;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class CowHorseRenderer extends MobRenderer<CowHorseEntity, CowModel<CowHorseEntity>> {
/*    */   public CowHorseRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(CowHorseEntity entity) {
/* 19 */     return new ResourceLocation("return_to_exclusive_mobs:textures/entities/cow_horse.png");
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/client/renderer/CowHorseRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */