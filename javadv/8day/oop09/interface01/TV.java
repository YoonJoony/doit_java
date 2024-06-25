package oop09.interface01;

public interface TV {
   public void turnOn() ;
      
   public void turnOff() ;

   public void channelUp();


   public void channelDown();

   public void soundUp();
   
   public /*abstract */void soundDown();
   public default void setSpeaker(Speaker speaker) {
	   System.out.println("본체의 스피커를 출력합니다.");
   }
}
