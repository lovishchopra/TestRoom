/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.homepage;

/**
 *
 * @author Lovish Chopra
 */
public class newr {
    public String uid;
    public String name;
    public String contact;
    private String pass;
    
    public newr(String UID,String NAME,String CONTACT,String PASS)
    {
        uid=UID;
        name=NAME;
        contact=CONTACT;
        pass=PASS;
    }
    public String getPass()
    {
        return pass;
    }
}
