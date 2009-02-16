/*
 * registrarNuevoUsuario.java
 *
 * Created on 12-nov-2008, 20:27:08
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import conexionJDBC.Conector;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
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
public class registrarNuevoUsuario extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        //diaDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "1"), new com.sun.webui.jsf.model.Option("", "2"), new com.sun.webui.jsf.model.Option("", "3"), new com.sun.webui.jsf.model.Option("", "4"), new com.sun.webui.jsf.model.Option("", "5"), new com.sun.webui.jsf.model.Option("", "6"), new com.sun.webui.jsf.model.Option("", "7"), new com.sun.webui.jsf.model.Option("", "8"), new com.sun.webui.jsf.model.Option("", "9"), new com.sun.webui.jsf.model.Option("", "10"), new com.sun.webui.jsf.model.Option("", "11"), new com.sun.webui.jsf.model.Option("", "12"), new com.sun.webui.jsf.model.Option("", "13"), new com.sun.webui.jsf.model.Option("", "14"), new com.sun.webui.jsf.model.Option("", "15"), new com.sun.webui.jsf.model.Option("", "16"), new com.sun.webui.jsf.model.Option("", "17"), new com.sun.webui.jsf.model.Option("", "18"), new com.sun.webui.jsf.model.Option("", "19"), new com.sun.webui.jsf.model.Option("", "20"), new com.sun.webui.jsf.model.Option("", "21"), new com.sun.webui.jsf.model.Option("", "22"), new com.sun.webui.jsf.model.Option("", "23"), new com.sun.webui.jsf.model.Option("", "24"), new com.sun.webui.jsf.model.Option("", "25"), new com.sun.webui.jsf.model.Option("", "26"), new com.sun.webui.jsf.model.Option("", "27"), new com.sun.webui.jsf.model.Option("", "28"), new com.sun.webui.jsf.model.Option("", "29"), new com.sun.webui.jsf.model.Option("", "30"), new com.sun.webui.jsf.model.Option("", "31")});
        mesDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("1", "Enero"), new com.sun.webui.jsf.model.Option("2", "Febrero"), new com.sun.webui.jsf.model.Option("3", "Marzo"), new com.sun.webui.jsf.model.Option("4", "Abril"), new com.sun.webui.jsf.model.Option("5", "Mayo"), new com.sun.webui.jsf.model.Option("6", "Junio"), new com.sun.webui.jsf.model.Option("7", "Julio"), new com.sun.webui.jsf.model.Option("8", "Agosto"), new com.sun.webui.jsf.model.Option("9", "Septiembre"), new com.sun.webui.jsf.model.Option("10", "Octubre"), new com.sun.webui.jsf.model.Option("11", "Noviembre"), new com.sun.webui.jsf.model.Option("12", "Diciembre")});
        //añoDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("item1", "1981"), new com.sun.webui.jsf.model.Option("item2", "1982"), new com.sun.webui.jsf.model.Option("item3", "1983"), new com.sun.webui.jsf.model.Option("value", "1984"), new com.sun.webui.jsf.model.Option("value", "1985"), new com.sun.webui.jsf.model.Option("value", "1986"), new com.sun.webui.jsf.model.Option("value", "1987"), new com.sun.webui.jsf.model.Option("value", "1988"), new com.sun.webui.jsf.model.Option("value", "1989"), new com.sun.webui.jsf.model.Option("value", "1990"), new com.sun.webui.jsf.model.Option("value", "1991"), new com.sun.webui.jsf.model.Option("value", "1992"), new com.sun.webui.jsf.model.Option("value", "1993"), new com.sun.webui.jsf.model.Option("value", "1994"), new com.sun.webui.jsf.model.Option("value", "1995"), new com.sun.webui.jsf.model.Option("value", "1996"), new com.sun.webui.jsf.model.Option("value", "1997"), new com.sun.webui.jsf.model.Option("value", "1998"), new com.sun.webui.jsf.model.Option("value", "1999"), new com.sun.webui.jsf.model.Option("value", "2000"), new com.sun.webui.jsf.model.Option("value", "2001"), new com.sun.webui.jsf.model.Option("value", "2002"), new com.sun.webui.jsf.model.Option("value", "2003"), new com.sun.webui.jsf.model.Option("value", "2004"), new com.sun.webui.jsf.model.Option("value", "2005")});

        this.poblarComboDias(30);
        this.poblarComboAños(1950,2000);

    }
    private SingleSelectOptionsList diaDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDiaDefaultOptions() {
        return diaDefaultOptions;
    }

    public void poblarComboAños(int inicio,int fin){

        com.sun.webui.jsf.model.Option[] años=new com.sun.webui.jsf.model.Option[fin-inicio+1];
        int i=0;
        for(int a=inicio;a<=fin;a++){
            años[i]=new com.sun.webui.jsf.model.Option(""+a,""+a);
            i++;
        }
        añoDefaultOptions.setOptions(años);
    }
    public void poblarComboDias(int numDias){

        com.sun.webui.jsf.model.Option[] dias=new com.sun.webui.jsf.model.Option[numDias];

        for(int d=0;d<numDias;d++){
            dias[d]=new com.sun.webui.jsf.model.Option(""+(d+1),""+(d+1));

        }
        diaDefaultOptions.setOptions(dias);
    }

    public void setDiaDefaultOptions(SingleSelectOptionsList ssol) {
        this.diaDefaultOptions = ssol;
    }
    private SingleSelectOptionsList añoDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getAñoDefaultOptions() {
        return añoDefaultOptions;
    }

    public void setAñoDefaultOptions(SingleSelectOptionsList ssol) {
        this.añoDefaultOptions = ssol;
    }
    private SingleSelectOptionsList mesDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getMesDefaultOptions() {
        return mesDefaultOptions;
    }

    public void setMesDefaultOptions(SingleSelectOptionsList ssol) {
        this.mesDefaultOptions = ssol;
    }
    private TextField apellPaterno = new TextField();

    public TextField getApellPaterno() {
        return apellPaterno;
    }

    public void setApellPaterno(TextField tf) {
        this.apellPaterno = tf;
    }
    private TextField apellMaterno = new TextField();

    public TextField getApellMaterno() {
        return apellMaterno;
    }

    public void setApellMaterno(TextField tf) {
        this.apellMaterno = tf;
    }
    private TextField nombres = new TextField();

    public TextField getNombres() {
        return nombres;
    }

    public void setNombres(TextField tf) {
        this.nombres = tf;
    }
    private DropDown mes = new DropDown();

    public DropDown getMes() {
        return mes;
    }

    public void setMes(DropDown dd) {
        this.mes = dd;
    }
    private DropDown dia = new DropDown();

    public DropDown getDia() {
        return dia;
    }

    public void setDia(DropDown dd) {
        this.dia = dd;
    }
    private DropDown año = new DropDown();

    public DropDown getAño() {
        return año;
    }

    public void setAño(DropDown dd) {
        this.año = dd;
    }
    private TextField DNI = new TextField();

    public TextField getDNI() {
        return DNI;
    }

    public void setDNI(TextField tf) {
        this.DNI = tf;
    }
    private TextField email = new TextField();

    public TextField getEmail() {
        return email;
    }

    public void setEmail(TextField tf) {
        this.email = tf;
    }
    private TextField userName = new TextField();

    public TextField getUserName() {
        return userName;
    }

    public void setUserName(TextField tf) {
        this.userName = tf;
    }
    private TextField pass = new TextField();

    public TextField getPass() {
        return pass;
    }

    public void setPass(TextField tf) {
        this.pass = tf;
    }
    private TextField confirmPass = new TextField();

    public TextField getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(TextField tf) {
        this.confirmPass = tf;
    }
    private TextField prueba = new TextField();

    public TextField getPrueba() {
        return prueba;
    }

    public void setPrueba(TextField tf) {
        this.prueba = tf;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public registrarNuevoUsuario() {
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
            log("registrarNuevoUsuario Initialization Failure", e);
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

    public void dropDown2_processValueChange(ValueChangeEvent event) {
    }

    public void dropDown3_processValueChange(ValueChangeEvent event) {
    }

    public String verificarUserName_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String crearCuenta_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        String apelPatUsu=apellPaterno.getText().toString();
        String apelMatUsu=apellMaterno.getText().toString();
        String dniUsu=DNI.getText().toString();
        String nombresUsu=nombres.getText().toString();
        String emailUsu=email.getText().toString();
        String idNomUsu=userName.getText().toString();
        String passUsu=pass.getText().toString();
        String diaNacUsu=dia.getValue().toString();
        String mesNacUsu=mes.getValue().toString();
        String añoNacUsu=año.getValue().toString();
        String fecNacUsu=mesNacUsu+"/"+diaNacUsu+"/"+añoNacUsu;
        Conector Con=new Conector();
        Con.IniciarConexion();
        email.setText("punto1");
        Con.insertarNuevoUsuario(idNomUsu, passUsu, apelPatUsu, apelMatUsu, nombresUsu, fecNacUsu, dniUsu, emailUsu);
        email.setText(fecNacUsu);

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

    public void mes_processValueChange(ValueChangeEvent event) {
        int nromes=Integer.parseInt(mes.getValue().toString());
        if(nromes==1||nromes==3||nromes==5||nromes==7||nromes==8||nromes==9||nromes==10)
            poblarComboDias(31);
        else if(nromes==2)
            poblarComboDias(28);
        else
            poblarComboDias(30);       

    }

    
    
}

