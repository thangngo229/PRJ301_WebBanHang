/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author admin
 */
public class Users {    
    private String Username;
    private String Password;
    private String Address;
    private String Email;
    private String Fullname;
    private String Phone;
    private int Role;

    public Users() {
    }

    public Users(String Username, String Password, String Address, String Email, String Fullname, String Phone, int Role) {
        this.Username = Username;
        this.Password = Password;
        this.Address = Address;
        this.Email = Email;
        this.Fullname = Fullname;
        this.Phone = Phone;
        this.Role = Role;
    }
    

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "Users{" + "UserID=" + ", Username=" + Username + ", Password=" + Password + ", Address=" + Address + ", Email=" + Email + ", Fullname=" + Fullname + ", Phone=" + Phone + ", Role=" + Role + '}';
    }
    
    
            
    
}
