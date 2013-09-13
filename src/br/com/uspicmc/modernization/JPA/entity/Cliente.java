
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
@Table(name = "CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT a FROM Cliente a"),
    @NamedQuery(name = "Cliente.findByusuario2", query = "SELECT a FROM Cliente a WHERE a.usuario2 = :usuario2")
,
    @NamedQuery(name = "Cliente.findByusuario", query = "SELECT a FROM Cliente a WHERE a.usuario = :usuario")
,
    @NamedQuery(name = "Cliente.findByusuario3", query = "SELECT a FROM Cliente a WHERE a.usuario3 = :usuario3")
,
    @NamedQuery(name = "Cliente.findByusuario500", query = "SELECT a FROM Cliente a WHERE a.usuario500 = :usuario500")
})
public class Cliente implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Column(name = "usuario2")
		private 

		@Column(name = "usuario")
		private 

		@Column(name = "usuario3")
		private 

		@Column(name = "usuario500")
		private 

		/** 
    	* Class constructor.
    	*/
		public Cliente(){

		}

		/** 
    	* Class constructor.
    	*/
		public Cliente(,,,){
			super();
		
			this.usuario2 = usuario2;

			this.usuario = usuario;

			this.usuario3 = usuario3;

			this.usuario500 = usuario500;
	
		}		

		/**
		 * 
		 * @return return the usuario2 
		 */
		public  {
			return this.usuario2;
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
		 * @return return the usuario3 
		 */
		public  {
			return this.usuario3;
		}

		/**
		 * 
		 * @return return the usuario500 
		 */
		public  {
			return this.usuario500;
		}
	

		/**
		 * 
		 * @param set the usuario2
		 */
		public void setUsuario2() {
			this.usuario2 = usuario2;
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
		 * @param set the usuario3
		 */
		public void setUsuario3() {
			this.usuario3 = usuario3;
		}

		/**
		 * 
		 * @param set the usuario500
		 */
		public void setUsuario500() {
			this.usuario500 = usuario500;
		}


	@Override
    public boolean equals(Object o) {
        
		if ( && 
		 && 
		 && 
		) {
			
			return true;

		}
		else {

			return false;
			
		}
        
        
    }


}

