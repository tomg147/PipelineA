/**
 *
 * @author tgord
 */

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.joda.time.DateTime;

public class StudentTest {
	private Student student1;
	private Student student2;
	private Module module1;
	private Module module2;
	private Course course1;
	
	@Before
	public void setUp() throws Exception {
		student1 = new Student("BobMarley", 22, "01-01-98", 12345678);
		student2 = new Student("KeithRichards", 21, "03-03-99", 87654321);
		module1 = new Module("Software Engineering 3", "CT417");
		module2 = new Module("Machine Learning", "CT418");
		course1 = new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-31T00:00:00Z"));
	}

	@Test
	public void testStudentUsername() {
		String username = "BobMarley22";
		String testUsername = student1.getUsername();
		assertEquals("pass",username, testUsername);
	}
	
	@Test
	public void testStudentCourse() {
		student1.setCourses(course1);
		Course testCourse =  new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-31T00:00:00Z"));
		Course course = student1.getCourse();	
		assertEquals("pass", course, testCourse);
	}

	@Test
	public void testStudentModules(){
		student1.addModules(module1);
                student1.addModules(module2);
                Module testModule1 = new Module("Software Engineering 3", "CT417");
                Module testModule2 = new Module("Machine Learning", "CT418");
		List<Module> testModules = new ArrayList<Module>();
                testModules.add(testModule1);
                testModules.add(testModule2);
		List<Module> modules= student1.getModules();
		assertEquals("pass", modules, testModules);
	}

}