package tests;

import org.junit.Before;
import org.junit.Test;
import projectCar.CarService;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class CarServiceTest {
    private CarService carService;

    @Before
    public void setUp() throws IOException {
        carService = new CarService("JavaCars.txt");
    }

    @Test
    public void testGetUniqueBrands() {
        Set<String> uniqueBrands = carService.getUniqueBrands();
        assertNotNull(uniqueBrands);
        assertFalse(uniqueBrands.isEmpty());
    }

    @Test
    public void testGetModelsByBrand() {
        List<String> toyotaModels = carService.getModelsByBrand("Toyota");
        assertNotNull(toyotaModels);
        assertFalse(toyotaModels.isEmpty());
        assertTrue(toyotaModels.contains("Camry"));
    }

    @Test
    public void testGroupByBrand() {
        Map<String, Integer> brandCounts = carService.groupByBrand();
        assertNotNull(brandCounts);
        assertFalse(brandCounts.isEmpty());
    }
}
