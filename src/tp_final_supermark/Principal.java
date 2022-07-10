package tp_final_supermark;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Principal {

	static Scanner sc;
	static Conexion conn;

	public static void main(String[] args) throws SQLException {
		sc = new Scanner(System.in);
		conn = new Conexion();
		menuPrincipal();

		int opc = sc.nextInt();

		switch (opc) {
		case 1:
			iniciarSesion();

			break;
		case 2:
			registrarse();
			break;

		}
	}

	public static void menuPrincipal() {
		System.out.println("*****menu principal *********** ");
		System.out.println("***** 1- INICIAR SESION ");
		System.out.println("***** 2- REGISTRARSE ");
	}
	
	public static void iniciarSesion() throws SQLException {
		System.out.println("INGRESE SU DNI");
		String dni= sc.next();
		String sql="SELECT * from cliente WHERE dni="+"'"+dni+"';";
		ResultSet resul=conn.devolverConsulta(sql);
		if(resul.next()) {
			System.out.print("Puedes ingresar");
			int id=resul.getInt("idCliente");
			String nom=resul.getNString("nombre");
			String ape=resul.getString("apellido");
			String d=resul.getString("dni");
			String domi=resul.getNString("domicilio");
			int frecuencia=resul.getInt("frecuencia");
			
			Clientes cliente=new Clientes(id,nom,ape,d,domi,frecuencia);
			menuOpciones menu=new menuOpciones(cliente);
			
			
		}else {
			System.out.print("no exite el usuario");
		}

	}

	public static void registrarse() throws SQLException {
		System.out.println("NOMBRE: ");
		String nom = sc.next();
		System.out.println("APELLIDO");
		String ape = sc.next();
		System.out.println("DNI");
		String dni = sc.next();
		System.out.println("DOMICILIO");
		String dom = sc.next();
		String sql = "insert into cliente values(null," + "'" + nom + "'" + ",'" + ape + "'" + ",'" + dni + "'" + ",'"
				+dom + "'" +","+ 0 + ");";

		conn.EjecutarConsulta(sql);
		System.out.print("usuario creado con exito");
	}

	public static void findAll() throws SQLException {
		String sql = "SELECT * from categorias";
		Conexion conexion = new Conexion();
		ResultSet rs = conexion.devolverConsulta(sql);

		System.out.println("Categorias");
		while (rs.next()) {
			System.out.println(rs.getString("nombre"));
		}

	}
	

}
