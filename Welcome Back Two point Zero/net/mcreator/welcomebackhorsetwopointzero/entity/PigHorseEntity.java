/*    */ package net.mcreator.welcomebackhorsetwopointzero.entity;
/*    */ import net.mcreator.welcomebackhorsetwopointzero.init.ReturnToExclusiveMobsModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.entity.PathfinderMob;
/*    */ import net.minecraft.world.entity.SpawnPlacements;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.entity.ai.goal.Goal;
/*    */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*    */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*    */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*    */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*    */ import net.minecraft.world.entity.animal.Pig;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.levelgen.Heightmap;
/*    */ 
/*    */ public class PigHorseEntity extends Pig {
/*    */   public PigHorseEntity(EntityType<PigHorseEntity> type, Level world) {
/* 33 */     super(type, world);
/* 34 */     setMaxUpStep(0.6F);
/* 35 */     this.xpReward = 0;
/* 36 */     setNoAi(false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void registerGoals() {
/* 41 */     super.registerGoals();
/* 42 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*    */         {
/*    */           protected boolean canPerformAttack(LivingEntity entity) {
/* 45 */             return (isTimeToAttack() && this.mob.distanceToSqr((Entity)entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight((Entity)entity));
/*    */           }
/*    */         });
/* 48 */     this.goalSelector.addGoal(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 49 */     this.targetSelector.addGoal(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 50 */     this.goalSelector.addGoal(4, (Goal)new RandomLookAroundGoal((Mob)this));
/* 51 */     this.goalSelector.addGoal(5, (Goal)new FloatGoal((Mob)this));
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType getMobType() {
/* 56 */     return MobType.UNDEFINED;
/*    */   }
/*    */   
/*    */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 60 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 61 */     spawnAtLocation(new ItemStack((ItemLike)Items.PORKCHOP));
/*    */   }
/*    */ 
/*    */   
/*    */   public SoundEvent getAmbientSound() {
/* 66 */     return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.pig.ambient"));
/*    */   }
/*    */ 
/*    */   
/*    */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 71 */     playSound((SoundEvent)BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.pig.step")), 0.15F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public SoundEvent getHurtSound(DamageSource ds) {
/* 76 */     return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.pig.hurt"));
/*    */   }
/*    */ 
/*    */   
/*    */   public SoundEvent getDeathSound() {
/* 81 */     return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.pig.death"));
/*    */   }
/*    */   
/*    */   public static void init() {
/* 85 */     SpawnPlacements.register((EntityType)ReturnToExclusiveMobsModEntities.PONEY_PIG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 86 */         (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8));
/*    */   }
/*    */   
/*    */   public static AttributeSupplier.Builder createAttributes() {
/* 90 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 91 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 92 */     builder = builder.add(Attributes.MAX_HEALTH, 10.0D);
/* 93 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 94 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 95 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 96 */     return builder;
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/entity/PigHorseEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */