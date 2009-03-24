/*
 * BusesyChoferes.java
 *
 * Created on 16-nov-2008, 18:55:12
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Message;
import com.sun.webui.jsf.component.StaticText;
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
        poblarComboBuses();
        //diaDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "1"), new com.sun.webui.jsf.model.Option("", "2"), new com.sun.webui.jsf.model.Option("", "3"), new com.sun.webui.jsf.model.Option("", "4"), new com.sun.webui.jsf.model.Option("", "5"), new com.sun.webui.jsf.model.Option("", "6"), new com.sun.webui.jsf.model.Option("", "7"), new com.sun.webui.jsf.model.Option("", "8"), new com.sun.webui.jsf.model.Option("", "9"), new com.sun.webui.jsf.model.Option("", "10"), new com.sun.webui.jsf.model.Option("", "11"), new com.sun.webui.jsf.model.Option("", "12"), new com.sun.webui.jsf.model.Option("", "13"), new com.sun.webui.jsf.model.Option("", "14"), new com.sun.webui.jsf.model.Option("", "15"), new com.sun.webui.jsf.model.Option("", "16"), new com.sun.webui.jsf.model.Option("", "17"), new com.sun.webui.jsf.model.Option("", "18"), new com.sun.webui.jsf.model.Option("", "19"), new com.sun.webui.jsf.model.Option("", "20"), new com.sun.webui.jsf.model.Option("", "21"), new com.sun.webui.jsf.model.Option("", "22"), new com.sun.webui.jsf.model.Option("", "23"), new com.sun.webui.jsf.model.Option("", "24"), new com.sun.webui.jsf.model.Option("", "25"), new com.sun.webui.jsf.model.Option("", "26"), new com.sun.webui.jsf.model.Option("", "27"), new com.sun.webui.jsf.model.Option("", "28"), new com.sun.webui.jsf.model.Option("", "29"), new com.sun.webui.jsf.model.Option("", "30"), new com.sun.webui.jsf.model.Option("", "31")});
        mesDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("---", "---"),new com.sun.webui.jsf.model.Option("1", "Enero"), new com.sun.webui.jsf.model.Option("2", "Febrero"), new com.sun.webui.jsf.model.Option("3", "Marzo"), new com.sun.webui.jsf.model.Option("4", "Abril"), new com.sun.webui.jsf.model.Option("5", "Mayo"), new com.sun.webui.jsf.model.Option("6", "Junio"), new com.sun.webui.jsf.model.Option("7", "Julio"), new com.sun.webui.jsf.model.Option("8", "Agosto"), new com.sun.webui.jsf.model.Option("9", "Septiembre"), new com.sun.webui.jsf.model.Option("10", "Octubre"), new com.sun.webui.jsf.model.Option("11", "Noviembre"), new com.sun.webui.jsf.model.Option("12", "Diciembre")});
               
       this.poblarComboDias(31);
       this.poblarComboAños(1950,2000);
       nomusuario.setText("Bienvenido: "+getApplicationBean1().getNombreusuario());
        
        //añoDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "dos")});
    }
    private SingleSelectOptionsList busesDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getBusesDefaultOptions() {
        return busesDefaultOptions;
    }

    public void setBusesDefaultOptions(SingleSelectOptionsList ssol) {
        this.busesDefaultOptions = ssol;
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
    private Message message5 = new Message();

    public Message getMessage5() {
        return message5;
    }

    public void setMessage5(Message m) {
        this.message5 = m;
    }
    private Message message4 = new Message();

    public Message getMessage4() {
        return message4;
    }

    public void setMessage4(Message m) {
        this.message4 = m;
    }
    private StaticText estado = new StaticText();

    public StaticText getEstado() {
        return estado;
    }

    public void setEstado(StaticText st) {
        this.estado = st;
    }
    private DropDown buses = new DropDown();

    public DropDown getBuses() {
        return buses;
    }

    public void setBuses(DropDown dd) {
        this.buses = dd;
    }
    private StaticText errorEliminarBus = new StaticText();

    public StaticText getErrorEliminarBus() {
        return errorEliminarBus;
    }

    public void setErrorEliminarBus(StaticText st) {
        this.errorEliminarBus = st;
    }
    private DropDown dia = new DropDown();

    public DropDown getDia() {
        return dia;
    }

    public void setDia(DropDown dd) {
        this.dia = dd;
    }
    private DropDown mes = new DropDown();

    public DropDown getMes() {
        return mes;
    }

    public void setMes(DropDown dd) {
        this.mes = dd;
    }
    private DropDown año = new DropDown();

    public DropDown getAño() {
        return año;
    }

    public void setAño(DropDown dd) {
        this.año = dd;
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
    private TextField DNI = new TextField();

    public TextField getDNI() {
        return DNI;
    }

    public void setDNI(TextField tf) {
        this.DNI = tf;
    }
    private StaticText errorFecha = new StaticText();

    public StaticText getErrorFecha() {
        return errorFecha;
    }

    public void setErrorFecha(StaticText st) {
        this.errorFecha = st;
    }
    private StaticText nomusuario = new StaticText();

    public StaticText getNomusuario() {
        return nomusuario;
    }

    public void setNomusuario(StaticText st) {
        this.nomusuario = st;
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
        estado.setVisible(false);
        String mat="";
        if(matricula.getText()!=null){
            mat=matricula.getText().toString();
            try {
                int cap=Integer.parseInt(capacidad.getText().toString());
                getApplicationBean1().getCon().insertarNuevoBus(mat, cap);
                estado.setText(getApplicationBean1().getCon().Estado);
                estado.setVisible(true);
                poblarComboBuses();
            } catch (Exception e) {
            }

        }
        return null;
    }

    public String eliminarBus_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        errorEliminarBus.setVisible(false);
        String mat=buses.getValue().toString();
        if(mat.length()>3){
            getApplicationBean1().getCon().eliminarBus(mat);
            poblarComboBuses();
        }
        else{
            errorEliminarBus.setText("Debe seleccionar el bus a eliminar");
            errorEliminarBus.setVisible(true);
        }
        return null;
    }

    public String agregarChofer_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        String diaNacUsu=dia.getValue().toString();
        String mesNacUsu=mes.getValue().toString();
        String añoNacUsu=año.getValue().toString();
        String fecNacUsu=mesNacUsu+"/"+diaNacUsu+"/"+añoNacUsu;
        errorFecha.setVisible(false);
        if(diaNacUsu.length()>2||mesNacUsu.length()>2||añoNacUsu.length()>4){
            errorFecha.setText("Debe especificar una fecha completa");
            errorFecha.setVisible(true);
        }
        else
            getApplicationBean1().getCon().insertarNuevoChofer(apellPaterno.getText().toString(),apellMaterno.getText().toString(),nombres.getText().toString(),fecNacUsu,DNI.getText().toString());
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
        if (!strValue.matches("\\d{2}")) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(
                             "errores.erroresBundle",
                             context.getViewRoot().getLocale());
        String strTextoError = resourceBundle.getString("error_Capacidad");
        throw new ValidatorException(new FacesMessage(strTextoError));
  }

    }

    public void matricula_validate(FacesContext context, UIComponent component, Object value) {
        String strValue = String.valueOf(value);
        if (!strValue.matches("\\w{2}{1}\\d{4}")) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(
                             "errores.erroresBundle",
                             context.getViewRoot().getLocale());
        String strTextoError = resourceBundle.getString("error_Capacidad");
        throw new ValidatorException(new FacesMessage(strTextoError));
  }

    }
private void poblarComboBuses(){
        com.sun.webui.jsf.model.Option[] buses;
        //Conector Con=new Conector();
        //Con.IniciarConexion();
        try{
            int numbuses=getApplicationBean1().getCon().obtenerBuses();
            if(numbuses>0){
                buses=new com.sun.webui.jsf.model.Option[numbuses+1];
                String matBus;
                int Capacidad;
                buses[0]=new com.sun.webui.jsf.model.Option("---","Seleccione el bus");
                int b=1;
                while(getApplicationBean1().getCon().getResultSet().next()){
                    matBus=getApplicationBean1().getCon().getResultSet().getString("matbus");
                    Capacidad=getApplicationBean1().getCon().getResultSet().getInt("capbus");
                    buses[b]=new com.sun.webui.jsf.model.Option(matBus,matBus+" Capacidad:"+Capacidad);
                    b++;
                }
            }
            else{
                buses=new com.sun.webui.jsf.model.Option[1];
                buses[0]=new com.sun.webui.jsf.model.Option("---","No hay buses en la base de datos");
            }
        }
        catch(Exception e){
            buses=new com.sun.webui.jsf.model.Option[1];
            buses[0]=new com.sun.webui.jsf.model.Option("---","Ocurrio un error con la base de datos");
        }
        //Con.CerrarConexion();
        busesDefaultOptions.setOptions(buses);
    }

    public void matricula_processValueChange(ValueChangeEvent event) {
    }
    public void poblarComboAños(int inicio,int fin){

        com.sun.webui.jsf.model.Option[] años=new com.sun.webui.jsf.model.Option[fin-inicio+2];
        int i=1;
        años[0]=new com.sun.webui.jsf.model.Option("-----","-----");
        for(int a=inicio;a<=fin;a++){
            años[i]=new com.sun.webui.jsf.model.Option(""+a,""+a);
            i++;
        }
        añoDefaultOptions.setOptions(años);
    }
    public void poblarComboDias(int numDias){

        com.sun.webui.jsf.model.Option[] dias=new com.sun.webui.jsf.model.Option[numDias+1];
        dias[0]=new com.sun.webui.jsf.model.Option("---","---");
        for(int d=1;d<=numDias;d++){
            dias[d]=new com.sun.webui.jsf.model.Option(""+d,""+d);

        }
        diaDefaultOptions.setOptions(dias);
    }

    public void mes_processValueChange(ValueChangeEvent event) {
        int nromes=Integer.parseInt(mes.getValue().toString());
        if(nromes==1||nromes==3||nromes==5||nromes==7||nromes==8||nromes==9||nromes==10)
            poblarComboDias(31);
        else if(nromes==2)
            poblarComboDias(28);
        else if(nromes==0)
            diaDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("---", "---")});
        else
            poblarComboDias(30);
    }

    public String cerrarsesion_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        getApplicationBean1().getCon().CerrarConexion();
        getApplicationBean1().setSesion(false);
        return "case3";
    }
}

