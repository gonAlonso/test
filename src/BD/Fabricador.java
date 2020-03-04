package BD;

import BD.Conexiones.IConexionBD;

public interface Fabricador {
	static enum TIPO_MOTOR  {MYSQL, ORACLE, POSTGRE, SQLSERVER}

	 IConexionBD getBD(TIPO_MOTOR motor);
	
}