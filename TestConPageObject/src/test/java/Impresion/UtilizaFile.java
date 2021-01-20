package Impresion;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class UtilizaFile {
	
	
	GeneraEvidencias ImprEvi;
	
	//Se esta generando el paso y la fotografía
	
	public void PasoDelScript(String descripcionPaso) throws InvalidFormatException, IOException, HeadlessException, AWTException {
		
//		GeneraEvidencias.OpenFile(1, descripcionPaso);//"1.AbreNavegador"
//		GeneraEvidencias.screenshoot();		
	}
	
	//Otro meotodo
	public void InicializaFile() throws HeadlessException, InvalidFormatException, IOException, AWTException{
		//GeneraEvidencias.definevariables();		
	}

	public void GeneraEvidencia(String NombreArchivo) throws IOException{
		GeneraEvidencias.CloseFile(NombreArchivo);			
	}
	
}
