require 'rsolr'

solr = RSolr.connect :url => 'http://localhost:8983/solr/techproducts'

response = solr.add([
	{ :id => 'id1', :name => "product1"},
	{ :id => 'id2', :name => "product2"},
	{ :id => 'idn', :name => "productn"}
	])

solr.commit

puts response
