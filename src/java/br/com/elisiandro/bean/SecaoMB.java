
package br.com.elisiandro.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Elsiiandro
 */
@ManagedBean
@RequestScoped
public class SecaoMB {
    
    private SalaMB sala;
    private Date hora;
    private FilmeMB filme;
    
    public SecaoMB() {
        
        //Date hora = new Date();
        //hora.getTime()
    }
    
}
