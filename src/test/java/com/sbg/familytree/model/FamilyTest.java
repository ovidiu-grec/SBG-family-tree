package com.sbg.familytree.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class FamilyTest {

    @Test
    void givenAFamily_ThenMatriachAndPatriarchAreCorrectlyDefined() {
        String mom = "mom";
        String dad = "dad";
        Family family = new Family("mom", "dad");
        assertEquals(mom, family.getMatriarch().getName());
        assertEquals(dad, family.getPatriarch().getName());

        assertEquals(Gender.FEMALE, family.getMatriarch().getGender());
        assertEquals(Gender.MALE, family.getPatriarch().getGender());
    }
}
