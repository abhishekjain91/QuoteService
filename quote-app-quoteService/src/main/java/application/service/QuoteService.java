package application.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import application.model.QuoteModel;

public interface QuoteService extends CrudRepository<QuoteModel, Long>, QuoteServiceCustom {
	
}
