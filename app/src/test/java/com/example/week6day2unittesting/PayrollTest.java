package com.example.week6day2unittesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PayrollTest {
    CalculatePayroll calculatePayroll;
    Employee employee;

    @Mock
    Name theName;
    @Mock
    Address theAddress;
    @Mock
    TimeSheet timeSheet;

    @Before
    public void setup(){
        Mockito.when(theName.getFirstName()).thenReturn("Ricky");
        Mockito.when(theName.getMiddleName()).thenReturn("Enrique");
        Mockito.when(theName.getLastname()).thenReturn("Bojorquez");
        Mockito.when(theName.getNamePrefix()).thenReturn("Dr");
        Mockito.when(theAddress.getStreet()).thenReturn("1500 Montwood");
        Mockito.when(theAddress.getCity()).thenReturn("Marietta");
        Mockito.when(theAddress.getState()).thenReturn("Ga");
        Mockito.when(theAddress.getPostal()).thenReturn("30067");
        Mockito.when(theAddress.getCountry()).thenReturn("USA");
        Mockito.when(timeSheet.getHoursWorked()).thenReturn((float)40.00);
        Mockito.when(timeSheet.getPayrate()).thenReturn((float)7.00);
        Mockito.when(timeSheet.isHourly()).thenReturn(true);



        employee = new Employee(theName, theAddress, timeSheet);
        calculatePayroll = new CalculatePayroll(employee);
    }

    @Test
    public void testAutoInfo(){
        //Mockito.when(mockAutoInfo.getMake()).thenReturn("BMW");
        assertEquals("Ricky", calculatePayroll.getEmployee().getFullName().getFirstName());
        //assertEquals(2, 1+1);
        //Mockito.verify(mockAutoInfo, Mockito.times(1)).getMake();
        //PowerMockito.verifyStatic();
    }

    @Test
    public void testHashMap(){
        HashMap<String, String> testMap = calculatePayroll.toHashMap();
        assertEquals("280.0", testMap.get("pay"));
    }
}
