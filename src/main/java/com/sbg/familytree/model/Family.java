/**
 * Java Bean that holds the family matriarch and patriarch and define the start of the family.
 */
package com.sbg.familytree.model;

public class Family {

    private FamilyMember matriarch;
    private FamilyMember patriarch;

    public Family(String matriarch, String patriarch) {
        this.matriarch = new FamilyMember(matriarch, Gender.FEMALE, null, null);
        this.patriarch = new FamilyMember(patriarch, Gender.MALE, null, null);
    }

    public FamilyMember getMatriarch() {
        return this.matriarch;
    }

    public FamilyMember getPatriarch() {
        return this.patriarch;
    }
}