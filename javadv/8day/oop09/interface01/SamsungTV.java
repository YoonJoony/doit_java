package oop09.interface01;

public class SamsungTV implements TV{
   private Speaker speaker = new HarmanSpeaker();
   
   public void setSpeaker(Speaker speaker) {		
	   this.speaker = speaker;
	}
   
   public void turnOn() {
      System.out.println("SamsungTV : 전원을 킨다.");
   }
   
   
   public void turnOff() {
      System.out.println("SamsungTV : 전원을 끈다.");
   }

   public void channelUp() {
      System.out.println("SamsungTV : 채널을 올리다.");
   }


   public void channelDown() {
      System.out.println("SamsungTV : 채널을 내린다.");
   }

   public void soundUp() {
      if(speaker == null) {
         System.out.println("SamsungTV : 소리를 키웁니다.");
      }else {
         speaker.soundUp();
      }
   
   }
   
   public void soundDown() {
      if(speaker == null) {
         System.out.println("SamsungTV : 소리를 줄인다.");
   }else {
      speaker.soundDown();
   }
   }
   
}
