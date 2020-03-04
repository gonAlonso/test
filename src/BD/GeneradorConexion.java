package BD;
public class GeneradorConexion {

	enum TIPO {BD}
	public static Fabricador getFabricador(TIPO tipoFabrica) {

		switch(tipoFabrica) {
			case BD: return new FabricadorConexionBD();
		}
		
		return null;
	}
}