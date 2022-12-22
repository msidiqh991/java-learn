class Manager extends Employee {
    protected String department = "FTI";
    public String getDetails(){
        return "Nama Karyawan : " + name +
                "\nSalary : " + salary +
                "\nManager of : " + department;
    }
}