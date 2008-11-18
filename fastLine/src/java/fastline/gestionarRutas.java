/*
 * gestionarRutas.java
 *
 * Created on 15-nov-2008, 15:29:12
 */
 
package fastline;

import com.sun.rave.faces.data.DefaultSelectItemsArray;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author Huachani
 */
public class gestionarRutas extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        regionOrigen1DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "Amazonas"), new com.sun.webui.jsf.model.Option("", "Ancash"), new com.sun.webui.jsf.model.Option("", "Apurimac"),new com.sun.webui.jsf.model.Option("", "Arequipa"), new com.sun.webui.jsf.model.Option("", "Ayacucho"), new com.sun.webui.jsf.model.Option("", "Cajamarca"), new com.sun.webui.jsf.model.Option("", "Callao"), new com.sun.webui.jsf.model.Option("", "Cusco"), new com.sun.webui.jsf.model.Option("", "Huancavelica"), new com.sun.webui.jsf.model.Option("", "Huanuco"), new com.sun.webui.jsf.model.Option("", "Ica"), new com.sun.webui.jsf.model.Option("", "Junin"), new com.sun.webui.jsf.model.Option("", "La Libertad"), new com.sun.webui.jsf.model.Option("", "Lambayeque"), new com.sun.webui.jsf.model.Option("", "Lima"), new com.sun.webui.jsf.model.Option("", "Loreto"), new com.sun.webui.jsf.model.Option("", "Madre de Dios"), new com.sun.webui.jsf.model.Option("", "Moquegua"), new com.sun.webui.jsf.model.Option("", "Pasco"), new com.sun.webui.jsf.model.Option("", "Piura"), new com.sun.webui.jsf.model.Option("", "Puno"), new com.sun.webui.jsf.model.Option("", "San Martin"), new com.sun.webui.jsf.model.Option("", "Tacna"), new com.sun.webui.jsf.model.Option("", "Tumbes"), new com.sun.webui.jsf.model.Option("", "Ucayali")});
        regionDestino1DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "Amazonas"), new com.sun.webui.jsf.model.Option("", "Ancash"), new com.sun.webui.jsf.model.Option("", "Apurimac"),new com.sun.webui.jsf.model.Option("", "Arequipa"), new com.sun.webui.jsf.model.Option("", "Ayacucho"), new com.sun.webui.jsf.model.Option("", "Cajamarca"), new com.sun.webui.jsf.model.Option("", "Callao"), new com.sun.webui.jsf.model.Option("", "Cusco"), new com.sun.webui.jsf.model.Option("", "Huancavelica"), new com.sun.webui.jsf.model.Option("", "Huanuco"), new com.sun.webui.jsf.model.Option("", "Ica"), new com.sun.webui.jsf.model.Option("", "Junin"), new com.sun.webui.jsf.model.Option("", "La Libertad"), new com.sun.webui.jsf.model.Option("", "Lambayeque"), new com.sun.webui.jsf.model.Option("", "Lima"), new com.sun.webui.jsf.model.Option("", "Loreto"), new com.sun.webui.jsf.model.Option("", "Madre de Dios"), new com.sun.webui.jsf.model.Option("", "Moquegua"), new com.sun.webui.jsf.model.Option("", "Pasco"), new com.sun.webui.jsf.model.Option("", "Piura"), new com.sun.webui.jsf.model.Option("", "Puno"), new com.sun.webui.jsf.model.Option("", "San Martin"), new com.sun.webui.jsf.model.Option("", "Tacna"), new com.sun.webui.jsf.model.Option("", "Tumbes"), new com.sun.webui.jsf.model.Option("", "Ucayali")});
        regionOrigen2DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "Origen 1 - Destino 1"), new com.sun.webui.jsf.model.Option("", "Origen 2 - Destino 2"), new com.sun.webui.jsf.model.Option("", "Origen 3 - Destino 3")});
        
        com.sun.webui.jsf.model.Option[] horas=new com.sun.webui.jsf.model.Option[24];        
        for(int h=0;h<24;h++){            
            horas[h]=new com.sun.webui.jsf.model.Option("",""+h);
        }
        horaDefaultOptions.setOptions(horas);
        
        com.sun.webui.jsf.model.Option[] minutos=new com.sun.webui.jsf.model.Option[6];
        int min=0;
        for(int i=0;i<6;i++){             
            minutos[i]=new com.sun.webui.jsf.model.Option("",""+min);
            min+=10;
        }
        minutosDefaultOptions.setOptions(minutos);
        
    }
    private SingleSelectOptionsList regionOrigen1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRegionOrigen1DefaultOptions() {
        return regionOrigen1DefaultOptions;
    }

    public void setRegionOrigen1DefaultOptions(SingleSelectOptionsList ssol) {
        this.regionOrigen1DefaultOptions = ssol;
    }
    private SingleSelectOptionsList regionDestino1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRegionDestino1DefaultOptions() {
        return regionDestino1DefaultOptions;
    }

    public void setRegionDestino1DefaultOptions(SingleSelectOptionsList ssol) {
        this.regionDestino1DefaultOptions = ssol;
    }
    private SingleSelectOptionsList regionOrigen2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRegionOrigen2DefaultOptions() {
        return regionOrigen2DefaultOptions;
    }

    public void setRegionOrigen2DefaultOptions(SingleSelectOptionsList ssol) {
        this.regionOrigen2DefaultOptions = ssol;
    }
    private SingleSelectOptionsList rutaNuevaSalidaDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRutaNuevaSalidaDefaultOptions() {
        return rutaNuevaSalidaDefaultOptions;
    }

    public void setRutaNuevaSalidaDefaultOptions(SingleSelectOptionsList ssol) {
        this.rutaNuevaSalidaDefaultOptions = ssol;
    }
    private SingleSelectOptionsList busNuevaSalidaDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getBusNuevaSalidaDefaultOptions() {
        return busNuevaSalidaDefaultOptions;
    }

    public void setBusNuevaSalidaDefaultOptions(SingleSelectOptionsList ssol) {
        this.busNuevaSalidaDefaultOptions = ssol;
    }
    private SingleSelectOptionsList chofer2NuevaSalidaDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getChofer2NuevaSalidaDefaultOptions() {
        return chofer2NuevaSalidaDefaultOptions;
    }

    public void setChofer2NuevaSalidaDefaultOptions(SingleSelectOptionsList ssol) {
        this.chofer2NuevaSalidaDefaultOptions = ssol;
    }
    private SingleSelectOptionsList chofer1NuevaSalidaDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getChofer1NuevaSalidaDefaultOptions() {
        return chofer1NuevaSalidaDefaultOptions;
    }

    public void setChofer1NuevaSalidaDefaultOptions(SingleSelectOptionsList ssol) {
        this.chofer1NuevaSalidaDefaultOptions = ssol;
    }
    private SingleSelectOptionsList horaDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getHoraDefaultOptions() {
        return horaDefaultOptions;
    }

    public void setHoraDefaultOptions(SingleSelectOptionsList ssol) {
        this.horaDefaultOptions = ssol;
    }
    private SingleSelectOptionsList minutosDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getMinutosDefaultOptions() {
        return minutosDefaultOptions;
    }

    public void setMinutosDefaultOptions(SingleSelectOptionsList ssol) {
        this.minutosDefaultOptions = ssol;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public gestionarRutas() {
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
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("gestionarRutas Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
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

    public void regionOrigen_processValueChange(ValueChangeEvent event) {
    }

    public void dropDown1_processValueChange(ValueChangeEvent event) {
    }

    public String agregarRuta_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String eliminarRuta_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String agregarNuevaSalida_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String home_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case1";
    }

    public String regresar_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case2";
    }
    
}

