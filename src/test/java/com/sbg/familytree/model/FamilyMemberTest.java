package com.sbg.familytree.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FamilyMemberTest {

    @Test
    void givenAFamily_whenANewMemberGetsAdded_thenTheMemberCanAccessItsFamily() {
        String dad = "dad";
        String mom = "mom";
        Family family = new Family(mom, dad);
        FamilyMember child = new FamilyMember("kid", Gender.MALE, family.getMatriarch(), family.getPatriarch());
        assertEquals(child.getMother().getName(), mom);
        assertEquals(child.getFather().getName(), dad);
    }
}
