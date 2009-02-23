/*
 * gestionarRutas.java
 *
 * Created on 15-nov-2008, 15:29:12
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
import conexionJDBC.Conector;
import java.text.DateFormat;

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
        depOrigenDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("0", "---"),new com.sun.webui.jsf.model.Option("8", "Amazonas"), new com.sun.webui.jsf.model.Option("24", "Ancash"), new com.sun.webui.jsf.model.Option("15", "Apurimac"),new com.sun.webui.jsf.model.Option("16", "Arequipa"), new com.sun.webui.jsf.model.Option("23", "Ayacucho"), new com.sun.webui.jsf.model.Option("6", "Cajamarca"), new com.sun.webui.jsf.model.Option("17", "Cusco"), new com.sun.webui.jsf.model.Option("22", "Huancavelica"), new com.sun.webui.jsf.model.Option("25", "Huanuco"), new com.sun.webui.jsf.model.Option("14", "Ica"), new com.sun.webui.jsf.model.Option("7", "Iquitos"), new com.sun.webui.jsf.model.Option("12", "Junin"), new com.sun.webui.jsf.model.Option("10", "La Libertad"), new com.sun.webui.jsf.model.Option("5", "Lambayeque"), new com.sun.webui.jsf.model.Option("13", "Lima"), new com.sun.webui.jsf.model.Option("1", "Madre de Dios"), new com.sun.webui.jsf.model.Option("18", "Moquegua"), new com.sun.webui.jsf.model.Option("11", "Pasco"), new com.sun.webui.jsf.model.Option("4", "Piura"), new com.sun.webui.jsf.model.Option("20", "Puno"), new com.sun.webui.jsf.model.Option("9", "San Martin"), new com.sun.webui.jsf.model.Option("19", "Tacna"), new com.sun.webui.jsf.model.Option("3", "Tumbes"), new com.sun.webui.jsf.model.Option("21", "Ucayali")});
        depDestinoDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("0", "---"),new com.sun.webui.jsf.model.Option("8", "Amazonas"), new com.sun.webui.jsf.model.Option("24", "Ancash"), new com.sun.webui.jsf.model.Option("15", "Apurimac"),new com.sun.webui.jsf.model.Option("16", "Arequipa"), new com.sun.webui.jsf.model.Option("23", "Ayacucho"), new com.sun.webui.jsf.model.Option("6", "Cajamarca"), new com.sun.webui.jsf.model.Option("17", "Cusco"), new com.sun.webui.jsf.model.Option("22", "Huancavelica"), new com.sun.webui.jsf.model.Option("25", "Huanuco"), new com.sun.webui.jsf.model.Option("14", "Ica"), new com.sun.webui.jsf.model.Option("7", "Iquitos"), new com.sun.webui.jsf.model.Option("12", "Junin"), new com.sun.webui.jsf.model.Option("10", "La Libertad"), new com.sun.webui.jsf.model.Option("5", "Lambayeque"), new com.sun.webui.jsf.model.Option("13", "Lima"), new com.sun.webui.jsf.model.Option("1", "Madre de Dios"), new com.sun.webui.jsf.model.Option("18", "Moquegua"), new com.sun.webui.jsf.model.Option("11", "Pasco"), new com.sun.webui.jsf.model.Option("4", "Piura"), new com.sun.webui.jsf.model.Option("20", "Puno"), new com.sun.webui.jsf.model.Option("9", "San Martin"), new com.sun.webui.jsf.model.Option("19", "Tacna"), new com.sun.webui.jsf.model.Option("3", "Tumbes"), new com.sun.webui.jsf.model.Option("21", "Ucayali")});
        //comboRutasDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{});
        poblarComboRutas();
        poblarComboBuses();
        poblarComboChoferes();
        com.sun.webui.jsf.model.Option[] horas=new com.sun.webui.jsf.model.Option[25];
        horas[0]=new com.sun.webui.jsf.model.Option("---","---");
        for(int h=1;h<=24;h++){
            horas[h]=new com.sun.webui.jsf.model.Option(""+(h-1),""+(h-1));
        }
        horaDefaultOptions.setOptions(horas);
        
        com.sun.webui.jsf.model.Option[] minutos=new com.sun.webui.jsf.model.Option[7];
        int min=10;
        minutos[0]=new com.sun.webui.jsf.model.Option("---","---");
        minutos[1]=new com.sun.webui.jsf.model.Option("0","00");
        for(int i=2;i<=6;i++){
            minutos[i]=new com.sun.webui.jsf.model.Option(""+min,""+min);
            min+=10;
        }
        minutosDefaultOptions.setOptions(minutos);
        //comboRutasDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{});
        //rutaNuevaSalidaDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{});
        
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
    private SingleSelectOptionsList comboRutasDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getComboRutasDefaultOptions() {
        return comboRutasDefaultOptions;
    }

    public void setComboRutasDefaultOptions(SingleSelectOptionsList ssol) {
        this.comboRutasDefaultOptions = ssol;
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
    private SingleSelectOptionsList chofer2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getChofer2DefaultOptions() {
        return chofer2DefaultOptions;
    }

    public void setChofer2DefaultOptions(SingleSelectOptionsList ssol) {
        this.chofer2DefaultOptions = ssol;
    }
    private SingleSelectOptionsList chofer1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getChofer1DefaultOptions() {
        return chofer1DefaultOptions;
    }

    public void setChofer1DefaultOptions(SingleSelectOptionsList ssol) {
        this.chofer1DefaultOptions = ssol;
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
    private Button agregarRuta = new Button();

    public Button getAgregarRuta() {
        return agregarRuta;
    }

    public void setAgregarRuta(Button b) {
        this.agregarRuta = b;
    }
    private StaticText errorRuta = new StaticText();

    public StaticText getErrorRuta() {
        return errorRuta;
    }

    public void setErrorRuta(StaticText st) {
        this.errorRuta = st;
    }
    private DropDown comboRutas = new DropDown();

    public DropDown getComboRutas() {
        return comboRutas;
    }

    public void setComboRutas(DropDown dd) {
        this.comboRutas = dd;
    }
    private DropDown rutaNuevaSalida = new DropDown();

    public DropDown getRutaNuevaSalida() {
        return rutaNuevaSalida;
    }

    public void setRutaNuevaSalida(DropDown dd) {
        this.rutaNuevaSalida = dd;
    }
    private DropDown busNuevaSalida = new DropDown();

    public DropDown getBusNuevaSalida() {
        return busNuevaSalida;
    }

    public void setBusNuevaSalida(DropDown dd) {
        this.busNuevaSalida = dd;
    }
    private DropDown chofer1 = new DropDown();

    public DropDown getChofer1() {
        return chofer1;
    }

    public void setChofer1(DropDown dd) {
        this.chofer1 = dd;
    }
    private DropDown chofer2 = new DropDown();

    public DropDown getChofer2() {
        return chofer2;
    }

    public void setChofer2(DropDown dd) {
        this.chofer2 = dd;
    }
    private Calendar fecha = new Calendar();

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar c) {
        this.fecha = c;
    }
    private Button agregarNuevaSalida = new Button();

    public Button getAgregarNuevaSalida() {
        return agregarNuevaSalida;
    }

    public void setAgregarNuevaSalida(Button b) {
        this.agregarNuevaSalida = b;
    }
    private StaticText errorHora = new StaticText();

    public StaticText getErrorHora() {
        return errorHora;
    }

    public void setErrorHora(StaticText st) {
        this.errorHora = st;
    }
    private StaticText errorChoferes = new StaticText();

    public StaticText getErrorChoferes() {
        return errorChoferes;
    }

    public void setErrorChoferes(StaticText st) {
        this.errorChoferes = st;
    }
    private StaticText errorBus = new StaticText();

    public StaticText getErrorBus() {
        return errorBus;
    }

    public void setErrorBus(StaticText st) {
        this.errorBus = st;
    }
    private StaticText errorRutaSal = new StaticText();

    public StaticText getErrorRutaSal() {
        return errorRutaSal;
    }

    public void setErrorRutaSal(StaticText st) {
        this.errorRutaSal = st;
    }
    private DropDown hora = new DropDown();

    public DropDown getHora() {
        return hora;
    }

    public void setHora(DropDown dd) {
        this.hora = dd;
    }
    private DropDown minutos = new DropDown();

    public DropDown getMinutos() {
        return minutos;
    }

    public void setMinutos(DropDown dd) {
        this.minutos = dd;
    }
    private TextField precio = new TextField();

    public TextField getPrecio() {
        return precio;
    }

    public void setPrecio(TextField tf) {
        this.precio = tf;
    }
    private StaticText errorPrecio = new StaticText();

    public StaticText getErrorPrecio() {
        return errorPrecio;
    }

    public void setErrorPrecio(StaticText st) {
        this.errorPrecio = st;
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
        errorRuta.setVisible(false);
        int Origen=Integer.parseInt(depOrigen.getValue().toString());
        int Destino=Integer.parseInt(depDestino.getValue().toString());
        if(Origen==0||Destino==0){
            errorRuta.setText("Debe de especificar el origen y el destino");
            errorRuta.setVisible(true);
        }
        else if(Origen==Destino){
            errorRuta.setText("El origen y el destino no pueden ser el mismo");
            errorRuta.setVisible(true);
        }
    }

    public void depDestino_processValueChange(ValueChangeEvent vce) {
        errorRuta.setVisible(false);
        int Origen=Integer.parseInt(depOrigen.getValue().toString());
        int Destino=Integer.parseInt(depDestino.getValue().toString());
        if(Origen==0||Destino==0){
            errorRuta.setText("Debe de especificar el origen y el destino");
            errorRuta.setVisible(true);
        }
        else if(Origen==Destino){
            errorRuta.setText("El origen y el destino no pueden ser el mismo");
            errorRuta.setVisible(true);
        }
    }

    public String agregarRuta_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        errorRuta.setVisible(false);
        int idOrigen=Integer.parseInt(depOrigen.getValue().toString());
        int idDestino=Integer.parseInt(depDestino.getValue().toString());
        Conector Con=new Conector();
        Con.IniciarConexion();
        if(Con.existeRuta(idOrigen, idDestino)){
            errorRuta.setText("La ruta ya existe en la base");
            errorRuta.setVisible(true);
        }
        else{
            if(idOrigen==idDestino){
                errorRuta.setText("Ruta no valida");
                errorRuta.setVisible(true);
            }
            else
                Con.insertarNuevaRuta(idOrigen,idDestino);
        }
        Con.CerrarConexion();
        return null;
    }

    public String eliminarRuta_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        int idruta=Integer.parseInt(comboRutas.getValue().toString());
        Conector Con=new Conector();
        Con.IniciarConexion();
        Con.eliminarRuta(idruta);
        Con.CerrarConexion();
        return null;
    }

    public String agregarNuevaSalida_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        errorHora.setVisible(false);
        errorChoferes.setVisible(false);
        errorRutaSal.setVisible(false);
        errorBus.setVisible(false);
        errorHora.setVisible(false);
        errorPrecio.setVisible(false);


        String idRuta=rutaNuevaSalida.getValue().toString();
        String matBus=busNuevaSalida.getValue().toString();
        String chof1=chofer1.getValue().toString();
        String chof2=chofer2.getValue().toString();
        String precBol="";
        String hr=hora.getValue().toString();
        String min=minutos.getValue().toString();
        String horaSal=hr+":"+min;
        boolean todoCorrecto=true;
        if(idRuta.compareTo("---")==0){
            errorRutaSal.setText("Debe escojer una ruta");
            errorRutaSal.setVisible(true);
            todoCorrecto=false;
        }
        if(matBus.compareTo("---")==0){
            errorBus.setText("Debe escojer un Bus");
            errorBus.setVisible(true);
            todoCorrecto=false;
        }

        if(chof1.compareTo("---")==0||chof2.compareTo("---")==0){
            errorChoferes.setText("Debe escojer 2 choferes en cada salida");
            errorChoferes.setVisible(true);
            todoCorrecto=false;
        }
        else if(chof1.compareTo(chof2)==0){
            errorChoferes.setText("El chofer 1 y 2 no pueden ser la misma persona");
            errorChoferes.setVisible(true);
            todoCorrecto=false;
        }

        if(hr.compareTo("---")==0||min.compareTo("---")==0){
            errorHora.setText("Debe proporcionar la hora de la salida");
            errorHora.setVisible(true);
            todoCorrecto=false;
        }

        if(precio.getText()!=null){
            precBol=precio.getText().toString();
        }
        else{
            errorPrecio.setText("Debe definir un precio para el boleto");
            errorPrecio.setVisible(true);
            todoCorrecto=false;
        }

        
        try {            
            double prec=Double.parseDouble(precBol);

            if(prec>=100){
                errorPrecio.setText("El precio debe ser menor a S/.100");
                errorPrecio.setVisible(true);
                todoCorrecto=false;
            }
        } catch (Exception e) {
            errorPrecio.setText("El precio proporcionado no es correcto");
            errorPrecio.setVisible(true);
            todoCorrecto=false;
        }



        String fec=(String)DateFormat.getDateInstance(DateFormat.MEDIUM).format(fecha.getSelectedDate());
        //fec=(String)(fec.subSequence(3,6)+"/"+fec.subSequence(0,2)+"/"+fec.subSequence(7,11));
        fec=(String)(fec.subSequence(3,5)+"/"+fec.subSequence(0,2)+"/"+fec.subSequence(6,10));

        if(todoCorrecto){
            Conector Con=new Conector();
            Con.IniciarConexion();
            Con.insertarNuevaSalida(idRuta, chof1, chof2, horaSal, fec, matBus, precBol);
            Con.prepararAsientos();
            Con.CerrarConexion();
        }        
        
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
    private void poblarComboRutas(){
        com.sun.webui.jsf.model.Option[] rutas;
        Conector Con=new Conector();
        Con.IniciarConexion();
        try{
            int numRutas=Con.obtenerRutas();
            if(numRutas>0){
                rutas=new com.sun.webui.jsf.model.Option[numRutas+1];
                String idruta,origen,destino;
                rutas[0]=new com.sun.webui.jsf.model.Option("---","Seleccione la ruta");
                int r=1;
                while(Con.getResultSet().next()){
                    idruta=Con.getResultSet().getString("idrut");
                    origen=Con.getResultSet().getString("origen");
                    destino=Con.getResultSet().getString("destino");
                    rutas[r]=new com.sun.webui.jsf.model.Option(idruta,origen+" - "+destino);
                    r++;
                }
            }
            else{
                rutas=new com.sun.webui.jsf.model.Option[1];
                rutas[0]=new com.sun.webui.jsf.model.Option("---","No hay rutas en la base de datos");
            }
        }
        catch(Exception e){
            rutas=new com.sun.webui.jsf.model.Option[1];
            rutas[0]=new com.sun.webui.jsf.model.Option("---","Ocurrio un error con la base de datos");
        }
        Con.CerrarConexion();
        comboRutasDefaultOptions.setOptions(rutas);
        rutaNuevaSalidaDefaultOptions.setOptions(rutas);
    }

    private void poblarComboBuses(){
        com.sun.webui.jsf.model.Option[] buses;
        Conector Con=new Conector();
        Con.IniciarConexion();
        try{
            int numbuses=Con.obtenerBuses();
            if(numbuses>0){
                buses=new com.sun.webui.jsf.model.Option[numbuses+1];
                String matBus;
                int Capacidad;
                buses[0]=new com.sun.webui.jsf.model.Option("---","Seleccione el bus");
                int b=1;
                while(Con.getResultSet().next()){
                    matBus=Con.getResultSet().getString("matbus");
                    Capacidad=Con.getResultSet().getInt("capbus");
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
        Con.CerrarConexion();
        busNuevaSalidaDefaultOptions.setOptions(buses);
    }

    private void poblarComboChoferes(){
        com.sun.webui.jsf.model.Option[] choferes;
        Conector Con=new Conector();
        Con.IniciarConexion();
        try{
            int numChof=Con.obtenerChoferes();
            if(numChof>0){
                choferes=new com.sun.webui.jsf.model.Option[numChof+1];
                String idChof,apelPatChof,apelMatChof,nomChof;
                choferes[0]=new com.sun.webui.jsf.model.Option("---","Seleccione el chofer");
                int c=1;
                while(Con.getResultSet().next()){
                    idChof=Con.getResultSet().getString("idchof");
                    apelPatChof=Con.getResultSet().getString("apelpatchof");
                    apelMatChof=Con.getResultSet().getString("apelmatchof");
                    nomChof=Con.getResultSet().getString("nomchof");
                    choferes[c]=new com.sun.webui.jsf.model.Option(idChof,apelPatChof+" "+apelMatChof+", "+nomChof);
                    c++;
                }
            }
            else{
                choferes=new com.sun.webui.jsf.model.Option[1];
                choferes[0]=new com.sun.webui.jsf.model.Option("---","No hay choferes en la base de datos");
            }
        }
        catch(Exception e){
            choferes=new com.sun.webui.jsf.model.Option[1];
            choferes[0]=new com.sun.webui.jsf.model.Option("---","Ocurrio un error con la base de datos");
        }
        Con.CerrarConexion();
        chofer1DefaultOptions.setOptions(choferes);
        chofer2DefaultOptions.setOptions(choferes);
    }
}

