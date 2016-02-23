package com.eguaks.fjas;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Modulus on 23/02/16.
 */
public class AnimalNameGeneratorTest {

    private NameGenerator generator;

    @Before
    public void setUp(){
        generator = new AnimalNameGenerator();
    }


    @Test
    public void generate_HasGeneratorInstance_ShouldGenerateRandomAnimalName(){
        String name = generator.generate();
        assertNotNull(name);
        assertFalse(name.isEmpty());
        assertTrue(name.length() > 5);

    }
    @Test
    public void generate_HasAmount_GenerateCorrectAmount(){
        List<String> animals = generator.generate(1000_000);
        assertNotNull(animals);
        assertEquals(1000_000, animals.size());
        for(String animal : animals){
            assertNotNull(animal);
            assertFalse(animal.isEmpty());
            assertTrue(animal.length() > 5);
        }
    }
}
