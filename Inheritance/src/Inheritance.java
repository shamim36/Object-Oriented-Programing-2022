public class Inheritance {
    public static void main(String[] args){
        Technology shamim = new Technology();

        shamim.setName("Md Shamim Ahamed");
        shamim.setId("213-35-775");
        shamim.setSalary(100000.00f);
        shamim.setDepartment("SWE");
        shamim.setExlv1("Java");
        shamim.setGender("Male");


        System.out.println(shamim.getName());
        System.out.println(shamim.getId());
        System.out.println(shamim.getDepartment());
        System.out.println(shamim.getSalary());
        System.out.println(shamim.getExlv1());
        System.out.println(shamim.getGender());


    }
}
