package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.web.bind.annotation.*;

public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index() {
        JournalEntry entry = new JournalEntry();
        entry.setDate("February 22");
        entry.setNotes("This is a test Entry!");
        return "start";
    }
}
