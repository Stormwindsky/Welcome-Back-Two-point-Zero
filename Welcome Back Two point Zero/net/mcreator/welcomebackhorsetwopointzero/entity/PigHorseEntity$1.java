/*    */ package net.mcreator.welcomebackhorsetwopointzero.entity;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.PathfinderMob;
/*    */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends MeleeAttackGoal
/*    */ {
/*    */   null(PathfinderMob arg0, double arg1, boolean arg2) {
/* 42 */     super(arg0, arg1, arg2);
/*    */   }
/*    */   protected boolean canPerformAttack(LivingEntity entity) {
/* 45 */     return (isTimeToAttack() && this.mob.distanceToSqr((Entity)entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight((Entity)entity));
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/entity/PigHorseEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */