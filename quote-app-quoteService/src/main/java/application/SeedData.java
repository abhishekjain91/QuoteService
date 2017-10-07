package application;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import application.model.Author;
import application.model.QuoteModel;
//import application.service.AuthorService;
import application.service.QuoteService;

@Configuration
public class SeedData {
   
    @Autowired
    private QuoteService quoteService;
    private static final Logger log = LoggerFactory.getLogger(SeedData.class);
    @Bean
    public SeedData getBean() throws SQLException {
         QuoteModel q1 = new QuoteModel(
                "The world is a thing of utter inordinate complexity and richness " +
                "and strangeness that is absolutely awesome",
                "https://en.wikiquote.org/wiki/Douglas_Adams", 
                1L);
        
        QuoteModel q2 = new QuoteModel(
                "As rain breaks through an ill-thatched house, passion will break through an unreflecting mind.", 
                "https://en.wikiquote.org/wiki/Gautama_Buddha", 
                2L);
        
        QuoteModel q3 = new QuoteModel(
                "I think that only daring speculation can lead us further and not accumulation of facts.", 
                "https://en.wikiquote.org/wiki/Albert_Einstein", 
                3L);
        
        //Added new quote for the existing authors
        QuoteModel q4 = new QuoteModel(
                "Imagination is more important than knowledge.", 
                "https://en.wikiquote.org/wiki/Albert_Einstein", 
                3L);
        
        //Added new quote for the existing authors
        QuoteModel q5 = new QuoteModel(
                "The mind is everything. What you think you become.", 
                "https://en.wikiquote.org/wiki/Gautama_Buddha",  
                2L);
        
        quoteService.save(q1);
        quoteService.save(q2);
        quoteService.save(q3);
        // Add the quotes to the quote service 
        quoteService.save(q4);
        quoteService.save(q5);
        
        return new SeedData();
    }
}
