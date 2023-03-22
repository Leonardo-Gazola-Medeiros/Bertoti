package models;
import models.Aluno;

public class Teste {

	public static void main(String[] args){
		
		Data testando = new Data(17,8,1998);
		Aluno leonardo = new Aluno(112122,"Leonardo Gazola Medeiros","M", "43037066806", testando);
		
		System.out.println(leonardo.toString());
	}
	
}
