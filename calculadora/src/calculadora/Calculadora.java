package calculadora;

public class Calculadora {
	private int numero1;
	private int numero2;
	
	public Calculadora(int n1,int n2){
		this.numero1 = n1;
		this.numero2 = n2;
	}
	public int suma(){
		return this.numero1+this.numero2;
	}
	public double division(){
		return this.numero1/this.numero2;
	}
	public int multiplicacion(){
		return this.numero1*this.numero2;
	}
	public int resta(){
		return this.numero1-this.numero2;
	}

}
