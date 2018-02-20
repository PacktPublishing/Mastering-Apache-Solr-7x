
import pysolr

solr = pysolr.Solr('http://localhost:8983/solr/techproducts', timeout=5)

solr.add([
    {
        'id':'id1',
        'name':'product1'
    },
    {
        'id':'id2',
        'name':'product2'
    },
    {
        'id':'idn',
        'name':'productn'
    }
])
