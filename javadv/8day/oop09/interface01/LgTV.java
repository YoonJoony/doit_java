package oop09.interface01;

public class LgTV implements TV{
	public Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
   //하위 추상메서드를 모두 구현해주어야 함(Overriding)
   public void turnOn() {
      System.out.println("LG TV : 전원을 킨다.");
   }
   
   
   public void turnOff() {
      System.out.println("LG TV : 전원을 끈다.");
   }

   public void channelUp() {
      System.out.println("LG TV : 채널을 올리다.");
   }


   public void channelDown() {
      System.out.println("LG TV : 채널을 내린다.");
   }

   public void soundUp() {
      System.out.println("LG TV : 소리를 키운다.");
   }
   
   public void soundDown() {
      System.out.println("LG TV : 소리를 줄인다.");
   }

}
