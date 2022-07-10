package tp_final_supermark;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
    
public class menuOpciones 
{
	static Conexion conn;
	private Clientes u;
	Scanner t=new Scanner(System.in);
	public static Clientes c;
	
	public menuOpciones(Clientes cliente) throws SQLException {
		conn = new Conexion();
		System.out.println("MENU");
		System.out.println("1-VER LISTADO DEL PRODUCTOS");
		System.out.println("2-SELECCIONAR PRODUCTOS");
		System.out.println("3-VER PRODUCTOS SELECCIONADOS");
		System.out.println("4-AUTORIZAR COMPRA");
	    c=cliente;
	    Scanner sc = new Scanner(System.in);
	    int op= sc.nextInt();
	    switch(op) {
	    case 1: 
	    	String  sql="select * from productos;";
	        ResultSet  r= conn.devolverConsulta(sql);
	        while(r.next()) {
	        	System.out.println(r.getInt("idProducto")+"\t"+ r.getString("nombre")+"\t"+r.getString("precio")+"\t"+r.getInt("stock")+"\t"+r.getInt("idCategoria"));
	        }
	    	break;
	    
	    case 2: 
	    	seleccionarProductos();
	    	
	    	break;
	    
	    case 3:  
	    	break;
	    default:
			break;
	    }
		
		
	}
	
	public void seleccionarProductos() throws SQLException 
	{
			
			//int cant= r.getInt("count");
			//int b=1;
			System.out.print("Seleccione los productos que desea agregar al carrito");
			String  sql="select * from productosseleccionados;";
	        ResultSet  r= conn.devolverConsulta(sql);
	        while(r.next()) {
	        	System.out.println(r.getInt("idProdSeleccionado")+"\t"+ r.getString("nombre")+"\t"+r.getString("precio")+"\t"+"\t"+r.getInt("idCliente"));
	        }
	}

}

