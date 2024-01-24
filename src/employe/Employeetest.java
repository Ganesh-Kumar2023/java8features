package employe;

import java.util.*;

import java.util.stream.Collectors;
public class Employeetest
{

    public static List<Employeedb> assignsupervisors(Set<Employeedb> employees)
    {
    	 List<Employeedb> newEmpSet=	employees.stream().map(emp->{
         	for(int i=0;i<20;i++)
         	{
         		if(emp.getId()>1 && emp.getId()<5)
         		{
         			if(emp.getId()==1)
         			emp.setSupid(null);
         			else
         				emp.setSupid(1);
         		}
         		else if(emp.getId()>5 && emp.getId()<10)
     				emp.setSupid(5);
         		else if(emp.getId()>=10 && emp.getId()<17)
         		{
         			if(emp.getId()==12)
         			emp.setSupid(null);
         			else
         				emp.setSupid(12);	
         		}
         		else if(emp.getId()>=17 && emp.getId()<=20)
         		{
         			if(emp.getId()==18)
         			emp.setSupid(null);
         			else
         				emp.setSupid(18);	
         		}
         	}
         	return emp;
         }).collect(Collectors.toList());

    	return newEmpSet;
    }
     
    public static Double avgsalofsupervisiors(List<Employeedb> emplistwithsupid)
    {
    	Double avgsalofsupervisior=emplistwithsupid.stream().filter(emp->emp.getSupid()==null).collect(Collectors.averagingDouble(emp->emp.getSalary()));
    	return avgsalofsupervisior;
    }
    public static Double avgsalofemployes(List<Employeedb> emplistwithsupid)
    {
    	Double avgsalofemployees=emplistwithsupid.stream().filter(emp->emp.getSupid()!=null).collect(Collectors.averagingDouble(emp->emp.getSalary()));
    	return avgsalofemployees;	
    }
    public static Optional<Employeedb> minsalaryofemployee(Set<Employeedb> employees)
    {
    	Optional<Employeedb> minsalaryofemployee=employees.stream().collect(Collectors.minBy(Comparator.comparing(emp->emp.getSalary())));
    	return minsalaryofemployee;	
    }
    public static Optional<Employeedb> maxsalaryofemployee(Set<Employeedb> employees)
    {
    	Optional<Employeedb> maxsalaryofemployee=employees.stream().collect(Collectors.maxBy(Comparator.comparing(emp->emp.getSalary())));
    	return maxsalaryofemployee;	
    }
    public static void groupingby(Set<Employeedb> employees)
    {
    	Map<Object, List<Employeedb>> groupingbydept=employees.stream().collect(Collectors.groupingBy(emp->emp.getDept()));
    	groupingbydept.forEach((dept, employeeList) -> {
             System.out.println("-------"+ dept+" -------" );
             employeeList.forEach(System.out::println);
         });
    }

    public static void main(String[] args) 
    {
    	Employeedb obj=new Employeedb();
        Set<Employeedb> employees=obj.getallemployees();
        employees.forEach(emp->System.out.println(emp));
        System.out.println("--------data with supid's------------------");
        //supid's assign to the employyes
        List<Employeedb> emplistwithsupid=Employeetest.assignsupervisors(employees);
        emplistwithsupid.forEach(emp->System.out.println(emp));
        System.out.println("--------average sal of supid------------------");
        //average salary of supervisiorid
        Double avgsalofsupervisior=Employeetest.avgsalofsupervisiors(emplistwithsupid); 
        System.out.println(avgsalofsupervisior);
        System.out.println("--------average sal of employees------------------");
        //average salary of employyes
        Double avgsalofemployes=Employeetest.avgsalofemployes(emplistwithsupid);
        System.out.println(avgsalofemployes);
        System.out.println("--------min sal of employees------------------");
        //min salary of employees
        Optional<Employeedb> minsalaryofemployee=Employeetest.minsalaryofemployee(employees);
        System.out.println(minsalaryofemployee.get().getName()+"  "+minsalaryofemployee.get().getSalary());
        System.out.println("--------max sal of employee------------------");
        //max salary of employees
        Optional<Employeedb> maxsalaryofemployee=Employeetest.maxsalaryofemployee(employees);
        System.out.println(maxsalaryofemployee.get().getName()+"  "+maxsalaryofemployee.get().getSalary());
        System.out.println("--------grouping by department ------------------");
        Employeetest.groupingby(employees);
    }
    
}
