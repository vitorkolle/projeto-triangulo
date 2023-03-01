package br.senai.sp.model;

public class Triangulo {
	
	//propriedades da classe
	public double base;
	public double ladoC;
	public double ladoB;
	public double altura;
	public String nome;
	public double area;
	
	
	//métodos da classe
	public void mostrarDimensoes() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("" + nome);
		System.out.println("-----------------------------------------------------------");
		System.out.println("Base------> " + base);
		System.out.println("Lado B------> " + ladoB);
		System.out.println("Lado C-------> " + ladoC);
		System.out.println("Altura------->" + altura);
		calcularArea();
	}
		
	public void calcularArea() {
		double area =(base * altura) / 2;
		System.out.println("Área-------------------> " + area);
		
		
		
		
		
		
}
	
	
	
	
	

}
