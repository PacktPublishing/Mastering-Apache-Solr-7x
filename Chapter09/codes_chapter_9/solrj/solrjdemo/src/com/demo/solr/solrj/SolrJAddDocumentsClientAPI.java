package com.demo.solr.solrj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SolrJAddDocumentsClientAPI {
	
	public static Logger _log = LoggerFactory.getLogger(SolrJAddDocumentsClientAPI.class);
	
	public static void main(String[] args) {
		
		String hostURL = "http://localhost:8983/solr/techproducts";
		HttpSolrClient solr = new HttpSolrClient.Builder(hostURL).build();
		
		List<SolrInputDocument> documentList = new ArrayList<SolrInputDocument>();
	    
	    SolrInputDocument document1 = new SolrInputDocument();
	    document1.addField("id","id1");
	    document1.addField("name","product1");
	    documentList.add(document1);
	    
	    SolrInputDocument document2 = new SolrInputDocument();
	    document2.addField("id","id2");
	    document2.addField("name","product2");
	    documentList.add(document2);
	    
	    //...
	    //...
	    
	    SolrInputDocument documentn = new SolrInputDocument();
	    documentn.addField("id","idn");
	    documentn.addField("name","productn");
	    documentList.add(documentn);
	    
	    try {
	    	UpdateResponse response = solr.add(documentList);
	        solr.commit();
	        _log.info(response.toString());
	    } catch (SolrServerException e) {
	      _log.error(e.getMessage());
	    } catch (IOException e) {
	      _log.error(e.getMessage());
	    }
	}
}
