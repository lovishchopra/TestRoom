/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.homepage;

/**
 *
 * @author lovish
 */
public class question {
    public String que;
    public String A,B,C,D;
    public int marks;
    private String correct;
    
    public question(String Q, String a, String b, String c, String d, String Correct, int m)
    {
        que=Q;
        A=a;
        B=b;
        C=c;
        D=d;
        marks=m;
        correct=Correct;
    }
    public String getCorrect() {
        return correct;
    }
    public void setCorrect(String CORRECT)
    {
        correct=CORRECT;
    }
}
