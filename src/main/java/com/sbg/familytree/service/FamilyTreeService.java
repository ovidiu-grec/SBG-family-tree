/**
 * Service layer component of the family tree application. This component will end up executing on the requests received by the controller.
 */
package com.sbg.familytree.service;

import com.sbg.familytree.exception.DuplicateChildException;
import com.sbg.familytree.exception.ParentNotFoundException;
import com.sbg.familytree.model.Family;
import com.sbg.familytree.model.FamilyMember;
import com.sbg.familytree.model.Gender;
import com.sbg.familytree.model.InsertChildRequestBody;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class FamilyTreeService {
    
    private static final Logger log = LogManager.getLogger(FamilyTreeService.class);

    Family family;
    static final String SUCCESS_MESSAGE = "Child {} successfully added into the family to mother {} and father {}";

    public FamilyTreeService() {
        this.family = new Family("Matriarch", "Patriarch");
    }

    public String addChild(InsertChildRequestBody requestBody) throws ParentNotFoundException, DuplicateChildException {
        String childName = requestBody.getChildName();
        String motherName = requestBody.getMotherName();
        String fatherName = requestBody.getFatherName();
        FamilyMember currentMother = family.getMatriarch();
        FamilyMember currentFather = family.getPatriarch();

        log.info("Attempting to insert child {} to mother {} and father {}", childName, motherName, fatherName);

        Boolean foundMother = searchParent(currentMother, motherName, Gender.FEMALE, childName);
        Boolean foundFather = searchParent(currentFather, fatherName, Gender.MALE, childName);

        if (foundMother && foundFather) {
            log.info("Successfully inserted child {} to mother {} and father {}", childName, motherName, fatherName);
            return format(SUCCESS_MESSAGE, childName, motherName, fatherName);
        }
        else {
            log.info("Parents {} and {} not found for child {}", motherName, fatherName, childName);
            throw new ParentNotFoundException(childName, motherName, fatherName);
        }
    }

    private Boolean searchParent(FamilyMember currentParent, String parentName, Gender parentGender, String childName) {
        log.info("Searching for parent {} in the current family tree", parentName);
        // TODO
        return false;
    }
}
