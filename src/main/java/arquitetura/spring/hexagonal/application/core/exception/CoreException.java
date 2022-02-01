package arquitetura.spring.hexagonal.application.core.exception;

import java.io.Serializable;

public class CoreException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public CoreException() {
        super();
    }
    public CoreException(String msg)   {
        super(msg);
    }
    public CoreException(String msg, Exception e)  {
        super(msg, e);
    }
}

