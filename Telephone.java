package com.frist.day7;
public class Telephone
{
	private int id;
	private String name;
	private String factory;
	private int price;
	public Telephone(int id,String name,String factory,int price){
	this.id=id;
	this.name=name;
	this.factory=factory;
	this.price=price;
	
	}
	public void setId(int id)
	{
	  this.id=id;
	}
	public int getId()
	{return this.id;}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{return this.name;}
	public void setFactory(String factory)
	{
	    this.factory=factory;
	}
	public String getFactory()
	{return this.name;}
	public void setPrice(int price)
	{this.price=price;}
	public int getPrice()
	{return this.price;}
	public String toString()
		{ return "telephone[id:"+this.id+",name:"+this.name+",factory:"+this.factory+",price:"+this.price+"]";
	
	}
	
}