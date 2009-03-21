/*
 * Encomiendas.java
 *
 * Created on 16-nov-2008, 20:36:12
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.sql.ResultSet;
import java.text.DateFormat;
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
public class Encomiendas extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        depOrigenDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("0", "-----"),new com.sun.webui.jsf.model.Option("8", "Amazonas"), new com.sun.webui.jsf.model.Option("24", "Ancash"), new com.sun.webui.jsf.model.Option("15", "Apurimac"),new com.sun.webui.jsf.model.Option("16", "Arequipa"), new com.sun.webui.jsf.model.Option("23", "Ayacucho"), new com.sun.webui.jsf.model.Option("6", "Cajamarca"), new com.sun.webui.jsf.model.Option("17", "Cusco"), new com.sun.webui.jsf.model.Option("22", "Huancavelica"), new com.sun.webui.jsf.model.Option("25", "Huanuco"), new com.sun.webui.jsf.model.Option("14", "Ica"), new com.sun.webui.jsf.model.Option("7", "Iquitos"), new com.sun.webui.jsf.model.Option("12", "Junin"), new com.sun.webui.jsf.model.Option("10", "La Libertad"), new com.sun.webui.jsf.model.Option("5", "Lambayeque"), new com.sun.webui.jsf.model.Option("13", "Lima"), new com.sun.webui.jsf.model.Option("1", "Madre de Dios"), new com.sun.webui.jsf.model.Option("18", "Moquegua"), new com.sun.webui.jsf.model.Option("11", "Pasco"), new com.sun.webui.jsf.model.Option("4", "Piura"), new com.sun.webui.jsf.model.Option("20", "Puno"), new com.sun.webui.jsf.model.Option("9", "San Martin"), new com.sun.webui.jsf.model.Option("19", "Tacna"), new com.sun.webui.jsf.model.Option("3", "Tumbes"), new com.sun.webui.jsf.model.Option("21", "Ucayali")});
        depDestinoDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("0", "-----"),new com.sun.webui.jsf.model.Option("8", "Amazonas"), new com.sun.webui.jsf.model.Option("24", "Ancash"), new com.sun.webui.jsf.model.Option("15", "Apurimac"),new com.sun.webui.jsf.model.Option("16", "Arequipa"), new com.sun.webui.jsf.model.Option("23", "Ayacucho"), new com.sun.webui.jsf.model.Option("6", "Cajamarca"), new com.sun.webui.jsf.model.Option("17", "Cusco"), new com.sun.webui.jsf.model.Option("22", "Huancavelica"), new com.sun.webui.jsf.model.Option("25", "Huanuco"), new com.sun.webui.jsf.model.Option("14", "Ica"), new com.sun.webui.jsf.model.Option("7", "Iquitos"), new com.sun.webui.jsf.model.Option("12", "Junin"), new com.sun.webui.jsf.model.Option("10", "La Libertad"), new com.sun.webui.jsf.model.Option("5", "Lambayeque"), new com.sun.webui.jsf.model.Option("13", "Lima"), new com.sun.webui.jsf.model.Option("1", "Madre de Dios"), new com.sun.webui.jsf.model.Option("18", "Moquegua"), new com.sun.webui.jsf.model.Option("11", "Pasco"), new com.sun.webui.jsf.model.Option("4", "Piura"), new com.sun.webui.jsf.model.Option("20", "Puno"), new com.sun.webui.jsf.model.Option("9", "San Martin"), new com.sun.webui.jsf.model.Option("19", "Tacna"), new com.sun.webui.jsf.model.Option("3", "Tumbes"), new com.sun.webui.jsf.model.Option("21", "Ucayali")});
        horariosDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("-----", "Consulte los horarios primero")});
        categoriaEncDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("-", "--Seleccione--"), new com.sun.webui.jsf.model.Option("s", "Sobre"), new com.sun.webui.jsf.model.Option("p", "Paquete")});
        dropDown2DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "Esperando Embarque"), new com.sun.webui.jsf.model.Option("", "Embarcado"), new com.sun.webui.jsf.model.Option("", "Esperando Entrega"), new com.sun.webui.jsf.model.Option("", "Entregado")});
        opcPagoDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("--", "Seleccione una opcion de pago"), new com.sun.webui.jsf.model.Option("1", "Paga quien envía"), new com.sun.webui.jsf.model.Option("2", "Ambos pagan una parte"),new com.sun.webui.jsf.model.Option("3", "Paga quien recibe")});
        
    }
    private SingleSelectOptionsList depOrigenDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDepOrigenDefaultOptions() {
        return depOrigenDefaultOptions;
    }

    public void setDepOrigenDefaultOptions(SingleSelectOptionsList ssol) {
        this.depOrigenDefaultOptions = ssol;
    }
    private SingleSelectOptionsList depDestinoDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDepDestinoDefaultOptions() {
        return depDestinoDefaultOptions;
    }

    public void setDepDestinoDefaultOptions(SingleSelectOptionsList ssol) {
        this.depDestinoDefaultOptions = ssol;
    }
    private SingleSelectOptionsList categoriaEncDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getCategoriaEncDefaultOptions() {
        return categoriaEncDefaultOptions;
    }

    public void setCategoriaEncDefaultOptions(SingleSelectOptionsList ssol) {
        this.categoriaEncDefaultOptions = ssol;
    }
    private SingleSelectOptionsList horariosDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getHorariosDefaultOptions() {
        return horariosDefaultOptions;
    }

    public void setHorariosDefaultOptions(SingleSelectOptionsList ssol) {
        this.horariosDefaultOptions = ssol;
    }
    private SingleSelectOptionsList dropDown2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown2DefaultOptions() {
        return dropDown2DefaultOptions;
    }

    public void setDropDown2DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown2DefaultOptions = ssol;
    }
    private DropDown depOrigen = new DropDown();

    public DropDown getDepOrigen() {
        return depOrigen;
    }

    public void setDepOrigen(DropDown dd) {
        this.depOrigen = dd;
    }
    private DropDown depDestino = new DropDown();

    public DropDown getDepDestino() {
        return depDestino;
    }

    public void setDepDestino(DropDown dd) {
        this.depDestino = dd;
    }
    private Calendar startCalendar = new Calendar();

    public Calendar getStartCalendar() {
        return startCalendar;
    }

    public void setStartCalendar(Calendar c) {
        this.startCalendar = c;
    }
    private StaticText errorRuta = new StaticText();

    public StaticText getErrorRuta() {
        return errorRuta;
    }

    public void setErrorRuta(StaticText st) {
        this.errorRuta = st;
    }
    private StaticText errorFecha = new StaticText();

    public StaticText getErrorFecha() {
        return errorFecha;
    }

    public void setErrorFecha(StaticText st) {
        this.errorFecha = st;
    }
    private TextField apellPaterno1 = new TextField();

    public TextField getApellPaterno1() {
        return apellPaterno1;
    }

    public void setApellPaterno1(TextField tf) {
        this.apellPaterno1 = tf;
    }
    private TextField apellMaterno1 = new TextField();

    public TextField getApellMaterno1() {
        return apellMaterno1;
    }

    public void setApellMaterno1(TextField tf) {
        this.apellMaterno1 = tf;
    }
    private TextField nombres1 = new TextField();

    public TextField getNombres1() {
        return nombres1;
    }

    public void setNombres1(TextField tf) {
        this.nombres1 = tf;
    }
    private TextField DNI1 = new TextField();

    public TextField getDNI1() {
        return DNI1;
    }

    public void setDNI1(TextField tf) {
        this.DNI1 = tf;
    }
    private TextField apellPaterno2 = new TextField();

    public TextField getApellPaterno2() {
        return apellPaterno2;
    }

    public void setApellPaterno2(TextField tf) {
        this.apellPaterno2 = tf;
    }
    private TextField apellMaterno2 = new TextField();

    public TextField getApellMaterno2() {
        return apellMaterno2;
    }

    public void setApellMaterno2(TextField tf) {
        this.apellMaterno2 = tf;
    }
    private TextField nombres2 = new TextField();

    public TextField getNombres2() {
        return nombres2;
    }

    public void setNombres2(TextField tf) {
        this.nombres2 = tf;
    }
    private TextField DNI2 = new TextField();

    public TextField getDNI2() {
        return DNI2;
    }

    public void setDNI2(TextField tf) {
        this.DNI2 = tf;
    }
    private SingleSelectOptionsList opcPagoDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getOpcPagoDefaultOptions() {
        return opcPagoDefaultOptions;
    }

    public void setOpcPagoDefaultOptions(SingleSelectOptionsList ssol) {
        this.opcPagoDefaultOptions = ssol;
    }
    private DropDown categoriaEnc = new DropDown();

    public DropDown getCategoriaEnc() {
        return categoriaEnc;
    }

    public void setCategoriaEnc(DropDown dd) {
        this.categoriaEnc = dd;
    }
    private TextField peso = new TextField();

    public TextField getPeso() {
        return peso;
    }

    public void setPeso(TextField tf) {
        this.peso = tf;
    }
    private DropDown horarios = new DropDown();

    public DropDown getHorarios() {
        return horarios;
    }

    public void setHorarios(DropDown dd) {
        this.horarios = dd;
    }
    private StaticText errorCategoria = new StaticText();

    public StaticText getErrorCategoria() {
        return errorCategoria;
    }

    public void setErrorCategoria(StaticText st) {
        this.errorCategoria = st;
    }
    private StaticText errorPeso = new StaticText();

    public StaticText getErrorPeso() {
        return errorPeso;
    }

    public void setErrorPeso(StaticText st) {
        this.errorPeso = st;
    }
    private StaticText errorHorario = new StaticText();

    public StaticText getErrorHorario() {
        return errorHorario;
    }

    public void setErrorHorario(StaticText st) {
        this.errorHorario = st;
    }
    private StaticText errorMontoCanc = new StaticText();

    public StaticText getErrorMontoCanc() {
        return errorMontoCanc;
    }

    public void setErrorMontoCanc(StaticText st) {
        this.errorMontoCanc = st;
    }
    private StaticText errorOpcPago = new StaticText();

    public StaticText getErrorOpcPago() {
        return errorOpcPago;
    }

    public void setErrorOpcPago(StaticText st) {
        this.errorOpcPago = st;
    }
    private StaticText errorNombres = new StaticText();

    public StaticText getErrorNombres() {
        return errorNombres;
    }

    public void setErrorNombres(StaticText st) {
        this.errorNombres = st;
    }
    private DropDown opcPago = new DropDown();

    public DropDown getOpcPago() {
        return opcPago;
    }

    public void setOpcPago(DropDown dd) {
        this.opcPago = dd;
    }
    private TextField montoCancelado = new TextField();

    public TextField getMontoCancelado() {
        return montoCancelado;
    }

    public void setMontoCancelado(TextField tf) {
        this.montoCancelado = tf;
    }
    private StaticText encID = new StaticText();

    public StaticText getEncID() {
        return encID;
    }

    public void setEncID(StaticText st) {
        this.encID = st;
    }
    private TextField montoTotal = new TextField();

    public TextField getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(TextField tf) {
        this.montoTotal = tf;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Encomiendas() {
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
            log("Encomiendas Initialization Failure", e);
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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
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
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public void dropDown2_processValueChange(ValueChangeEvent event) {
    }

    public void dropDown3_processValueChange(ValueChangeEvent event) {
    }

    public String registrarEncomienda_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
       int idSal;
       double pesoEnc;
       boolean todoCorrecto=true;
        String envAP="",envAM="",envN="",recAP="",recAM="",recN="";
        int envDNI=0,recDNI=0;
        try {
            idSal=Integer.parseInt(horarios.getValue().toString());
        }
        catch (Exception e) {
            todoCorrecto=false;
            errorHorario.setText("Se debe de escoger un horario");
            errorHorario.setVisible(true);
           idSal=-1;
        }

        String catEnc="";

        if(categoriaEnc.getValue().toString().compareTo("-")==0){
            todoCorrecto=false;
            errorCategoria.setText("Debe escoger una cateogria de la encomienda");
            errorCategoria.setVisible(true);
        }
        else
            catEnc=categoriaEnc.getValue().toString();
        

        try {
            pesoEnc=Double.parseDouble(peso.getText().toString());
        }
        catch (Exception e) {
            errorPeso.setText("El peso no es correcto");
            errorPeso.setVisible(true);
            pesoEnc=-1;
            todoCorrecto=false;
        }
        boolean faltaDato=false;
        if(apellPaterno1.getText()==null){
            faltaDato=true;
            todoCorrecto=false;
        }
        else
            envAP=apellPaterno1.getText().toString();

        if(apellMaterno1.getText()==null){
            faltaDato=true;
            todoCorrecto=false;
        }
        else
            envAM=apellMaterno1.getText().toString();

        if(nombres1.getText()==null){
            faltaDato=true;
            todoCorrecto=false;
        }
        else
            envN=nombres1.getText().toString();

        if(DNI1.getText()==null){
            faltaDato=true;
            todoCorrecto=false;
        }
        else
            if(DNI1.getText().toString().length()!=8)
                todoCorrecto=false;
            else
                envDNI=Integer.parseInt(DNI1.getText().toString());


        if(apellPaterno2.getText()==null){
            faltaDato=true;
            todoCorrecto=false;
        }
        else
            recAP=apellPaterno2.getText().toString();

        if(apellMaterno2.getText()==null){
            faltaDato=true;
            todoCorrecto=false;
        }
        else
            recAM=apellMaterno2.getText().toString();

        if(nombres2.getText()==null){
            faltaDato=true;
            todoCorrecto=false;
        }
        else
            recN=nombres2.getText().toString();

       if(DNI2.getText()==null){
            faltaDato=true;
            todoCorrecto=false;
        }
        else
            if(DNI2.getText().toString().length()!=8)
                todoCorrecto=false;
            else
                recDNI=Integer.parseInt(DNI2.getText().toString());

        if(faltaDato)
            errorNombres.setText("Se deben especificar todos los datos");

        int tipoPago;
        try {
            tipoPago=Integer.parseInt(opcPago.getValue().toString());
        }
        catch (Exception e) {
            todoCorrecto=false;
            errorOpcPago.setText("Debe de seleccionar una opcion de pago");
            errorOpcPago.setVisible(true);
            tipoPago=-1;
        }

        double monto;
        try {
            monto=Double.parseDouble(montoTotal.getText().toString());
        } catch (Exception e) {
            todoCorrecto=false;
            errorMontoCanc.setText("El monto no es válido");
            errorMontoCanc.setVisible(true);
            monto=-1;
        }


        double cancelado;
        try {
            cancelado=Double.parseDouble(montoCancelado.getText().toString());
        }
        catch (Exception e) {
            todoCorrecto=false;
            errorMontoCanc.setText("El monto cancelado no es válido");
            errorMontoCanc.setVisible(true);
            cancelado=-1;
        }
        //insertarNuevaEncomienda(int idSal, String catEnc,double pesoEnc,String envAP,String envAM ,String envN,int envDNI,String recAP,String recAM,String recN,int recDNI,int estado,int tipopago,double monto,double cancelado)
        encID.setText(getApplicationBean1().getCon().insertarNuevaEncomienda(idSal,catEnc,pesoEnc,envAP, envAM , envN,envDNI, recAP, recAM, recN,recDNI,1,tipoPago,monto,cancelado));

        return null;
    }

    public String regresar_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case4";
    }

    public String home_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case3";
    }

    public String buscarEncomienda1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String buscarEncomienda_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String regEncEntregada_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        errorRuta.setVisible(false);
        errorFecha.setVisible(false);
        //errorGnrl.setVisible(false);
        int idOrigen=Integer.parseInt(depOrigen.getValue().toString());
        int idDestino=Integer.parseInt(depDestino.getValue().toString());

        if(idOrigen==0||idDestino==0){
            errorRuta.setText("Debe de especificar el origen y destino");
            errorRuta.setVisible(true);
        }
        else{
            
            String fec;
            try {
                fec=(String)DateFormat.getDateInstance(DateFormat.MEDIUM).format(startCalendar.getSelectedDate());
                fec=(String)(fec.subSequence(3,5)+"/"+fec.subSequence(0,2)+"/"+fec.subSequence(6,10));
                int numH=getApplicationBean1().getCon().obtenerHorarios(idOrigen,idDestino,fec);
            poblarComboHorarios(getApplicationBean1().getCon().Result, numH);
            }
            catch (Exception e) {
                errorFecha.setText("Debe indicar la fecha");
                errorFecha.setVisible(true);

            }


            //fec=(String)(fec.subSequence(3,6)+"/"+fec.subSequence(0,2)+"/"+fec.subSequence(7,11));
            //fec=(String)(fec.subSequence(3,5)+"/"+fec.subSequence(0,2)+"/"+fec.subSequence(6,10));

            //errorFecha.setText("fecha: "+fec);
            

            //Conector Con=new Conector();
            //Con.IniciarConexion();
            
            //precio.setVisible(false);
        }
        return null;
    }

    public void poblarComboHorarios(ResultSet R,int numHorarios){

        com.sun.webui.jsf.model.Option[] horarios;
        try{
            if(numHorarios>0){
                horarios=new com.sun.webui.jsf.model.Option[numHorarios+1];
                String hora,idSal;
                horarios[0]=new com.sun.webui.jsf.model.Option("-----","Seleccione el horario");
                int h=1;
                while(R.next()){
                    hora=R.getString("horasal");
                    idSal=R.getString("idsal");
                    horarios[h]=new com.sun.webui.jsf.model.Option(idSal,hora);
                    h++;
                }
            }
            else{
                horarios=new com.sun.webui.jsf.model.Option[1];
                horarios[0]=new com.sun.webui.jsf.model.Option("-----","No hay salidas programadas para esta ruta y fecha");
            }
        }
        catch(Exception e){
            horarios=new com.sun.webui.jsf.model.Option[1];
            horarios[0]=new com.sun.webui.jsf.model.Option("-----","Ocurrio un error en la consulta");
        }
        horariosDefaultOptions.setOptions(horarios);
    }
    
}

