package com.bazra.usermanagement.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

import com.bazra.usermanagement.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
public class TransactionResponse {
	@JsonProperty(value = "summary", required = true)
    private List<Transaction> transaction;
	
	public List<Transaction> getTransaction() {
        return transaction;
    }
    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
   
    public TransactionResponse(List<Transaction> transaction,List<Transaction> transaction2) {
    	List<Transaction> stringArrayList = new ArrayList<Transaction>();
    	stringArrayList.addAll(transaction);
        stringArrayList.addAll(transaction2);
        
        this.transaction= stringArrayList;
        
        
    }
    public TransactionResponse(List<Transaction> transaction) {
    	List<Transaction> stringArrayList = new ArrayList<Transaction>();
    	stringArrayList.addAll(transaction);
//        stringArrayList.addAll(transaction2);
        
        this.transaction= stringArrayList;
        
        
    }

}
