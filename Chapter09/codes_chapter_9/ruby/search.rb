require 'rsolr'

solr = RSolr.connect :url => 'http://localhost:8983/solr/techproducts'

response = solr.get 'select', :params => {:q => 'ipod',:fl=>'id,name',:wt=>:ruby}

puts response