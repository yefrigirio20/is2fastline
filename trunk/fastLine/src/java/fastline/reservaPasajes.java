/*
 * reservaPasajes.java
 *
 * Created on 10-nov-2008, 17:42:37
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
import java.sql.*;
import java.text.DateFormat;
import conexionJDBC.Conector;


/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author Huachani
 */
public class reservaPasajes extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        depOrigenDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("0", "-----"),new com.sun.webui.jsf.model.Option("8", "Amazonas"), new com.sun.webui.jsf.model.Option("24", "Ancash"), new com.sun.webui.jsf.model.Option("15", "Apurimac"),new com.sun.webui.jsf.model.Option("16", "Arequipa"), new com.sun.webui.jsf.model.Option("23", "Ayacucho"), new com.sun.webui.jsf.model.Option("6", "Cajamarca"), new com.sun.webui.jsf.model.Option("17", "Cusco"), new com.sun.webui.jsf.model.Option("22", "Huancavelica"), new com.sun.webui.jsf.model.Option("25", "Huanuco"), new com.sun.webui.jsf.model.Option("14", "Ica"), new com.sun.webui.jsf.model.Option("7", "Iquitos"), new com.sun.webui.jsf.model.Option("12", "Junin"), new com.sun.webui.jsf.model.Option("10", "La Libertad"), new com.sun.webui.jsf.model.Option("5", "Lambayeque"), new com.sun.webui.jsf.model.Option("13", "Lima"), new com.sun.webui.jsf.model.Option("1", "Madre de Dios"), new com.sun.webui.jsf.model.Option("18", "Moquegua"), new com.sun.webui.jsf.model.Option("11", "Pasco"), new com.sun.webui.jsf.model.Option("4", "Piura"), new com.sun.webui.jsf.model.Option("20", "Puno"), new com.sun.webui.jsf.model.Option("9", "San Martin"), new com.sun.webui.jsf.model.Option("19", "Tacna"), new com.sun.webui.jsf.model.Option("3", "Tumbes"), new com.sun.webui.jsf.model.Option("21", "Ucayali")});
        depDestinoDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("0", "-----"),new com.sun.webui.jsf.model.Option("8", "Amazonas"), new com.sun.webui.jsf.model.Option("24", "Ancash"), new com.sun.webui.jsf.model.Option("15", "Apurimac"),new com.sun.webui.jsf.model.Option("16", "Arequipa"), new com.sun.webui.jsf.model.Option("23", "Ayacucho"), new com.sun.webui.jsf.model.Option("6", "Cajamarca"), new com.sun.webui.jsf.model.Option("17", "Cusco"), new com.sun.webui.jsf.model.Option("22", "Huancavelica"), new com.sun.webui.jsf.model.Option("25", "Huanuco"), new com.sun.webui.jsf.model.Option("14", "Ica"), new com.sun.webui.jsf.model.Option("7", "Iquitos"), new com.sun.webui.jsf.model.Option("12", "Junin"), new com.sun.webui.jsf.model.Option("10", "La Libertad"), new com.sun.webui.jsf.model.Option("5", "Lambayeque"), new com.sun.webui.jsf.model.Option("13", "Lima"), new com.sun.webui.jsf.model.Option("1", "Madre de Dios"), new com.sun.webui.jsf.model.Option("18", "Moquegua"), new com.sun.webui.jsf.model.Option("11", "Pasco"), new com.sun.webui.jsf.model.Option("4", "Piura"), new com.sun.webui.jsf.model.Option("20", "Puno"), new com.sun.webui.jsf.model.Option("9", "San Martin"), new com.sun.webui.jsf.model.Option("19", "Tacna"), new com.sun.webui.jsf.model.Option("3", "Tumbes"), new com.sun.webui.jsf.model.Option("21", "Ucayali")});
        horariosDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("-----", "-----")});
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
    private SingleSelectOptionsList horariosDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getHorariosDefaultOptions() {
        return horariosDefaultOptions;
    }

    public void setHorariosDefaultOptions(SingleSelectOptionsList ssol) {
        this.horariosDefaultOptions = ssol;
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
    private StaticText errorRuta = new StaticText();

    public StaticText getErrorRuta() {
        return errorRuta;
    }

    public void setErrorRuta(StaticText st) {
        this.errorRuta = st;
    }
    private DropDown horarios = new DropDown();

    public DropDown getHorarios() {
        return horarios;
    }

    public void setHorarios(DropDown dd) {
        this.horarios = dd;
    }
    private StaticText precio = new StaticText();

    public StaticText getPrecio() {
        return precio;
    }

    public void setPrecio(StaticText st) {
        this.precio = st;
    }
    private Button consultarHorarios = new Button();

    public Button getConsultarHorarios() {
        return consultarHorarios;
    }

    public void setConsultarHorarios(Button b) {
        this.consultarHorarios = b;
    }
    private Calendar startCalendar = new Calendar();

    public Calendar getStartCalendar() {
        return startCalendar;
    }

    public void setStartCalendar(Calendar c) {
        this.startCalendar = c;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public reservaPasajes() {
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
            log("reservaPasajes Initialization Failure", e);
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

    public void depOrigen_processValueChange(ValueChangeEvent event) {
        errorRuta.setVisible(false);
        if(depOrigen.getValue().toString().compareTo(depDestino.getValue().toString())==0){
            errorRuta.setText("El origen y el destino no pueden ser el mismo");
            errorRuta.setVisible(true);
        }
    }

    public String home_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case1";
    }

    public String reservar_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public void depDestino_processValueChange(ValueChangeEvent vce) {
        errorRuta.setVisible(false);
        if(depOrigen.getValue().toString().compareTo(depDestino.getValue().toString())==0){
            errorRuta.setText("El origen y el destino no pueden ser el mismo");
            errorRuta.setVisible(true);
        }
    }

    public void fecha_processValueChange(ValueChangeEvent event) {
        precio.setVisible(false);
        //String fec=fecha.getText().toString();
        //fec=fec.subSequence(3,4)+"/"+fec.subSequence(0,1)+"/"+fec.subSequence(6,9);
        precio.setText("probando");
        precio.setVisible(true);
        
    }

    public String consultarHorarios_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        //precio.setVisible(false);
        int idOrigen=Integer.parseInt(depOrigen.getValue().toString());
        int idDestino=Integer.parseInt(depDestino.getValue().toString());
        //fecha.get

        /*precio.setText(
                (String)DateFormat.getDateInstance(
                DateFormat.MEDIUM).format(startCalendar.getSelectedDate())
                + " is a valid date.");*/
        String fec=(String)DateFormat.getDateInstance(DateFormat.MEDIUM).format(startCalendar.getSelectedDate());
       //precio.setText((String)DateFormat.getDateInstance(DateFormat.MEDIUM).format(fecha.getSelectedDate()));
       //String fec=fecha.getSelectedDate().toString();
       //String fec=fecha.getSubmittedValue().toString();
        //String fec=fecha.getText().toString();
        fec=(String)(fec.subSequence(3,5)+"/"+fec.subSequence(0,2)+"/"+fec.subSequence(6,10));
        Conector Con=new Conector();
        Con.IniciarConexion();
        int numH=Con.obtenerHorarios(idOrigen,idDestino,fec);
        poblarComboHorarios(Con.Result, numH);
        //precio.setText("O:"+idOrigen+" D:"+idDestino);
        precio.setText("numerosal:"+numH);
        //precio.setVisible(true);
        return null;
    }

    public void poblarComboHorarios(ResultSet R,int numHorarios){

        com.sun.webui.jsf.model.Option[] horarios;
        try{
            horarios=new com.sun.webui.jsf.model.Option[numHorarios+1];
            String hora;
            horarios[0]=new com.sun.webui.jsf.model.Option("-----","-----");
            int h=1;
            while(R.next()){

            //for(int h=1;h<=numHorarios;h++){
                hora=R.getString("horasal");
                horarios[h]=new com.sun.webui.jsf.model.Option(hora,hora);
                h++;
            }
        }
        catch(Exception e){
            horarios=new com.sun.webui.jsf.model.Option[1];
            horarios[0]=new com.sun.webui.jsf.model.Option("-----","-----");
        }
        horariosDefaultOptions.setOptions(horarios);
    }

    public void startCalendar_processValueChange(ValueChangeEvent event) {
        int idOrigen=Integer.parseInt(depOrigen.getValue().toString());
        int idDestino=Integer.parseInt(depDestino.getValue().toString());
        //fecha.get

        /*precio.setText(
                (String)DateFormat.getDateInstance(
                DateFormat.MEDIUM).format(startCalendar.getSelectedDate())
                + " is a valid date.");*/
        String fec=(String)DateFormat.getDateInstance(DateFormat.MEDIUM).format(startCalendar.getSelectedDate());
       //precio.setText((String)DateFormat.getDateInstance(DateFormat.MEDIUM).format(fecha.getSelectedDate()));
       //String fec=fecha.getSelectedDate().toString();
       //String fec=fecha.getSubmittedValue().toString();
        //String fec=fecha.getText().toString();
        fec=(String)(fec.subSequence(3,5)+"/"+fec.subSequence(0,2)+"/"+fec.subSequence(6,10));
        Conector Con=new Conector();
        Con.IniciarConexion();
        int numH=Con.obtenerHorarios(idOrigen,idDestino,fec);
        poblarComboHorarios(Con.Result, numH);
        //precio.setText("O:"+idOrigen+" D:"+idDestino);
        precio.setText("numerosal:"+numH);
        //precio.setVisible(true);       
    }
    
}

