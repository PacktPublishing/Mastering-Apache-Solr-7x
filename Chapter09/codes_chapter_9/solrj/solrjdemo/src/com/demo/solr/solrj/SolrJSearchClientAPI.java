package com.demo.solr.solrj;

import java.io.IOException;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SolrJSearchClientAPI {
  public static Logger _log = LoggerFactory.getLogger(SolrJSearchClientAPI.class);

  public static void main(String[] args){
    
    String hostURL = "http://localhost:8983/solr/techproducts";
    HttpSolrClient solr = new HttpSolrClient.Builder(hostURL).build();
    
    //set response parser
    //solr.setParser(new XMLResponseParser());
    
    //query configurations
    SolrQuery query = new SolrQuery();
    query.set("q", "ipod");
    
    query.set("fl", "id,name"); 
    /*alternate way to configure fl parameter
     * query.setFields("id","name");*/
    
    /*select different request handler
     query.setRequestHandler("/spell");*/
    
    try {
      QueryResponse response = solr.query(query);
      _log.info(response.toString());
    } catch (IOException e) {
      _log.error(e.getMessage());
    } catch (SolrServerException e) {
      _log.error(e.getMessage());
    }
  }
}