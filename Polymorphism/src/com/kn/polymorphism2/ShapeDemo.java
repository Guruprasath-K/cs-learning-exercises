/*
 * package com.kn.polymorphism2;
 * 
 * public class ShapeDemo {
 * 
 * public static void main(String[] args) {
 * 
 * // Create object of the Parent Class Shape sh;
 * 
 * // Parent Class Variable assigned to the Child Class Object sh = new
 * Circle(); sh.draw(); System.out.println("Area of Circle = " +
 * sh.calculateArea());
 * 
 * // Error ==> The method calculatePerimeter() is undefined for the type Shape
 * // The Child specific method cannot be called when the Parent Class Reference
 * is // assigned to the Child Class Object //
 * System.out.println(sh.calculatePerimeter());
 * 
 * // Downcasting to Circle class to call Child Specific Method
 * System.out.println("Perimeter of Circle = " + ((Circle)
 * (sh)).calculateCirclePerimeter());
 * 
 * sh = new Rectangle(); sh.draw(); System.out.println("Area of Rectangle = " +
 * sh.calculateArea());
 * 
 * // Downcasting to Circle class to call Child Specific Method
 * System.out.println("Perimeter of Rectangle = " + ((Rectangle)
 * (sh)).calculateRectanglePerimeter());
 * 
 * sh = new Square(); sh.draw(); System.out.println("Area of Square = " +
 * sh.calculateArea());
 * 
 * // Downcasting to Circle class to call Child Specific Method
 * System.out.println("Perimeter of Square = " + ((Square)
 * (sh)).calculateSquarePerimeter()); }
 * 
 * }
 */
