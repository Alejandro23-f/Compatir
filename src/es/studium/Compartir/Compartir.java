package es.studium.Compartir;

public class Compartir
{
	int variable;
	
	Compartir()
	{
		variable = 0;
	}
	Compartir(int v)
	{
		variable = v;
	}
	
	public int getVariable()
	{
		return variable;
	}
	public void setVariable(int variable)
	{
		this.variable = variable;
	}
	public static void main(String[] args)
	{
		Compartir objeto = new Compartir(33);
		System.out.println(objeto.getVariable());
		System.out.println("Comentario para cambiar el proyecto");
		//Este proyecto est� cambiado mediante este comentario para subuirlo a github
	}
}