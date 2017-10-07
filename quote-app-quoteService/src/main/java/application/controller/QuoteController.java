package application.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import application.model.Author;
import application.model.QuoteModel;
//import application.service.AuthorService;
import application.service.QuoteService;

@RestController
public class QuoteController {
    
    @Autowired
    private QuoteService quoteService;
   
    // Return random quote
    @RequestMapping("/api/quote/random")
    public QuoteModel random() {
        return quoteService.randomQuote();
    }
    
    // Add quote to existing quotes, the new quote is not saved
    @RequestMapping(value = "/api/addquote", method = RequestMethod.POST)
    public void saveQuote(@RequestBody QuoteModel quote) {
        System.out.println(quote);
        System.out.println("Saving quote");
        quoteService.save(quote);
    }
    
    // fetch quotes of one particular author
    @RequestMapping(value = "/api/quote/{authorID}")
    public List<QuoteModel> getQuotes(@PathVariable Long authorID){
    	List<QuoteModel> quotes = new ArrayList<QuoteModel>();
    	// Find all quotes and add it to a list
    	for (QuoteModel quote: this.quoteService.findAll() ) {
            if (quote.getAuthorID().equals(authorID)) {
            	quotes.add(quote);
            }
        }
    	return quotes;
    }
    
}
