package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		
		Automation tool= new Automation();
		tool.python();
		tool.Java();
		tool.ruby();
		tool.Selenium();
	}

	public void Selenium() {
		//System.out.println("i love selenium");
		
	}

	public void Java() {
		//System.out.println("i like java");
		
	}

	@Override
	public void ruby() {
		//System.out.println("i like ruby");
		
	}

}
