
package firstconncetion;

import java.util.ArrayList;

public class FirstConnection {
    
    
    public static void main(String[] args) {        //main metódus ami a programot indítja 
        DB db = new DB();                           //példányosítás
    // db.addUser("Xavér", "Szeged");                //példányhoz tartozó függvények kiírása 
    // db.addUser("Zoli", "Veszprém"); 
    // db. addUser("Emma", "Sopron");
      db.showUsersMeta();
      System.out.println();
     // db.showAllUsers();  
        ArrayList<User> users = db.getAllUsers();    // users ArrayList létrehozása, ami a db-ből kiszedi az usereket
        for (User u : users) {                       // u nevű User létrehozása, amibe beletesszük a tömböt
           System.out.println(u.getName() + " " + u.getAddress());         // az getName() metódussal kiíratjuk a tömb elemeit
        }
    }
    
}
