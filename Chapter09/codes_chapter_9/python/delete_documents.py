
import pysolr

solr = pysolr.Solr("http://localhost:8983/solr/techproducts", timeout=5)

solr.delete(id=['id1','id2'])
