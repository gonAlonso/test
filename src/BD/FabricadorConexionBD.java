package BD;

import BD.Conexiones.*;

public class FabricadorConexionBD implements Fabricador{

	
	@Override
	public IConexionBD getBD(TIPO_MOTOR motor) {
		switch(motor) {
			case MYSQL: return new ConexionMySQL();
			case POSTGRE: return new ConexionPostgreSQL();
			case ORACLE: return new ConexionOracle();

			default : return new ConexionMySQL();
		}
		
	}

}