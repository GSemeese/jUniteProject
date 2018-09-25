/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitproject2;

/**
 *
 * @author SDOAX36
 */
public class Student extends Person{
    
    private int studentNumber;
    
    public Student(int id,int studentNumber,String name) {
        super(id,name);
        this.studentNumber = studentNumber;
    }
    
    public Student(){
        super();
        this.studentNumber = 12;
    }
   

    @Override
    public String addDetails() {
        return super.getName()+" student number : "+studentNumber; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    
    
}
