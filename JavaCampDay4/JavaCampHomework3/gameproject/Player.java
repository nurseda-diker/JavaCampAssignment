
package gameproject;

public class Player {
    private String tcNo;
    private String firstName;
    private String lastName;
    private String dateofBirth;

    public Player(){
        
    }
    public Player(String tcNo,String firstName,String lastName,String dateofBirth){
        this.tcNo=tcNo;
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateofBirth=dateofBirth;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
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

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    
    









}
