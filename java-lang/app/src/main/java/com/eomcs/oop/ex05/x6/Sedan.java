package com.eomcs.oop.ex05.x6;

public class Sedan extends Car{
  boolean auto;
  boolean openedSunroof;

  @Override
  public void run() {
    System.out.println("세단 가즈아");
  }

  public void openSunroof() {
    System.out.println("선루프 열다");
    this.openedSunroof = true;
  }

  public void closeSunroof() {
    System.out.println("선루프 닫다");
    this.openedSunroof = false; 
  }
}
