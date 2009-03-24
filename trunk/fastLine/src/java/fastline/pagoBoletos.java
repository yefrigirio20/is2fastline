/*
 * pagoBoletos.java
 *
 * Created on 17-nov-2008, 19:15:29
 */
 
package fastline;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.sql.ResultSet;
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
        nomusuario.setText("Bienvenido: "+getApplicationBean1().getNombreusuario());
        reservacionesDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("----", "Consulte reservaciones primero")});
    }
    private SingleSelectOptionsList reservacionesDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getReservacionesDefaultOptions() {
        return reservacionesDefaultOptions;
    }

    public void setReservacionesDefaultOptions(SingleSelectOptionsList ssol) {
        this.reservacionesDefaultOptions = ssol;
    }
    private StaticText errorNomUsu = new StaticText();

    public StaticText getErrorNomUsu() {
        return errorNomUsu;
    }

    public void setErrorNomUsu(StaticText st) {
        this.errorNomUsu = st;
    }
    private DropDown reservaciones = new DropDown();

    public DropDown getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(DropDown dd) {
        this.reservaciones = dd;
    }
    private TextField idNomUsu = new TextField();

    public TextField getIdNomUsu() {
        return idNomUsu;
    }

    public void setIdNomUsu(TextField tf) {
        this.idNomUsu = tf;
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
        try{
            String nroRes=reservaciones.getValue().toString();
           
            getApplicationBean1().getCon().registrarVenta(nroRes);
            String nomusu=idNomUsu.getText().toString();
            int numRes=getApplicationBean1().getCon().obtenerReservaciones(nomusu);
            poblarComboReservaciones(getApplicationBean1().getCon().Result, numRes);
        }
        catch(Exception e){

        }
        return null;
    }

    

    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.       
        String nomusu="";
        if(idNomUsu.getText()!=null){
            nomusu=idNomUsu.getText().toString();
            int numRes=getApplicationBean1().getCon().obtenerReservaciones(nomusu);
            System.out.println("--------------------------------------\n"+numRes);
            poblarComboReservaciones(getApplicationBean1().getCon().Result, numRes);
        }
        else
            errorNomUsu.setText("Debe especificar el nombre de usuario");
        return null;
    }


    public void poblarComboReservaciones(ResultSet R,int numReservaciones){

        com.sun.webui.jsf.model.Option[] reservas;
        try{
            if(numReservaciones>0){
                reservas=new com.sun.webui.jsf.model.Option[numReservaciones+1];
                String apelpatusu,apelmatusu,nomusu,dniusu,idsal,origen,destino,fechsal,horasal,precbol,nroasibus,nropas;
                reservas[0]=new com.sun.webui.jsf.model.Option("-----","Seleccione la reservacion");
                int r=1;
                //System.out.println("--------------------------------------\nantes delwhile");
                while(R.next()){
                    //System.out.println("--------------------------------------\nr="+r);
                    apelpatusu=R.getString("apelpatusu");
                    //System.out.println(apelpatusu);
                    apelmatusu=R.getString("apelmatusu");
                    //System.out.println(apelmatusu);
                    nomusu=R.getString("nomusu");
                    //System.out.println(nomusu);
                    //dniusu=R.getString("dniusu");
                    //System.out.println(dniusu);
                    /*idsal=R.getString(5);*/
                    
                    origen=R.getString("origen");

                    destino=R.getString("destino");
                    //System.out.println(destino);

                    fechsal=R.getString("fechsal");
                    //System.out.println(fechsal);

                    horasal=R.getString("horasal");
                    //System.out.println(horasal);

                    precbol=R.getString("precbol");
                    nroasibus=R.getString("nroasibus");
                    
                    nropas=R.getString("nropas");
                    //System.out.println("iddelasiento: "+nropas);

                    //System.out.println(nropas);
                    //reservaciones[r]=new com.sun.webui.jsf.model.Option(nropas,apelpatusu+" "+apelmatusu+", "+nomusu+" "+dniusu+" "+idsal+" "+origen+" "+destino+" "+fechsal+" "+horasal+" "+precbol+" "+nroasibus+" "+nropas);
                    reservas[r]=new com.sun.webui.jsf.model.Option(nropas,apelpatusu+" "+apelmatusu+", "+nomusu+"\tRuta:"+origen+"-"+destino+"\tDia:"+fechsal+" Hora:"+horasal+" Asiento: "+nroasibus+"\t Precio: "+precbol);


                    r++;
                }
            }
            else{
                reservas=new com.sun.webui.jsf.model.Option[1];
                reservas[0]=new com.sun.webui.jsf.model.Option("-----","El usuario no registra ninguna reservacion");
            }
        }
        catch(Exception e){
            reservas=new com.sun.webui.jsf.model.Option[1];
            reservas[0]=new com.sun.webui.jsf.model.Option("-----","Ocurrio un error en la consulta");
        }
        reservacionesDefaultOptions.setOptions(reservas);
    }

    public void horarios_processValueChange(ValueChangeEvent event) {
        try {
        /*    String idNomUsu=id
            int numReservaciones=getApplicationBean1().getCon().obtenerReservaciones(idNumUsu)
            poblarComboReservaciones(getApplicationBean1().getCon().getResultSet(), numReservaciones);
*/
        }
        catch (Exception e) {
        }
    }    

    public void ruta_processValueChange(ValueChangeEvent event) {
    }

    public void reservaciones_processValueChange(ValueChangeEvent event) {
    }

    public String cerrarsesion_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        getApplicationBean1().getCon().CerrarConexion();
        getApplicationBean1().setSesion(false);
        return "case3";
    }
}

