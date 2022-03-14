package assessment.demo;
public class EmpApp {
	
	public EmpApp() {

	}
	public String findEmp(int empId) {
		if (EmpDb.db.containsKey(empId)) {
			return EmpDb.db.get(empId).getDetails();
		}

		else {
			return "No employee found";
		}
	}

	public static void main(String[] args) {
		EmpApp app = new EmpApp();
		System.out.println(app.findEmp(103));
		
	}

}
