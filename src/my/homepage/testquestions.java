/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.homepage;

import java.util.ArrayList;

/**
 *
 * @author lovish
 */
public class testquestions {
    public ArrayList<question> qset;
    int marks;
    
    public testquestions()
        {
            qset=new ArrayList<question>();
            marks=0;
        }
   
    public void addquestion(question q)
        {
            qset.add(q);
            marks=marks+q.marks;
        }
}
