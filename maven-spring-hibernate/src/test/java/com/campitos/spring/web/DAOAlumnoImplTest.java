/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.campitos.spring.web;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author T107
 */
public class DAOAlumnoImplTest {
    
    public DAOAlumnoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarAlumno method, of class DAOAlumnoImpl.
     */
    @Test
    public void testAgregarAlumno() {
        System.out.println("agregarAlumno");
        Alumno alumno = null;
        DAOAlumnoImpl instance = new DAOAlumnoImpl();
        instance.agregarAlumno(alumno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTodosAlumnos method, of class DAOAlumnoImpl.
     */
    @Test
    public void testBuscarTodosAlumnos() {
        System.out.println("buscarTodosAlumnos");
        DAOAlumnoImpl instance = new DAOAlumnoImpl();
        ArrayList<Alumno> expResult = null;
        ArrayList<Alumno> result = instance.buscarTodosAlumnos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarAlumno method, of class DAOAlumnoImpl.
     */
    @Test
    public void testBorrarAlumno() {
        System.out.println("borrarAlumno");
        Alumno p = null;
        DAOAlumnoImpl instance = new DAOAlumnoImpl();
        instance.borrarAlumno(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorId method, of class DAOAlumnoImpl.
     */
    @Test
    public void testBuscarPorId() {
        System.out.println("buscarPorId");
        int id = 0;
        DAOAlumnoImpl instance = new DAOAlumnoImpl();
        Alumno expResult = null;
        Alumno result = instance.buscarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
