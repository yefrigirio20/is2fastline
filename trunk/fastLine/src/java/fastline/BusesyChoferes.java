/*
 * BusesyChoferes.java
 *
 * Created on 16-nov-2008, 18:55:12
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.util.ResourceBundle;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author Huachani
 */
public class BusesyChoferes extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        diaDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "1"), new com.sun.webui.jsf.model.Option("", "2"), new com.sun.webui.jsf.model.Option("", "3"), new com.sun.webui.jsf.model.Option("", "4"), new com.sun.webui.jsf.model.Option("", "5"), new com.sun.webui.jsf.model.Option("", "6"), new com.sun.webui.jsf.model.Option("", "7"), new com.sun.webui.jsf.model.Option("", "8"), new com.sun.webui.jsf.model.Option("", "9"), new com.sun.webui.jsf.model.Option("", "10"), new com.sun.webui.jsf.model.Option("", "11"), new com.sun.webui.jsf.model.Option("", "12"), new com.sun.webui.jsf.model.Option("", "13"), new com.sun.webui.jsf.model.Option("", "14"), new com.sun.webui.jsf.model.Option("", "15"), new com.sun.webui.jsf.model.Option("", "16"), new com.sun.webui.jsf.model.Option("", "17"), new com.sun.webui.jsf.model.Option("", "18"), new com.sun.webui.jsf.model.Option("", "19"), new com.sun.webui.jsf.model.Option("", "20"), new com.sun.webui.jsf.model.Option("", "21"), new com.sun.webui.jsf.model.Option("", "22"), new com.sun.webui.jsf.model.Option("", "23"), new com.sun.webui.jsf.model.Option("", "24"), new com.sun.webui.jsf.model.Option("", "25"), new com.sun.webui.jsf.model.Option("", "26"), new com.sun.webui.jsf.model.Option("", "27"), new com.sun.webui.jsf.model.Option("", "28"), new com.sun.webui.jsf.model.Option("", "29"), new com.sun.webui.jsf.model.Option("", "30"), new com.sun.webui.jsf.model.Option("", "31")});
        mesDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("item1", "Enero"), new com.sun.webui.jsf.model.Option("item2", "Febrero"), new com.sun.webui.jsf.model.Option("item3", "Marzo"), new com.sun.webui.jsf.model.Option("value", "Abril"), new com.sun.webui.jsf.model.Option("value", "Mayo"), new com.sun.webui.jsf.model.Option("value", "Junio"), new com.sun.webui.jsf.model.Option("value", "Julio"), new com.sun.webui.jsf.model.Option("value", "Agosto"), new com.sun.webui.jsf.model.Option("value", "Septiembre"), new com.sun.webui.jsf.model.Option("value", "Octubre"), new com.sun.webui.jsf.model.Option("value", "Noviembre"), new com.sun.webui.jsf.model.Option("value", "Diciembre")});
               
       com.sun.webui.jsf.model.Option[] años=new com.sun.webui.jsf.model.Option[50];
        int b;
        for(int a=0;a<50;a++){
            b=a+1950;
            años[a]=new com.sun.webui.jsf.model.Option("",""+b);
        }
        añoDefaultOptions.setOptions(años);
        
        //añoDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "dos")});
    }
    private SingleSelectOptionsList dropDown1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown1DefaultOptions() {
        return dropDown1DefaultOptions;
    }

    public void setDropDown1DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown1DefaultOptions = ssol;
    }
    private SingleSelectOptionsList diaDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDiaDefaultOptions() {
        return diaDefaultOptions;
    }

    public void setDiaDefaultOptions(SingleSelectOptionsList ssol) {
        this.diaDefaultOptions = ssol;
    }
    private SingleSelectOptionsList mesDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getMesDefaultOptions() {
        return mesDefaultOptions;
    }

    public void setMesDefaultOptions(SingleSelectOptionsList ssol) {
        this.mesDefaultOptions = ssol;
    }
    private SingleSelectOptionsList añoDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getAñoDefaultOptions() {
        return añoDefaultOptions;
    }

    public void setAñoDefaultOptions(SingleSelectOptionsList ssol) {
        this.añoDefaultOptions = ssol;
    }
    private TextField matricula = new TextField();

    public TextField getMatricula() {
        return matricula;
    }

    public void setMatricula(TextField tf) {
        this.matricula = tf;
    }
    private TextField capacidad = new TextField();

    public TextField getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(TextField tf) {
        this.capacidad = tf;
    }
    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }
    private IntegerConverter integerConverter2 = new IntegerConverter();

    public IntegerConverter getIntegerConverter2() {
        return integerConverter2;
    }

    public void setIntegerConverter2(IntegerConverter ic) {
        this.integerConverter2 = ic;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public BusesyChoferes() {
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
            log("BusesyChoferes Initialization Failure", e);
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public void dia_processValueChange(ValueChangeEvent event) {
    }

    public void dropDown3_processValueChange(ValueChangeEvent event) {
    }

    public String agregarBus_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String eliminarBus_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String agregarChofer_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String home1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case1";
    }

    public String regresar1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case2";
    }

    public void apellPaterno_processValueChange(ValueChangeEvent vce) {
    }

    public void DNI_validate(FacesContext context, UIComponent component, Object value) {
        String strValue = String.valueOf(value);
        if (!strValue.matches("\\d{8}")) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(
                             "errores.erroresBundle",
                             context.getViewRoot().getLocale());
        String strTextoError = resourceBundle.getString("error_DNI");
        throw new ValidatorException(new FacesMessage(strTextoError));
  }
    }

    public void capacidad_validate(FacesContext context, UIComponent component, Object value) {
        String strValue = String.valueOf(value);
        if (!strValue.matches("\\d{3}")) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(
                             "errores.erroresBundle",
                             context.getViewRoot().getLocale());
        String strTextoError = resourceBundle.getString("error_Capacidad");
        throw new ValidatorException(new FacesMessage(strTextoError));
  }

    }

    public void matricula_validate(FacesContext context, UIComponent component, Object value) {
        String strValue = String.valueOf(value);
        if (!strValue.matches("\\w{2}-{1}\\d{4}")) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(
                             "errores.erroresBundle",
                             context.getViewRoot().getLocale());
        String strTextoError = resourceBundle.getString("error_Capacidad");
        throw new ValidatorException(new FacesMessage(strTextoError));
  }

    }
    
}

