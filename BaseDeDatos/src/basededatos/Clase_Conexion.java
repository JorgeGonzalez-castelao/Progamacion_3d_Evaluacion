
package basededatos;

/**
 *
 * @author Jorge González Ruiz
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;


public class Clase_Conexion {
    private Connection conexion = null;
    private String usuario = "jorge1";
    private String contrasenha = "jorge1";
    private String db = "basejorge";
    private String host = "localhost";
    private String puerto = "5432"; // Puerto por defecto de PostgreSQL

    public Connection getConexion(){
        //intentamos la conexión con un try catch
        try {
            /*Haremos referencia a un archivo de tipo class ubicado en la carpeta org.postgres del driver de Postgres que hemos importado (.jar). 
              El archivo que buscaremos se llama Driver.class, y esa será la ruta que indicaremos.
            
            */
            String rutaDriver =  "org.postgresql.Driver";
            Class.forName(rutaDriver);
            // creamos la url completa
            String cabecera = "jdbc:postgresql://";
            //la cabecera deberá llevar este orden: Cabecera +host : puerto/db sería como una url basica
           String url = cabecera + host + ":" + puerto + "/" + db + "?currentSchema=esquemajorge1";
            //importamos el drive manager que hará la conexion
            //indicamos la url, el usuario y la contraseña
            conexion = DriverManager.getConnection(url,usuario,contrasenha);
            //imprimimos mensaje
            System.out.println("LA CONEXION ESTA OK");
        } catch (Exception e) {
            System.out.println("Error en la coenxion");
        }
        return conexion;
    }
 
        public void crearTabla(){
        try {
    
            Statement statement = conexion.createStatement();
          
         
               String query = "create table esquemajorge1.clientes(DNI varchar(10), nombre varchar(50), apellido varchar(50), edad float, primary key(DNI));";
         
         statement.executeUpdate(query);
                
         JOptionPane.showMessageDialog(null, "LA TABLA SE HA CREADO CORRECTAMENTE");
           
            
        } catch (SQLException e) {
             //e.printStackTrace();
        JOptionPane.showMessageDialog(null, "ERROR AL CREAR LA TABLA");
            
        }
        
    }
        
        
        
        
        public void insertarCliente(String DNI, String nombre, String apellido, float edad) {
    try {
        Statement statement = conexion.createStatement();
        String query = "INSERT INTO esquemajorge1.clientes (DNI, nombre, apellido, edad) VALUES ('" + DNI + "', '" + nombre + "', '" + apellido + "', " + edad + ");";
        statement.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "El cliente se ha insertado correctamente");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar el cliente");
    }
}
        
        
        public void borrarClientePorDNI(String DNI) {
    try {
        Statement statement = conexion.createStatement();
        String query = "DELETE FROM esquemajorge1.clientes WHERE DNI = '" + DNI + "'";
        int rowCount = statement.executeUpdate(query);
        if (rowCount > 0) {
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el DNI especificado");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el cliente");
    }
}
        
        
        public void modificarClientePorDNI(String DNI, String nuevoNombre, String nuevoApellido, float nuevaEdad) {
    try {
        Statement statement = conexion.createStatement();
        String query = "UPDATE esquemajorge1.clientes SET nombre = '" + nuevoNombre + "', apellido = '" + nuevoApellido + "', edad = " + nuevaEdad + " WHERE DNI = '" + DNI + "'";
        int rowCount = statement.executeUpdate(query);
        if (rowCount > 0) {
            JOptionPane.showMessageDialog(null, "El cliente ha sido modificado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el DNI especificado");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el cliente");
    }
}

       public void mostrarTablaEnJTable(JTable jTable1) {
    try {
        // Obtener la conexión
        Connection connection = getConexion();
        
        // Crear un Statement para ejecutar la consulta
        Statement statement = connection.createStatement();
        
        // Ejecutar la consulta y obtener el ResultSet
        ResultSet resultSet = statement.executeQuery("SELECT * FROM esquemajorge1.clientes");
        
        // Crear el DefaultTableModel y configurarlo como modelo de datos del JTable
        DefaultTableModel tableModel = new DefaultTableModel();
        jTable1.setModel(tableModel);
        
        // Obtener el número de columnas del ResultSet
        int columnCount = resultSet.getMetaData().getColumnCount();
        
        // Agregar las columnas al DefaultTableModel
        for (int i = 1; i <= columnCount; i++) {
            tableModel.addColumn(resultSet.getMetaData().getColumnLabel(i));
        }
        
        // Agregar las filas al DefaultTableModel
        while (resultSet.next()) {
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(rowData);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

    
