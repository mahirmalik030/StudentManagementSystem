package test;

import static org.junit.Assert.*;

import org.junit.Test;

import service.StudentService;

public class StudentServiceTest {

    StudentService service =
            new StudentService();

    @Test
    public void testGradeA() {

        assertEquals(
                "A",
                service.calculateGrade(90));
    }

    @Test
    public void testGradeB() {

        assertEquals(
                "B",
                service.calculateGrade(75));
    }

    @Test
    public void testGradeFail() {

        assertEquals(
                "F",
                service.calculateGrade(20));
    }
}