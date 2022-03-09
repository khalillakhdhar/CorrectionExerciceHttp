package com.duranco.model;

public class Calcule {
	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public int somme()
	{
		return a+b;
	}
	public int produit()
	{
		return a*b;
	}
	public int pgcd()
	{
		int x=this.a;
		int y=this.b;
		while(x!=y)
		{
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		return x;
	}
	public double factoriel()
	{
		int f=1;
		for(int i=2;i<= this.a; i++)
		{
			f*=i;
		}
		return f;
	}

	@Override
	public String toString() {
		return "Calcule [a=" + a + ", b=" + b + ", somme()=" + somme() + ", produit()=" + produit() + ", pgcd()="
				+ pgcd() + ", factoriel()=" + factoriel() + "]";
	}

	
	
	
}
