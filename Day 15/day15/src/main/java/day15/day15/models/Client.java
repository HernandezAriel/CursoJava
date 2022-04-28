package day15.day15.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "clients",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "dni")
        })

public class Client {
    
    @ApiModelProperty(hidden = true)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ApiModelProperty(position = 1)
    @NotBlank
    @Size(max = 20)
    @Column(name = "firstName")
    private String firstName;

    @ApiModelProperty(position = 2)
    @NotBlank
    @Size(max = 40)
    @Column(name = "lastName")
    private String lastName;

    @ApiModelProperty(position = 3)
    @NotBlank
    @Size(max = 50)
    @Column(name = "email")
    private String email;

    @ApiModelProperty(position = 4)
    @NotBlank
    @Size(max = 50)
    @Column(name = "tel")
    private double tel;

    @ApiModelProperty(position = 0)
    @NotBlank
    @Size(max = 120)
    @Column(name = "dni")
    private int dni;

    public Client(){

    }

    public Client(String firstName, String lastName, String email, double tel, int dni){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tel = tel;
        this.dni = dni;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   public String getFirstName() {
       return firstName;
   }
   
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public double getTel() {
       return tel;
   }

   public void setTel(double tel) {
       this.tel = tel;
   }

   public int getDni() {
       return dni;
   }

   public void setDni(int dni) {
       this.dni = dni;
   }
}
