/*    */ package net.mcreator.welcomebackhorsetwopointzero;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.ConcurrentLinkedQueue;
/*    */ import net.mcreator.welcomebackhorsetwopointzero.init.ReturnToExclusiveMobsModEntities;
/*    */ import net.mcreator.welcomebackhorsetwopointzero.init.ReturnToExclusiveMobsModItems;
/*    */ import net.mcreator.welcomebackhorsetwopointzero.init.ReturnToExclusiveMobsModTabs;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.util.Tuple;
/*    */ import net.neoforged.bus.api.IEventBus;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.util.thread.SidedThreadGroups;
/*    */ import net.neoforged.neoforge.common.NeoForge;
/*    */ import net.neoforged.neoforge.event.TickEvent;
/*    */ import net.neoforged.neoforge.network.event.RegisterPayloadHandlerEvent;
/*    */ import net.neoforged.neoforge.network.handling.IPlayPayloadHandler;
/*    */ import net.neoforged.neoforge.network.registration.IPayloadRegistrar;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod("return_to_exclusive_mobs")
/*    */ public class ReturnToExclusiveMobsMod
/*    */ {
/* 34 */   public static final Logger LOGGER = LogManager.getLogger(ReturnToExclusiveMobsMod.class);
/*    */   
/*    */   public static final String MODID = "return_to_exclusive_mobs";
/*    */ 
/*    */   
/*    */   public ReturnToExclusiveMobsMod(IEventBus modEventBus) {
/* 40 */     NeoForge.EVENT_BUS.register(this);
/* 41 */     modEventBus.addListener(this::registerNetworking);
/*    */     
/* 43 */     ReturnToExclusiveMobsModItems.register(modEventBus);
/* 44 */     ReturnToExclusiveMobsModEntities.REGISTRY.register(modEventBus);
/* 45 */     ReturnToExclusiveMobsModTabs.REGISTRY.register(modEventBus);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static boolean networkingRegistered = false;
/*    */ 
/*    */   
/* 54 */   private static final Map<ResourceLocation, NetworkMessage<?>> MESSAGES = new HashMap<>();
/*    */   private static final class NetworkMessage<T extends CustomPacketPayload> extends Record { private final FriendlyByteBuf.Reader<T> reader; private final IPlayPayloadHandler<T> handler;
/* 56 */     private NetworkMessage(FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) { this.reader = reader; this.handler = handler; } public final String toString() { // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: <illegal opcode> toString : (Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;)Ljava/lang/String;
/*    */       //   6: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #56	-> 0
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	7	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;
/*    */       // Local variable type table:
/*    */       //   start	length	slot	name	signature
/* 56 */       //   0	7	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage<TT;>; } public FriendlyByteBuf.Reader<T> reader() { return this.reader; } public final int hashCode() { // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: <illegal opcode> hashCode : (Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;)I
/*    */       //   6: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #56	-> 0
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	7	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;
/*    */       // Local variable type table:
/*    */       //   start	length	slot	name	signature
/*    */       //   0	7	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage<TT;>; } public final boolean equals(Object o) { // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: aload_1
/*    */       //   2: <illegal opcode> equals : (Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;Ljava/lang/Object;)Z
/*    */       //   7: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #56	-> 0
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	8	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;
/*    */       //   0	8	1	o	Ljava/lang/Object;
/*    */       // Local variable type table:
/*    */       //   start	length	slot	name	signature
/* 56 */       //   0	8	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage<TT;>; } public IPlayPayloadHandler<T> handler() { return this.handler; }
/*    */      }
/*    */   
/*    */   public static <T extends CustomPacketPayload> void addNetworkMessage(ResourceLocation id, FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
/* 60 */     if (networkingRegistered)
/* 61 */       throw new IllegalStateException("Cannot register new network messages after networking has been registered"); 
/* 62 */     MESSAGES.put(id, new NetworkMessage(reader, handler));
/*    */   }
/*    */ 
/*    */   
/*    */   private void registerNetworking(RegisterPayloadHandlerEvent event) {
/* 67 */     IPayloadRegistrar registrar = event.registrar("return_to_exclusive_mobs");
/* 68 */     MESSAGES.forEach((id, networkMessage) -> registrar.play(id, networkMessage.reader(), networkMessage.handler()));
/* 69 */     networkingRegistered = true;
/*    */   }
/*    */   
/* 72 */   private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();
/*    */   
/*    */   public static void queueServerWork(int tick, Runnable action) {
/* 75 */     if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
/* 76 */       workQueue.add(new Tuple(action, Integer.valueOf(tick))); 
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 81 */     if (event.phase == TickEvent.Phase.END) {
/* 82 */       List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
/* 83 */       workQueue.forEach(work -> {
/*    */             work.setB(Integer.valueOf(((Integer)work.getB()).intValue() - 1));
/*    */             if (((Integer)work.getB()).intValue() == 0)
/*    */               actions.add(work); 
/*    */           });
/* 88 */       actions.forEach(e -> ((Runnable)e.getA()).run());
/* 89 */       workQueue.removeAll(actions);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */