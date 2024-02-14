package actividad_1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 *
 * @author DAM
 */
public class FTPCliente {

    private String server;
    private int port;
    private String user;
    private String password;
    private FTPClient ftp;

    public FTPCliente(String server, int port, String user, String password) {
        this.server = server;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    public void writeLog() throws IOException {
        ftp.changeWorkingDirectory("/LOG");

        String logMessage = "\nHora de conexión: " + new java.util.Date(System.currentTimeMillis());
        InputStream input = new ByteArrayInputStream(logMessage.getBytes("UTF-8"));

        boolean success = ftp.appendFile("LOG.TXT", input);

        if (success) {
            System.out.println("Log actualizado con éxito.");
        } else {
            System.out.println("No se pudo actualizar el log.");
        }

        input.close();
    }

    boolean open() throws IOException {
        ftp = new FTPClient();

        ftp.connect(server, port);
        int reply = ftp.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
            throw new IOException("Exception in connecting to FTP Server");
        }

        return ftp.login(user, password);

    }

    void close() throws IOException {
        ftp.disconnect();
    }
}
