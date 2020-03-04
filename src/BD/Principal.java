package BD;

import BD.Conexiones.IConexionBD;

public class Principal {

	public static void main(String[] args) {
		
		Fabricador fabricador = Generador.getFabricador(Generador.TIPO.BD);
		
		IConexionBD bd1 = fabricador.getBD(Fabricador.TIPO_MOTOR.POSTGRE);
		bd1.conectar();
		
		IConexionBD bd2 = fabricador.getBD(Fabricador.TIPO_MOTOR.MYSQL);
		bd2.conectar();
		
	}

}