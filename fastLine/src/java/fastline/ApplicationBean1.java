/*
 * ApplicationBean1.java
 *
 * Created on 04/11/2008, 11:30:59 PM
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractApplicationBean;
import javax.faces.FacesException;
import conexionJDBC.Conector;
import java.sql.ResultSet;

/**
 * <p>Application scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available to all users
 *  and pages in the application.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 *
 * @author itachi
 */
public class ApplicationBean1 extends AbstractApplicationBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private String nombreusuario;
    private int estadoAsientos[];
    private Conector Con;
    private ResultSet respaldo1,respaldo2;
    private boolean sesion;
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        setNombreusuario("");
        setSesion(false);
    }
    // </editor-fold>

    /**
     * <p>Construct a new application data bean instance.</p>
     */
    public ApplicationBean1() {
    }

    /**
     * <p>This method is called when this bean is initially added to
     * application scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * application scope.</p>
     * 
     * <p>You may customize this method to initialize and cache application wide
     * data values (such as the lists of valid options for dropdown list
     * components), or to allocate resources that are required for the
     * lifetime of the application.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("ApplicationBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>This method is called when this bean is removed from
     * application scope.  Typically, this occurs as a result of
     * the application being shut down by its owning container.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return an appropriate character encoding based on the
     * <code>Locale</code> defined for the current JavaServer Faces
     * view.  If no more suitable encoding can be found, return
     * "UTF-8" as a general purpose default.</p>
     *
     * <p>The default implementation uses the implementation from
     * our superclass, <code>AbstractApplicationBean</code>.</p>
     */
    @Override
    public String getLocaleCharacterEncoding() {
        return super.getLocaleCharacterEncoding();
    }

    /**
     * @return the nombreusuario
     */
    public String getNombreusuario() {
        return nombreusuario;
    }

    /**
     * @param nombreusuario the nombreusuario to set
     */
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    /**
     * @return the estadoAsientos
     */
    public int[] getEstadoAsientos() {
        return estadoAsientos;
    }

    /**
     * @param estadoAsientos the estadoAsientos to set
     */
    public void setEstadoAsientos(int[] estadoAsientos) {
        this.estadoAsientos = estadoAsientos;
    }

    /**
     * @return the Con
     */
    public Conector getCon() {
        return Con;
    }

    /**
     * @param Con the Con to set
     */
    public void setCon(String usu,String pass) {
        this.Con = new Conector(usu,pass);
    }

    /**
     * @return the respaldo1
     */
    public ResultSet getRespaldo1() {
        return respaldo1;
    }

    /**
     * @param respaldo1 the respaldo1 to set
     */
    public void setRespaldo1(ResultSet respaldo1) {
        this.respaldo1 = respaldo1;
    }

    /**
     * @return the respaldo2
     */
    public ResultSet getRespaldo2() {
        return respaldo2;
    }

    /**
     * @param respaldo2 the respaldo2 to set
     */
    public void setRespaldo2(ResultSet respaldo2) {
        this.respaldo2 = respaldo2;
    }

    /**
     * @return the sesion
     */
    public boolean getSesion() {
        return sesion;
    }

    /**
     * @param sesion the sesion to set
     */
    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }
}
