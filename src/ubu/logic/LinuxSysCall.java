package ubu.logic;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;

public class LinuxSysCall implements AbstractSysCall {
	
	private String comando1, comando2;
	
	public LinuxSysCall ()
	{
		comando1 = "wmctrl -l | grep -E '^0x0*'`xprop -root | grep ";
		comando1 += "'_NET_ACTIVE_WINDOW(WINDOW)'  | awk -F ' window ";
		comando1 += "id # 0x' '{print $2}'` | cut -f 5- -d ' '";
		
		comando2 = "wmctrl -l | cut -f 5- -d ' '";
	}
	
	/**
	 * Returns active window title.
	 */
	public String getCurrentWindowTitle ()
	{
		ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", comando1);
		//pb = pb.redirectErrorStream(true);	// just for debugging
		InputStream is = null;
		String s = "";
		byte[] b = null;
		
		try {
			Process p = pb.start();
			is = p.getInputStream();
			p.waitFor();
			b = new byte[is.available()];
			is.read(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (is == null) {
			return "";
		} else {
			return new String(b);
		}
	}
	
	public List<String> getWindowTitleList ()
	{
		List<String> lista = new ArrayList(6);
		ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", comando2);
		//pb = pb.redirectErrorStream(true);	// just for debugging
		InputStream is;
		BufferedReader bf;
		String s;
		
		try {
			Process p = pb.start();
			is = p.getInputStream();
			p.waitFor();
			bf = new BufferedReader(new InputStreamReader(is));
			s = bf.readLine();
			while (s != null) {
				lista.add(s);
				s = bf.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
}
