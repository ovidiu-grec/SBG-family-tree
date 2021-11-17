/**
 * Main controller to be used by the family tree application.
 * Feature 1 POST method for inserting a new child and 4 GET methods for each retrieval operation.
 */
package com.sbg.familytree.controller;

import com.sbg.familytree.model.Family;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyTreeController {

    private static final Logger log = LogManager.getLogger(FamilyTreeController.class);

    private Family family;

    @Autowired
    public FamilyTreeController() {
        this.family = new Family("Matriarch", "Patriarch");
    }

    // TODO
    @PostMapping("/addfamilymember")
    public String addChildToFamily() {
        log.info("TEST MESSAGE");
        return "child added";
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
