package firstconncetion;

//Plain Old Java Object
public class User {
    
    private String name;                    //enkapszuláció 
    private String address;
    
    public User(String name, String address) {//konstruktor, ami nevet és címet kér 
        this.name = name;   
        this.address = address;        
    }
    
    public User() {                         //alap konstuktor, amit muszáj létrehozni
        
    }

    public String getName() {               //getter Name
        return name;
    }

    public void setName(String name) {      //setter Name
        this.name = name;
    }

    public String getAddress() {            //getter Addresss
        return address;
    }

    public void setAddress(String address) {//setter Address
        this.address = address;
    }
    
    
    
}
