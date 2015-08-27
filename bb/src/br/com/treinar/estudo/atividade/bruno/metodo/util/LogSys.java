package br.com.treinar.estudo.atividade.bruno.metodo.util;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogSys {
	public static void logsistema(Throwable erro ) {
		try {
			//**trabalhando no carregamento e transformação do texto
			OutputStream arq = new FileOutputStream("log.txt", Boolean.TRUE);
			OutputStreamWriter arqw = new OutputStreamWriter(arq);
			BufferedWriter txt = new BufferedWriter(arqw);
			//**
						
			txt.write("\n\n" + getCustomStackTrace(erro)); //salva o erro no log
			
			txt.close();
		} catch (FileNotFoundException e) {
			System.out.println("Você não tem permissão para ler o arquivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String getCustomStackTrace(Throwable aThrowable) {
		//**pegando a data
		Date data = new Date();  
		        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");  
	    //**		

	    final StringBuilder result = new StringBuilder(sdf.format(data)+"\n");
	    result.append(aThrowable.toString());
	    final String NEW_LINE = System.getProperty("line.separator");
	    result.append(NEW_LINE);

	    //add each element of the stack trace
	    for (StackTraceElement element : aThrowable.getStackTrace() ){
	      result.append( element );
	      result.append( NEW_LINE );
	    }
	    return result.toString();
	  }
	
}
