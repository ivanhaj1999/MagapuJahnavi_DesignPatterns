package com.janu.abstractfactory_pattern;

public class ShapeFactory extends AbstractFactory {
	   public DrawShape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }	 
	      return null;
	   }
	}