/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fastline;

import com.sun.jsfcl.app.AbstractApplicationBean;
/**
 *
 * @author Rene
 */
public class ConseguirDatosbase  extends AbstractApplicationBean{
   
    private void _init() throws Exception {
    }
   
    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public ConseguirDatosbase() {
    }

 
   
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    public  ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

}
