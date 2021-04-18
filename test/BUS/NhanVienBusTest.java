/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.NhanVienDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anhanpro2k
 */
public class NhanVienBusTest {

    public NhanVienBusTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getList method, of class NhanVienBus.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        NhanVienBus instance = new NhanVienBus();
        instance.getList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNV method, of class NhanVienBus.
     */
    @Test
    public void testAddNV() {
        System.out.println("addNV");
        NhanVienDTO nv = null;
        NhanVienBus instance = new NhanVienBus();
        instance.addNV(nv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
