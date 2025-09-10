/*    */ package net.mcreator.welcomebackhorsetwopointzero;
/*    */ 
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.neoforged.neoforge.network.handling.IPlayPayloadHandler;
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
/*    */ final class NetworkMessage<T extends CustomPacketPayload>
/*    */   extends Record
/*    */ {
/*    */   private final FriendlyByteBuf.Reader<T> reader;
/*    */   private final IPlayPayloadHandler<T> handler;
/*    */   
/*    */   public final String toString() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;
/*    */     // Local variable type table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	7	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage<TT;>;
/*    */   }
/*    */   
/*    */   public final int hashCode() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;
/*    */     // Local variable type table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	7	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage<TT;>;
/*    */   }
/*    */   
/*    */   public final boolean equals(Object o) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage;
/*    */     //   0	8	1	o	Ljava/lang/Object;
/*    */     // Local variable type table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	8	0	this	Lnet/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage<TT;>;
/*    */   }
/*    */   
/*    */   private NetworkMessage(FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
/* 56 */     this.reader = reader; this.handler = handler; } public FriendlyByteBuf.Reader<T> reader() { return this.reader; } public IPlayPayloadHandler<T> handler() { return this.handler; }
/*    */ 
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/welcome-back-two-point-zero-1.0.0-neoforge-1.20.4.jar!/net/mcreator/welcomebackhorsetwopointzero/ReturnToExclusiveMobsMod$NetworkMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */