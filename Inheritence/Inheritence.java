/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author DIU
 */
public class Inheritence {
    
    public static void main(String[] args){
         Technology rahim = new Technology();
        
        rahim.setName("Shamim");
        rahim.setDepartment("Technology");
        rahim.setSalary(4000.00f);
        
        System.out.println(rahim.getName());
        System.out.println(rahim.getDepartment());
        System.out.println(rahim.getSalary());

    }
    
}
