/*    */ package net.mcreator.welcomebackhorsetwopointzero.init;
/*    */ 
/*    */ import net.mcreator.welcomebackhorsetwopointzero.entity.CowHorseEntity;
/*    */ import net.mcreator.welcomebackhorsetwopointzero.entity.PigHorseEntity;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobCategory;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.common.Mod.EventBusSubscriber;
/*    */ import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ReturnToExclusiveMobsModEntities
/*    */ {
/* 25 */   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, "return_to_exclusive_mobs");
/* 26 */   public static final DeferredHolder<EntityType<?>, EntityType<PigHorseEntity>> PONEY_PIG = register("poney_pig", 
/* 27 */       EntityType.Builder.of(PigHorseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/*    */       
/* 29 */       .sized(0.9F, 0.9F));
/* 30 */   public static final DeferredHolder<EntityType<?>, EntityType<CowHorseEntity>> COW_HORSE = register("cow_horse", 
/* 31 */       EntityType.Builder.of(CowHorseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/*    */       
/* 33 */       .sized(0.9F, 1.4F));
/*    */   
/*    */   private static <T extends net.minecraft.world.entity.Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
/* 36 */     return REGISTRY.register(registryname, () -> entityTypeBuilder.build(registryname));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void init(FMLCommonSetupEvent event) {
/* 41 */     event.enqueueWork(() -> {
/*    */           PigHorseEntity.init();
/*    */           CowHorseEntity.init();
/*    */         });
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerAttributes(EntityAttributeCreationEvent event) {
/* 49 */     event.put((EntityType)PONEY_PIG.get(), PigHorseEntity.createAttributes().build());
/* 50 */     event.put((EntityType)COW_HORSE.get(), CowHorseEntity.createAttributes().build());
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/init/ReturnToExclusiveMobsModEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */