package co.gov.coran.licencias.filter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseWrapper extends HttpServletResponseWrapper {
    private ByteArrayPrintWriter output;
    private boolean usingWriter;

    public ResponseWrapper(HttpServletResponse response) {
        super(response);
        usingWriter = false;
        output = new ByteArrayPrintWriter();
    }

    public byte[] getByteArray() {
        return output.toByteArray();
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        if (usingWriter) {
            super.getOutputStream();
        }

        usingWriter = true;
        return output.getStream();
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        if (usingWriter) {
            super.getWriter();
        }

        usingWriter = true;
        return output.getWriter();
    }

    @Override
    public String toString() {
        return output.toString();
    }
}
