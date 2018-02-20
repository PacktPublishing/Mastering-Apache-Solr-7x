
import pysolr

solr = pysolr.Solr('http://localhost:8983/solr/techproducts', timeout=5)

solr.add([
    {
        'id':'HPPRO445',
        'name':'HP Probook 445',
        'manu':'Hewlett Packard',
        'features':'8GB DDR3LSD RAM',
        'weight':1.2,
        'price':800
    }
])
