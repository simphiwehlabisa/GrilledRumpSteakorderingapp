package com.example.grilledrumpsteakorderingapp;


public class GrilledRumpSteakOrder {
 private GrilledRumpSteak[] steaks;
 private int numSteaks;



         public GrilledRumpSteakOrder() {
 steaks = new GrilledRumpSteak[3];
 numSteaks = 0;
 }



         public boolean addSteak(GrilledRumpSteak steak) {
 if (numSteaks >= 3) {
 return false; // order is full
 }
 steaks[numSteaks] = steak;
 numSteaks++;
 return true;
 }



         public double calcTotal() {
 double total = 0;
 for (int i = 0; i < numSteaks; i++) {
 total += steaks[i].calcCost();
 }
 return total;
 }
}