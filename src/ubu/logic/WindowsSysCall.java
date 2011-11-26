package ubu.logic;

/*JNA is an open library available at Sun's website.
 Both the jna.jar and the platform.jar must be present*/
import com.sun.jna.*;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.win32.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;

public class WindowsSysCall implements AbstractSysCall {
    
        public interface User32 extends StdCallLibrary {

        User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class);

        HWND GetForegroundWindow(); 

        int GetWindowTextA(PointerType hWnd, byte[] lpString, int nMaxCount);
    }
	
	private String comando;
	
	public WindowsSysCall ()
	{
		comando = System.getenv("windir") +"\\system32\\"+"tasklist.exe";
	}
	
	/**
	 * Devuelve el titulo de la ventana activa.
	 */
    @Override
	public String getCurrentWindowTitle ()
	{
                byte[] windowText = new byte[512];

                PointerType hwnd = User32.INSTANCE.GetForegroundWindow();
                User32.INSTANCE.GetWindowTextA(hwnd, windowText, 512);
                return Native.toString(windowText);  
	}
	
    @Override
	public List<String> getWindowTitleList ()
	{
		List<String> lista = new ArrayList(6);

                try {
                    String line;
                    Process p = Runtime.getRuntime().exec(comando);
                    BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    while ((line = input.readLine()) != null) {
			lista.add(line);
                    }
                    input.close();
                }
                    catch (Exception err) {
                         System.out.println(err);
                }
		
		return lista;
	}
	
}
