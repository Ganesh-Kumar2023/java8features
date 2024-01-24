package employe;

import java.util.Set;
import java.util.TreeSet;

public class Employeedb implements Comparable<Employeedb>
{
	private Integer id;
	   private String name;
	   private Double salary;
	   private Integer supid;
		private String dept;
	   public Employeedb() 
	   {
		super();
	   }
	   
	   public Employeedb(Integer id, String name, Double salary, Integer supid,String dept)
	   {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.supid = supid;
		this.dept=dept;
	   }



	    public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
         
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		public Integer getSupid() {
			return supid;
		}
		public void setSupid(Integer supid) {
			this.supid = supid;
		}
		   public String getDept() {
				return dept;
			}

			public void setDept(String dept) {
				this.dept = dept;
			}



		public  Set<Employeedb> getallemployees()
		{
			Set<Employeedb> emplist=new TreeSet<Employeedb>();
			emplist.add(new Employeedb(01,"raj",20000.00,null,"SUPERVISIOR"));
			emplist.add(new Employeedb(02,"ram",21000.00,null,"MANAGER"));
			emplist.add(new Employeedb(03,"syam",22000.00,null,"TEAMLEADR"));
			emplist.add(new Employeedb(04,"bheem",23000.00,null,"EMPLOYEE"));
			emplist.add(new Employeedb(05,"gaint",24000.00,null,"SUPERVISIOR"));
			emplist.add(new Employeedb(06,"hellow",30000.00,null,"MANAGER"));
			emplist.add(new Employeedb(07,"hai",340000.00,null,"TEAMLEADR"));
			emplist.add(new Employeedb(8,"bye",430000.00,null,"EMPLOYEE"));
			emplist.add(new Employeedb(9,"gang",230000.00,null,"EMPLOYEE"));
			emplist.add(new Employeedb(10,"laksh",10000.00,null,"MANAGER"));
			emplist.add(new Employeedb(11,"kate",45000.00,null,"TEAMLEADR"));
			emplist.add(new Employeedb(12,"juli",78000.00,null,"SUPERVISIOR"));
			emplist.add(new Employeedb(13,"kumar",67000.00,null,"TEAMLEADR"));
			emplist.add(new Employeedb(14,"ramesh",90000.00,null,"MANAGER"));
			emplist.add(new Employeedb(15,"suresh",320000.00,null,"EMPLOYEE"));
			emplist.add(new Employeedb(16,"tate",120000.00,null,"EMPLOYEE"));
			emplist.add(new Employeedb(17,"ambani",92000.00,null,"MANAGER"));
			emplist.add(new Employeedb(18,"sharukh",25000.00,null,"SUPERVISIOR"));
			emplist.add(new Employeedb(19,"khan",33000.00,null,"EMPLOYEE"));
			emplist.add(new Employeedb(20,"lanther",81000.00,null,"TEAMLEADR"));
			return emplist;
		}


		@Override
		public String toString() {
			return "Employeedb [id=" + id + ", name=" + name + ", salary=" + salary + ", supid=" + supid + ", dept="
					+ dept + "]";
		}

		@Override
		public int compareTo(Employeedb o) {
			// TODO Auto-generated method stub
			return this.getId().compareTo(o.getId());
		}

}
