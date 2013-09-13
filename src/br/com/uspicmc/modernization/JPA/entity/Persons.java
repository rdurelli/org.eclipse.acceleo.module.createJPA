
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
@Table(name = "PERSONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persons.findAll", query = "SELECT a FROM Persons a"),
    @NamedQuery(name = "Persons.findByusuario3", query = "SELECT a FROM Persons a WHERE a.usuario3 = :usuario3")
,
    @NamedQuery(name = "Persons.findByusuario2", query = "SELECT a FROM Persons a WHERE a.usuario2 = :usuario2")
,
    @NamedQuery(name = "Persons.findByusuario", query = "SELECT a FROM Persons a WHERE a.usuario = :usuario")
})
public class Persons implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Column(name = "usuario3")
		private 

		@Column(name = "usuario2")
		private 

		@Column(name = "usuario")
		private 

		/** 
    	* Class constructor.
    	*/
		public Persons(){

		}

		/** 
    	* Class constructor.
    	*/
		public Persons(,,){
			super();
		
			this.usuario3 = usuario3;

			this.usuario2 = usuario2;

			this.usuario = usuario;
	
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
		 * @param set the usuario3
		 */
		public void setUsuario3() {
			this.usuario3 = usuario3;
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


	@Override
    public boolean equals(Object o) {
        
		if ( && 
		 && 
		) {
			
			return true;

		}
		else {

			return false;
			
		}
        
        
    }


}

