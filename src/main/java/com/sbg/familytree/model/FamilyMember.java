/**
 * Java class for individual family members. Each family member has parents, a name and a gender.
 */
package com.sbg.familytree.model;

public class FamilyMember {

    private String name;
    private Gender gender;
    private FamilyMember mother;
    private FamilyMember father;
    private FamilyMember[] children;

    public FamilyMember(String name, Gender gender, FamilyMember mother, FamilyMember father) {
        this.name = name;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return this.name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public FamilyMember getMother() {
        return this.mother;
    }

    public FamilyMember getFather() {
        return this.father;
    }

    public FamilyMember[] getChildren() {
        return this.children;
    }
}
