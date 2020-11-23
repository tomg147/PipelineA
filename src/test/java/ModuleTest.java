/**
 *
 * @author tgord
 */


import java.util.ArrayList;
import static org.junit.Assert.*;
import java.util.List;
import org.joda.time.DateTime;
import org.junit.*;

public class ModuleTest {
	private Student student1;
	private Student student2;
	private Module module1;
	private Course course1;
	private Course course2;

	
	
	@Before
	public void setUp() throws Exception {
		student1 = new Student("BobMarley", 22, "01-01-98", 12345678);
		student2 = new Student("KeithRichards", 21, "03-03-99", 87654321);
		module1 = new Module("Software Engineering 3", "CT417");		
		course1 = new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-31T00:00:00Z"));
		course2 = new Course("3BP", new DateTime("2015-08-01T00:00:00Z"), new DateTime("2021-07-1T00:00:00Z"));
	}
	
	@Test
	public void testModuleStudents() {
		module1.addStudents(student1);
                module1.addStudents(student2);
                Student testStudent1 = new Student("BobMarley", 22, "01-01-98", 12345678);
                Student testStudent2 = new Student("KeithRichards", 21, "03-03-99", 87654321);
		List<Student> testStudents = new ArrayList<Student>();
                testStudents.add(testStudent1);
                testStudents.add(testStudent2);
		List<Student> students= module1.getListStudents();
		assertEquals("pass", students, testStudents);
	}
	
	@Test
	public void testModuleCourses() {
		module1.addCourses(course1);
                module1.addCourses(course2);
                Course testCourse1 = new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-31T00:00:00Z"));
                Course testCourse2 = new Course("3BP", new DateTime("2015-08-01T00:00:00Z"), new DateTime("2021-07-1T00:00:00Z"));
		List<Course> testCourses = new ArrayList<Course>();
                testCourses.add(testCourse1);
                testCourses.add(testCourse2);
		List<Course> courses= module1.getListCourse();
		assertEquals("pass", courses, testCourses);
	}
}