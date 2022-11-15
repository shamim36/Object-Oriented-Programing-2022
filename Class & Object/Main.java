public class Main {
    public static void main(String[]args){
        Student st = new Student();
        st.address = "Dhaka";
        st.name = "Md Shamim Ahamed";
        st.dob = "08 Aug 2003";
        st.semester = 4;
        st.id = "213-35-775";
        st.cgpa = 3.75f;
        st.display();
        System.out.println(st.Studying("OOP with java","BLC","Secret"));
    }
}