require 'rsolr'

solr = RSolr.connect :url => 'http://localhost:8983/solr/techproducts'

response = solr.add(:id=>'HPPRO445', :name=>'HP Probook 445', :manu=>'Hewlett Packard', :features=>'8GB DDR3LSD RAM', :weight=>1.2, :price=>800)

solr.commit

puts response