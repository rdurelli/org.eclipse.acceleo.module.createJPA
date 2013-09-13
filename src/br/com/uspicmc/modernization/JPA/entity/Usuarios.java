
package br.com.uspicmc.modernization.JPA.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Rafael Durelli
 * @version v1
 */
@Entity
@Table(name = "USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT a FROM Usuarios a"),
    @NamedQuery(name = "Usuarios.findByusuario", query = "SELECT a FROM Usuarios a WHERE a.usuario = :usuario")
,
    @NamedQuery(name = "Usuarios.findByemail", query = "SELECT a FROM Usuarios a WHERE a.email = :email")
})
public class Usuarios implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Column(name = "usuario")
		private 

		@Column(name = "email")
		private 

		/** 
    	* Class constructor.
    	*/
		public Usuarios(){

		}

		/** 
    	* Class constructor.
    	*/
		public Usuarios(,){
			super();
		
			this.usuario = usuario;

			this.email = email;
	
		}		

		/**
		 * 
		 * @return return the usuario 
		 */
		public  {
			return this.usuario;
		}

		/**
		 * 
		 * @return return the email 
		 */
		public  {
			return this.email;
		}
	

		/**
		 * 
		 * @param set the usuario
		 */
		public void setUsuario() {
			this.usuario = usuario;
		}

		/**
		 * 
		 * @param set the email
		 */
		public void setEmail() {
			this.email = email;
		}


	@Override
    public boolean equals(Object o) {
        
		if ( && 
		) {
			
			return true;

		}
		else {

			return false;
			
		}
        
        
    }


}

