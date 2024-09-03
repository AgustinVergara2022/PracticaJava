package DemoJFileChooser;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DemoJFileChooser extends JFrame{
    
    private final JTextArea areaSalida; // muestra el contenido del archivo

    // establece la GUI
    public DemoJFileChooser() throws IOException
    {
        super("Demo de JFileChooser");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida)); // areaSalida cuenta con controles deslizables
        analizarRuta(); // obtiene el objeto Path del usuario y muestra la información
    }

    // muestra información acerca del archivo o directorio que especifica el usuario
    public void analizarRuta() throws IOException
    {
        // crea un objeto Path con la ruta al archivo o directorio seleccionado por el usuario
        Path ruta = obtenerRutaArchivoODirectorio();

        if (ruta != null && Files.exists(ruta)) // si el nombre existe, muestra información sobre él
        {
            // recopila información sobre el archivo (o directorio)
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s:%n", ruta.getFileName()));
            builder.append(String.format("%s un directorio%n",
            Files.isDirectory(ruta) ? "es" :  "No es"));
            builder.append(String.format("%s una ruta absoluta%n",
            ruta.isAbsolute() ? "Es" : "No es"));
            builder.append(String.format("Ultima modificacion: %s%n",
            Files.getLastModifiedTime(ruta)));
            builder.append(String.format("Tamanio: %s%n", Files.size(ruta)));
            builder.append(String.format("Ruta: %s%n", ruta));
            builder.append(String.format("Ruta absoluta: %s%n", ruta.toAbsolutePath()));

            if (Files.isDirectory(ruta)) // muestra en pantalla el listado del directorio
            {
                builder.append(String.format("%nContenido del directorio:%n"));

                // objeto para iterar a través del contenido de un directorio
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);

                for (Path p : flujoDirectorio)
                        builder.append(String.format("%s%n", p));
            }

            areaSalida.setText(builder.toString()); // muestra el contenido del objeto String
        }
        else // El objeto Path no existe
        {
            JOptionPane.showMessageDialog(this, ruta.getFileName() +
                " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
      } // fin del método analizarRuta

        // permite al usuario especificar el nombre del archivo o directorio
        private Path obtenerRutaArchivoODirectorio()
        {
            // configura el diálogo para permitir la selección de un archivo o directorio
            JFileChooser selectorArchivos = new JFileChooser();
            selectorArchivos.setFileSelectionMode(
        JFileChooser.FILES_AND_DIRECTORIES);
            int resultado = selectorArchivos.showOpenDialog(this);

            // si el usuario hizo clic en el botón Cancelar en el cuadro de diálogo, regresa
            if (resultado == JFileChooser.CANCEL_OPTION)
                System.exit(1);

            // devuelve objeto Path que representa el archivo seleccionado
            return selectorArchivos.getSelectedFile().toPath() ;
        }
} // fin de la clase DemoJFileChooser