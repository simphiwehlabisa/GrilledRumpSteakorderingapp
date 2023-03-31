package com.example.grilledrumpsteakorderingapp;


public class GrilledRumpSteak {

 private String size;

 private int salsaToppings;

 private int tomatoToppings;

 private int mushroomToppings;

public GrilledRumpSteak(String size, int salsaToppings, int tomatoToppings, int mushroomToppings) {
 this.size = size;

 this.salsaToppings = salsaToppings;

 this.tomatoToppings = tomatoToppings;

 this.mushroomToppings = mushroomToppings;

 }

public String getSize() {
 return size;
 }

public void setSize(String size) {
 this.size = size;
 }

public int getSalsaToppings() {

 return salsaToppings;

 }



public void setSalsaToppings(int salsaToppings) {

 this.salsaToppings = salsaToppings;

 }



public int getTomatoToppings() {

 return tomatoToppings;

 }


 public void setTomatoToppings(int tomatoToppings) {

 this.tomatoToppings = tomatoToppings;

 }



public int getMushroomToppings() {

 return mushroomToppings;

 }



public void setMushroomToppings(int mushroomToppings) {

 this.mushroomToppings = mushroomToppings;

 }



public double calcCost() {

 double baseCost = 0;

 double toppingCost = 0;

 switch (size) {

 case "large":

 baseCost = 200;

 toppingCost = 30;

 break;

 case "medium":

 baseCost = 150;

 toppingCost = 20;

 break;

 case "small":

 baseCost = 120;

 toppingCost = 15;

 break;

 }



 double totalToppingCost = (salsaToppings + tomatoToppings + mushroomToppings) * toppingCost;

 return baseCost + totalToppingCost;

 }



public String getDescription() {

 return size + " rump with " + salsaToppings + " salsa topping(s), " + tomatoToppings + " tomato topping(s), and " + mushroomToppings + " mushroom topping(s)";

 }

}



