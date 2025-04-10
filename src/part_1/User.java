/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part_1;

/**
 *
 * @author RC_Student_lab
 */
  public class User {
      private static User instance;
      private String username;
      private String password;
      
      public User() {
          
      }

    public static User getInstance() {
        if (instance == null){
            instance = new User();
        }
          return instance;
    }
    

    public void checkCredentials(String username, String password) {
        this.username = username;
          this.password = password;
    }

    void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
          
        
}
