package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

/**
 * Use Lombok to create Java Beans for the necessary objects
 */
public @Data
class JournalEntry {
    private String notes;
    private String date;
}
