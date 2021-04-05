package day4_task;

public class Student {
	
	String Name;
	int standard;
	int marks;
	int dbms;
	int javascript;
	int java;
	int html;
	
	int fees=5000; 
	
	
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getDbms() {
		return dbms;
	}

	public void setDbms(int dbms) {
		this.dbms = dbms;
	}

	public int getJavascript() {
		return javascript;
	}

	public void setJavascript(int javascript) {
		this.javascript = javascript;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int calculateMarks()
	{
		marks=(java+javascript+html+dbms)/4;
		return marks;
	}
	
	/*  trigger
	 *  if student marks is less than 50 
	 *  ---->> fees += 50%
	 * */
	public int calculateFees()
	{
		if(calculateMarks()<50)
		{
			fees=(int)(0.5*fees)+fees;
		}
		return fees;
				
	}

}
