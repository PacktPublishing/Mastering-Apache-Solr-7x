require 'rsolr'

solr = RSolr.connect :url => 'http://localhost:8983/solr/techproducts'

response = solr.delete_by_id ['id1','id2']

solr.commit

puts response