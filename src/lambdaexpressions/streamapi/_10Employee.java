package lambdaexpressions.streamapi;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _10Employee {

	Integer eId;
	String eNmae;
	Double eSalary;
	String eRole;

	private static TreeSet<_10Employee> employees;
	public _10Employee(Integer eId, String eNmae, Double eSalary, String eRole) {
		super();
		this.eId = eId;
		this.eNmae = eNmae;
		this.eSalary = eSalary;
		this.eRole = eRole;
	}


	public Integer geteId() {
		return eId;
	}


	public void seteId(Integer eId) {
		this.eId = eId;
	}


	public String geteNmae() {
		return eNmae;
	}


	public void seteNmae(String eNmae) {
		this.eNmae = eNmae;
	}


	public Double geteSalary() {
		return eSalary;
	}


	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}


	public String geteRole() {
		return eRole;
	}


	public void seteRole(String eRole) {
		this.eRole = eRole;
	}




	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eNmae=" + eNmae + ", eSalary=" + eSalary + ", eRole=" + eRole + "]";
	}


	public static void main(String[] args) {

		employees = new TreeSet<_10Employee>((e1,e2)-> e1.geteId().compareTo(e2.geteId()));

		employees.add(new _10Employee(1, "sk", 5000.20, "javadeveloper"));
		employees.add(new _10Employee(2, "shadab khan", 5000.20, "javadeveloper"));
		employees.add(new _10Employee(3, "bk", 3000.20, "merndeveloper"));
		employees.add(new _10Employee(4, "ck", 500.20, "pythondeveloper"));


		//		employees.forEach(System.out::println);

		Set<_10Employee> collect = employees.stream().filter(e-> e.geteSalary()>3000 && e.geteSalary()<5000).collect(Collectors.toSet());
		//		System.out.println(collect);

		//max salarray employee or max sal 
		_10Employee maxsal = employees.stream().max((e1,e2)->e1.geteSalary().compareTo(e2.geteSalary())).orElse(null);

		System.out.println("max salary"+maxsal.geteSalary());

		//min salarray employee or min sal 
		_10Employee orElse2 = employees.stream().min((e1,e2)->e1.geteSalary().compareTo(e2.geteSalary())).orElse(null);
		System.out.println(orElse2);


		Set<_10Employee> collect2 = employees.stream().sorted((e1,e2)->e1.geteNmae().compareTo(e2.geteNmae())).collect(Collectors.toSet());
		//		System.out.println(collect2);

// comapre or sort  employye based on employye name 
		employees.stream().sorted(Comparator.comparing(_10Employee::geteNmae)).forEach(System.out::println);

		//		comparing based on salary then comparing based on name 

		employees.stream().sorted(Comparator.comparing(_10Employee::geteSalary).thenComparing(_10Employee::geteNmae)).forEach(System.out::println);

		Map<String, List<_10Employee>> dept=employees.stream().collect(Collectors.groupingBy(_10Employee::geteRole));

		dept.forEach((k,v)->{
			System.out.println(k+":");
			v.forEach(System.out::println);
		});
	}

}


