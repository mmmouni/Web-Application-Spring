package com.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CaluclaterTest {


private static final String C = null;
@BeforeAll
static void beforAll() {
	System.out.println("beforAll...");
}
@BeforeEach
public void beforEach() {
	CaluclaterTest C =new CaluclaterTest();
	System.out.println("beforeach...");
}


@ParameterizedTest
@ValueSource(ints = {10,80})
public void testAdd(int n1, int n2) {
    int actualRes = C.add(40, 50);
    int expectedRes = 90;
    System.out.println("Actual: " + actualRes + ", Expected: " + expectedRes);
    assertEquals(expectedRes, actualRes);
}

@ParameterizedTest
@ValueSource(ints = {2,5})
public void testMul(int n1, int n2) {
    int actualRes = C.mul();
    int expectedRes = 10;
    System.out.println("Actual: " + actualRes + ", Expected: " + expectedRes);
    assertEquals(expectedRes, actualRes);
}

@AfterEach
public void aftEach() {
	System.out.println("for every test resourses closeddddddddd..");
}
@AfterAll
static void afetrAll() {
	System.out.println("afterAll connection close...");
}

}
