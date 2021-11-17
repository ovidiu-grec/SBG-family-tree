/**
 * Java class for individual family members. Each family member has parents, a name and a gender.
 */
package com.sbg.familytree.model;

import java.util.HashMap;
import java.util.Map;

import com.sbg.familytree.exception.DuplicateChildException;

public class FamilyMember {

    private String name;
    private Gender gender;
    private FamilyMember mother;
    private FamilyMember father;
    private HashMap<String, FamilyMember> children;

    public FamilyMember(String name, Gender gender, FamilyMember mother, FamilyMember father) {
        this.name = name;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        this.children = new HashMap<>();
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

    public Map<String, FamilyMember> getChildren() {
        return this.children;
    }

    public void addChildren(FamilyMember child) throws DuplicateChildException {
        if (children.keySet().contains(child.getName())) {
            throw new DuplicateChildException(child.getName(), this.getName());
        }
        else {
            children.put(child.name, child);
        }
    }
}
