/*
 * pagoBoletos.java
 *
 * Created on 17-nov-2008, 19:15:29
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.StaticText;
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
public class pagoBoletos extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        poblarComboRuta();
        horariosDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("----", "Consulte horarios primero")});
        reservacionesDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("----", "Seleccione el horario")});
    }
    private SingleSelectOptionsList rutaDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRutaDefaultOptions() {
        return rutaDefaultOptions;
    }

    public void setRutaDefaultOptions(SingleSelectOptionsList ssol) {
        this.rutaDefaultOptions = ssol;
    }
    private SingleSelectOptionsList horariosDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getHorariosDefaultOptions() {
        return horariosDefaultOptions;
    }

    public void setHorariosDefaultOptions(SingleSelectOptionsList ssol) {
        this.horariosDefaultOptions = ssol;
    }
    private SingleSelectOptionsList reservacionesDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getReservacionesDefaultOptions() {
        return reservacionesDefaultOptions;
    }

    public void setReservacionesDefaultOptions(SingleSelectOptionsList ssol) {
        this.reservacionesDefaultOptions = ssol;
    }
    private DropDown ruta = new DropDown();

    public DropDown getRuta() {
        return ruta;
    }

    public void setRuta(DropDown dd) {
        this.ruta = dd;
    }
    private StaticText errorRuta = new StaticText();

    public StaticText getErrorRuta() {
        return errorRuta;
    }

    public void setErrorRuta(StaticText st) {
        this.errorRuta = st;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private Calendar fecha = new Calendar();

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar c) {
        this.fecha = c;
    }
    private StaticText errorFecha = new StaticText();

    public StaticText getErrorFecha() {
        return errorFecha;
    }

    public void setErrorFecha(StaticText st) {
        this.errorFecha = st;
    }
    private DropDown horarios = new DropDown();

    public DropDown getHorarios() {
        return horarios;
    }

    public void setHorarios(DropDown dd) {
        this.horarios = dd;
    }
    private DropDown reservaciones = new DropDown();

    public DropDown getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(DropDown dd) {
        this.reservaciones = dd;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public pagoBoletos() {
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
            log("pagoBoletos Initialization Failure", e);
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

    public String regresar_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case1";
    }

    public String home_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case2";
    }

    public String regEncEntregada_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    private void poblarComboRuta(){
        com.sun.webui.jsf.model.Option[] rutas;
        //Conector Con=new Conector();
        //Con.IniciarConexion();
        try{
            int numRutas=getApplicationBean1().getCon().obtenerRutas();
            if(numRutas>0){
                rutas=new com.sun.webui.jsf.model.Option[numRutas+1];
                String idruta,origen,destino;
                rutas[0]=new com.sun.webui.jsf.model.Option("---","Seleccione la ruta");
                int r=1;
                while(getApplicationBean1().getCon().getResultSet().next()){
                    idruta=getApplicationBean1().getCon().getResultSet().getString("idrut");
                    origen=getApplicationBean1().getCon().getResultSet().getString("origen");
                    destino=getApplicationBean1().getCon().getResultSet().getString("destino");
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
        //Con.CerrarConexion();
        rutaDefaultOptions.setOptions(rutas);
    }

    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        errorFecha.setVisible(false);
        errorRuta.setVisible(false);
        int idSal=0;
        try {
            idSal=Integer.parseInt(ruta.getValue().toString());
        } catch (Exception e) {
            errorRuta.setText("Debe escoger una ruta");
        }
        String fec="";
        try{
                fec=(String)DateFormat.getDateInstance(DateFormat.MEDIUM).format(fecha.getSelectedDate());
        }catch(Exception e){
            errorFecha.setText("La fecha es requerida");
            errorFecha.setVisible(true);
        }
        if(idSal==0||fec.compareTo("")!=0){
            int numH=getApplicationBean1().getCon().obtenerHorarios(idSal, fec);
            getApplicationBean1().setRespaldo1(getApplicationBean1().getCon().getResultSet());
            poblarComboHorarios(getApplicationBean1().getRespaldo1(), numH);
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

    public void poblarComboReservaciones(ResultSet R,int numReservaciones){

        com.sun.webui.jsf.model.Option[] reservaciones;
        try{
            if(numReservaciones>0){
                reservaciones=new com.sun.webui.jsf.model.Option[numReservaciones+1];
                String apelpatusu,apelmatusu,dniusu,precbol,idasi,nropas;
                reservaciones[0]=new com.sun.webui.jsf.model.Option("-----","Seleccione la reservacion");
                int r=1;
                while(R.next()){
                    apelpatusu=R.getString("apelpatusu");
                    apelmatusu=R.getString("apelmatusu");

                    dniusu=R.getString("dniusu");
                    precbol=R.getString("precbol");
                    idasi=R.getString("idasi");
                    nropas=R.getString("nropas");
                    reservaciones[r]=new com.sun.webui.jsf.model.Option(nropas,apelpatusu+" "+apelmatusu+", "+dniusu+" "+idasi);
                    r++;
                }
            }
            else{
                reservaciones=new com.sun.webui.jsf.model.Option[1];
                reservaciones[0]=new com.sun.webui.jsf.model.Option("-----","No hay salidas programadas para esta ruta y fecha");
            }
        }
        catch(Exception e){
            reservaciones=new com.sun.webui.jsf.model.Option[1];
            reservaciones[0]=new com.sun.webui.jsf.model.Option("-----","Ocurrio un error en la consulta");
        }
        reservacionesDefaultOptions.setOptions(reservaciones);
    }

    public void horarios_processValueChange(ValueChangeEvent event) {
        try {
            int idSal=Integer.parseInt(horarios.getValue().toString());
            int numReservaciones=getApplicationBean1().getCon().obtenerRservaciones(idSal);
            poblarComboReservaciones(getApplicationBean1().getCon().getResultSet(), numReservaciones);

        }
        catch (Exception e) {
        }
    }

    public String button2_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        try {
            int idSal=Integer.parseInt(horarios.getValue().toString());
            int numReservaciones=getApplicationBean1().getCon().obtenerRservaciones(idSal);
            poblarComboReservaciones(getApplicationBean1().getCon().getResultSet(), numReservaciones);

        }
        catch (Exception e) {
        }
        return null;
    }
}

