package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JournalEntryStub implements IJournalService{
    private List<JournalEntry> journalEntries = new ArrayList<JournalEntry>(); //Create a global ArrayList to store the entries

    /**
     * Add the current entry into the journalEntries ArrayList
     * @param journalEntry the entry to save.
     */
    @Override
    public void save(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
    }

    /**
     * Returns all Journal Entries that the program can find inside the journalEntries ArrayList.
     * @return
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;
    }
}
