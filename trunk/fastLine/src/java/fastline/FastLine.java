/*
 * FastLine.java
 *
 * Created on 16-nov-2008, 17:24:25
 */
 
package fastline;


import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import conexionJDBC.Conector;
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
public class FastLine extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        //error.setVisible(false);
           mostrarOcultar();
    }
    private void mostrarOcultar(){
            mensajelogginLabel.setVisible(!getApplicationBean1().getSesion());
            userLabel.setVisible(!getApplicationBean1().getSesion());
            passLabel.setVisible(!getApplicationBean1().getSesion());
            userName1.setVisible(!getApplicationBean1().getSesion());
            pass1.setVisible(!getApplicationBean1().getSesion());
            iniciarSesion.setVisible(!getApplicationBean1().getSesion());
            nuevoUsuarioAqui.setVisible(!getApplicationBean1().getSesion());
            registrarseClick.setVisible(!getApplicationBean1().getSesion());
            cerrarsesion.setVisible(!getApplicationBean1().getSesion());
            userAccount.setText("Bienvenido: "+getApplicationBean1().getNombreusuario());
            userAccount.setVisible(getApplicationBean1().getSesion());
            
            if(getApplicationBean1().getNombreusuario().compareTo("admin")==0){
                regresarAdm.setVisible(getApplicationBean1().getSesion());
                regresarAdm.setText("Regresar a la Pagina de Administracion");
            }
            else{
                reservarPasajes.setVisible(getApplicationBean1().getSesion());
                imageReservar.setVisible(getApplicationBean1().getSesion());
                reservarPasajes.setText("Reservar Pasajes");
            }

            cerrarsesion.setText("Cerrar Sesion");
            cerrarsesion.setVisible(getApplicationBean1().getSesion());
            reservarPasajes.setVisible(getApplicationBean1().getSesion());
    }
    private TextField userName1 = new TextField();

    public TextField getUserName1() {
        return userName1;
    }

    public void setUserName1(TextField tf) {
        this.userName1 = tf;
    }
    private PasswordField pass1 = new PasswordField();

    public PasswordField getPass1() {
        return pass1;
    }

    public void setPass1(PasswordField pf) {
        this.pass1 = pf;
    }
    private StaticText error = new StaticText();

    public StaticText getError() {
        return error;
    }

    public void setError(StaticText st) {
        this.error = st;
    }
    private Button iniciarSesion = new Button();

    public Button getIniciarSesion() {
        return iniciarSesion;
    }

    public void setIniciarSesion(Button b) {
        this.iniciarSesion = b;
    }
    private StaticText mensajelogginLabel = new StaticText();

    public StaticText getMensajelogginLabel() {
        return mensajelogginLabel;
    }

    public void setMensajelogginLabel(StaticText st) {
        this.mensajelogginLabel = st;
    }
    private Label userLabel = new Label();

    public Label getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(Label l) {
        this.userLabel = l;
    }
    private Label passLabel = new Label();

    public Label getPassLabel() {
        return passLabel;
    }

    public void setPassLabel(Label l) {
        this.passLabel = l;
    }
    private StaticText userAccount = new StaticText();

    public StaticText getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(StaticText st) {
        this.userAccount = st;
    }
    private Hyperlink reservarPasajes = new Hyperlink();

    public Hyperlink getReservarPasajes() {
        return reservarPasajes;
    }

    public void setReservarPasajes(Hyperlink h) {
        this.reservarPasajes = h;
    }
    private ImageComponent imageReservar = new ImageComponent();

    public ImageComponent getImageReservar() {
        return imageReservar;
    }

    public void setImageReservar(ImageComponent ic) {
        this.imageReservar = ic;
    }
    private Hyperlink nuevoUsuarioAqui = new Hyperlink();

    public Hyperlink getNuevoUsuarioAqui() {
        return nuevoUsuarioAqui;
    }

    public void setNuevoUsuarioAqui(Hyperlink h) {
        this.nuevoUsuarioAqui = h;
    }
    private StaticText registrarseClick = new StaticText();

    public StaticText getRegistrarseClick() {
        return registrarseClick;
    }

    public void setRegistrarseClick(StaticText st) {
        this.registrarseClick = st;
    }

    // </editor-fold>
    boolean mostrar;
    private StaticText errorEnc = new StaticText();

    public StaticText getErrorEnc() {
        return errorEnc;
    }

    public void setErrorEnc(StaticText st) {
        this.errorEnc = st;
    }
    private TextField idEnc = new TextField();

    public TextField getIdEnc() {
        return idEnc;
    }

    public void setIdEnc(TextField tf) {
        this.idEnc = tf;
    }
    private Hyperlink cerrarsesion = new Hyperlink();

    public Hyperlink getCerrarsesion() {
        return cerrarsesion;
    }

    public void setCerrarsesion(Hyperlink h) {
        this.cerrarsesion = h;
    }
    private Hyperlink regresarAdm = new Hyperlink();

    public Hyperlink getRegresarAdm() {
        return regresarAdm;
    }

    public void setRegresarAdm(Hyperlink h) {
        this.regresarAdm = h;
    }
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public FastLine() {
        mostrar=false;
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
            log("FastLine Initialization Failure", e);
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

    public String login_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case2";
    }

    public String administracion_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String quienSomos_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case4";
    }

    public String reservarPasajes_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case3";
    }

    public String iniciarSesion_action() {
        
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
       if(userName1.getText()==null || pass1.getText()==null )
            error.setText("Ambos campos son requeridos");
        else
        {
        String usuario=userName1.getText().toString();
        String pass=pass1.getText().toString();

        Conector Con=new Conector();
        Con.IniciarConexion();        
        /*Con.consultar("select pass from usuarios where idnomusu='"+usuario+"'");

        boolean esUsuario=false;
        try{
            Con.getResultSet().next();
            if(pass.compareTo(Con.getResultSet().getString("pass"))==0)
                esUsuario=true;
        }
        catch (Exception e) {
            error.setText("No se pudo hacer la consulta");
        }
        */

        //if(usuario.compareTo("itachi")==0 && pass.compareTo("itachi")==0)

        if(Con.esUsuario(usuario,pass)){
            getApplicationBean1().setNombreusuario(usuario);
            getApplicationBean1().setSesion(true);
            if(Con.esAdministrador(usuario)){
                getApplicationBean1().setCon("postgres","postgres");
                getApplicationBean1().getCon().IniciarConexion();
                getApplicationBean1().setNombreusuario(usuario);
                return "case1";
            }
            error.setVisible(false);
            mensajelogginLabel.setVisible(false);
            userLabel.setVisible(false);
            passLabel.setVisible(false);
            userName1.setVisible(false);
            pass1.setVisible(false);
            iniciarSesion.setVisible(false);
            nuevoUsuarioAqui.setVisible(false);
            registrarseClick.setVisible(false);
            userAccount.setVisible(true);
            reservarPasajes.setVisible(true);
            imageReservar.setVisible(true);
            userAccount.setText("Bienvenido "+ usuario+"@akatsuki.com" );
            reservarPasajes.setText("Reservar Pasajes");
            reservarPasajes.setVisible(true);
            cerrarsesion.setText("Cerrar Sesion");
            cerrarsesion.setVisible(true);
            getApplicationBean1().setCon(usuario,pass);
            getApplicationBean1().getCon().IniciarConexion();
        }   
        else
           error.setText("El nombre de usuario y/o password son incorrectos");
        }
        
        //if(usuario.length()==0 && pass.length()==0)
            
               
        //error.setText("errorrr");
        //System.out.print(userName1.getText());
        //error.setText(userName1.getText());
         
        return "case7";
    }

    public String nuevoUsuario_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case5";
    }

    public void userName1_processValueChange(ValueChangeEvent event) {
       /* error.setText(userName1.getText());
        System.out.print("sfsdf"); 
        System.out.print(userName1.getText());
        editor.setValue("fdsf");*/
    }

    public String verificarEncomienda_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        errorEnc.setVisible(false);
        if(idEnc.getText()==null){
            errorEnc.setText("Bebe especificar el identificador para su encomienda");
            errorEnc.setVisible(true);
            return null;
        }
        else{
            try{
                int idenc=Integer.parseInt(idEnc.getText().toString());
                getApplicationBean1().setCon("postgres", "postgres");
                //Conector Con=new Conector();
                //Con.IniciarConexion();
                getApplicationBean1().getCon().IniciarConexion();
                if(getApplicationBean1().getCon().existeEncomienda(idenc)){
                    getApplicationBean1().getCon().consultarEncomienda(idenc);
                    return "case8";
                }
                else{
                    getApplicationBean1().getCon().CerrarConexion();
                    errorEnc.setText("El identificador no figura en la Base de Datos");
                    errorEnc.setVisible(true);
                    return null;
                }
            }
            catch(Exception e){
                errorEnc.setText("El identificador no es valido");
                errorEnc.setVisible(true);
                return null;
            }

        }
        
    }

    public String cerrarsesion_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        getApplicationBean1().getCon().CerrarConexion();
        getApplicationBean1().setSesion(false);
        mostrarOcultar();
        return "case9";
    }

    public String regresarAdm_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case12";
    }
    
}

