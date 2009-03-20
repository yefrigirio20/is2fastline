/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.StaticText;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version estadoEncomiendas.java
 * @version Created on 20/03/2009, 03:00:08 PM
 * @author Rene
 */

public class estadoEncomiendas extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private StaticText origen = new StaticText();

    public StaticText getOrigen() {
        return origen;
    }

    public void setOrigen(StaticText st) {
        this.origen = st;
    }
    private StaticText destino = new StaticText();

    public StaticText getDestino() {
        return destino;
    }

    public void setDestino(StaticText st) {
        this.destino = st;
    }
    private StaticText envAP = new StaticText();

    public StaticText getEnvAP() {
        return envAP;
    }

    public void setEnvAP(StaticText st) {
        this.envAP = st;
    }
    private StaticText envAM = new StaticText();

    public StaticText getEnvAM() {
        return envAM;
    }

    public void setEnvAM(StaticText st) {
        this.envAM = st;
    }
    private StaticText envN = new StaticText();

    public StaticText getEnvN() {
        return envN;
    }

    public void setEnvN(StaticText st) {
        this.envN = st;
    }
    private StaticText envDNI = new StaticText();

    public StaticText getEnvDNI() {
        return envDNI;
    }

    public void setEnvDNI(StaticText st) {
        this.envDNI = st;
    }
    private StaticText fecha = new StaticText();

    public StaticText getFecha() {
        return fecha;
    }

    public void setFecha(StaticText st) {
        this.fecha = st;
    }
    private StaticText estado = new StaticText();

    public StaticText getEstado() {
        return estado;
    }

    public void setEstado(StaticText st) {
        this.estado = st;
    }
    private StaticText recDNI = new StaticText();

    public StaticText getRecDNI() {
        return recDNI;
    }

    public void setRecDNI(StaticText st) {
        this.recDNI = st;
    }
    private StaticText recN = new StaticText();

    public StaticText getRecN() {
        return recN;
    }

    public void setRecN(StaticText st) {
        this.recN = st;
    }
    private StaticText recAM = new StaticText();

    public StaticText getRecAM() {
        return recAM;
    }

    public void setRecAM(StaticText st) {
        this.recAM = st;
    }
    private StaticText recAP = new StaticText();

    public StaticText getRecAP() {
        return recAP;
    }

    public void setRecAP(StaticText st) {
        this.recAP = st;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public estadoEncomiendas() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        llenarDatos();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("estadoEncomiendas Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    private void llenarDatos(){
        try {
            getApplicationBean1().getCon().Result.next();
            origen.setText(getApplicationBean1().getCon().Result.getString("origen"));
            origen.setVisible(true);

            destino.setText(getApplicationBean1().getCon().Result.getString("destino"));
            destino.setVisible(true);

            envAP.setText(getApplicationBean1().getCon().Result.getString("envapelpat"));
            envAP.setVisible(true);

            envAM.setText(getApplicationBean1().getCon().Result.getString("envapelmat"));
            envAM.setVisible(true);

            envN.setText(getApplicationBean1().getCon().Result.getString("envnom"));
            envN.setVisible(true);

            envDNI.setText(getApplicationBean1().getCon().Result.getString("envdni"));
            envDNI.setVisible(true);


            recAP.setText(getApplicationBean1().getCon().Result.getString("recapelpat"));
            recAP.setVisible(true);

            recAM.setText(getApplicationBean1().getCon().Result.getString("recapelmat"));
            recAM.setVisible(true);

            recN.setText(getApplicationBean1().getCon().Result.getString("recnom"));
            recN.setVisible(true);

            recDNI.setText(getApplicationBean1().getCon().Result.getString("recdni"));
            recDNI.setVisible(true);

            fecha.setText(getApplicationBean1().getCon().Result.getString("fechsal"));
            fecha.setVisible(true);

        } 
        catch (Exception e) {
        }
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }
    
}

