package application.service;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import application.model.QuoteModel;


public class QuoteServiceImpl implements QuoteServiceCustom {

    Random random = new Random();
    
    @Autowired
    private QuoteService quoteService;
    
    @Override
    public QuoteModel randomQuote() {
        ArrayList<QuoteModel> quotes = new ArrayList<QuoteModel>();
        
        for (QuoteModel q: this.quoteService.findAll() ) {
            quotes.add(q);
        }
        QuoteModel q = quotes.get(random.nextInt(quotes.size()));
        return q;
    }

}
