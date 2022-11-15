public class Employee {
    private String name;
    private String id;
    private String department;
    private String exLv1;
    private float salary;
    private String gender;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public float getSalary(){
        return salary;
    }

    public void setDepartment(String department){
        this.department =  department;
    }
    public String getDepartment(){
        return department;
    }

    public void setExlv1(String exLv1){

        this.exLv1= exLv1;
    }

    public String getExlv1(){
        return exLv1;
    }

    public void setGender(String gender){
        this.gender =  gender;
    }

    public String getGender(){
        return  gender;
    }

}