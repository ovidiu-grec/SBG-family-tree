/**
 * Main controller to be used by the family tree application.
 * Feature 1 POST method for inserting a new child and 4 GET methods for each retrieval operation.
 */
package com.sbg.familytree.controller;

import com.sbg.familytree.exception.DuplicateChildException;
import com.sbg.familytree.exception.ParentNotFoundException;
import com.sbg.familytree.model.InsertChildRequestBody;
import com.sbg.familytree.service.FamilyTreeService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyTreeController {

    private static final Logger log = LogManager.getLogger(FamilyTreeController.class);

    FamilyTreeService familyTreeService;

    @Autowired
    public FamilyTreeController() {
        this.familyTreeService = new FamilyTreeService();

        log.info("Family Initialization Successful.");
    }

    @PostMapping("/addfamilymember")
    public ResponseEntity<String> addChildToFamily(@RequestBody InsertChildRequestBody body) {
        try {
            String successMessage = familyTreeService.addChild(body);
            return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
        }
        catch (DuplicateChildException | ParentNotFoundException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    // TODO
    @GetMapping("/retrieve/parents")
    public String getParents() {
        return "parents";
    }

    // TODO
    @GetMapping("/retrieve/children")
    public String getChildren() {
        return "children";
    }

    // TODO
    @GetMapping("/retrieve/descendants")
    public String getDescendants() {
        return "descendants";
    }

    // TODO
    @GetMapping("/retrieve/ancestors")
    public String getAncestors() {
        return "ancestors";
    }
}
