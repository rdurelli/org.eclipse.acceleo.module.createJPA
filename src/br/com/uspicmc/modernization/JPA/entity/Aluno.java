
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
@Table(name = "ALUNO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a"),
    @NamedQuery(name = "Aluno.findBylastName", query = "SELECT a FROM Aluno a WHERE a.lastName = :lastName")
,
    @NamedQuery(name = "Aluno.findByid", query = "SELECT a FROM Aluno a WHERE a.id = :id")
,
    @NamedQuery(name = "Aluno.findByname", query = "SELECT a FROM Aluno a WHERE a.name = :name")
,
    @NamedQuery(name = "Aluno.findByRA", query = "SELECT a FROM Aluno a WHERE a.RA = :RA")
})
public class Aluno implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Column(name = "lastName")
		private  String lastName;

		@Column(name = "id")
		private  Integer id; 

		@Column(name = "name")
		private  String name;

		@Column(name = "RA")
		private  String RA;

		/** 
    	* Class constructor.
    	*/
		public Aluno(){

		}

		/** 
    	* Class constructor.
    	*/
		public Aluno( String lastname, Integer id, String name, String ra){
			super();
		
			this.lastName = lastname;

			this.id = id;

			this.name = name;

			this.RA = ra;
	
		}		

		/**
		 * 
		 * @return return the lastName 
		 */
		public  String getLastName() {
			return this.lastName;
		}

		/**
		 * 
		 * @return return the id 
		 */
		public  Integer getId () {
			return this.id;
		}

		/**
		 * 
		 * @return return the name 
		 */
		public  String getName() {
			return this.name;
		}

		/**
		 * 
		 * @return return the RA 
		 */
		public  String getRA() {
			return this.RA;
		}
	

		/**
		 * 
		 * @param set the lastName
		 */
		public void setLastName( String lastName) {
			this.lastName = lastName;
		}

		/**
		 * 
		 * @param set the id
		 */
		public void setId( Integer id ) {
			this.id = id;
		}

		/**
		 * 
		 * @param set the name
		 */
		public void setName( String name) {
			this.name = name;
		}

		/**
		 * 
		 * @param set the RA
		 */
		public void setRA( String RA) {
			this.RA = RA;
		}


	@Override
    public boolean equals(Object o) {
        
		if (( this.getLastName().equals(((Aluno)o).getLastName()) == true ) && 
		 ( this.getId() == ((Aluno)o).getId() ) == true && 
		( this.getName().equals(((Aluno)o).getName()) == true ) && 
		( this.getRA().equals(((Aluno)o).getRA()) == true )) {
			
			return true;

		}
		else {

			return false;
			
		}
        
        
    }


}

