import urllib.request

connection = urllib.request.urlopen('http://localhost:8983/solr/techproducts/select?q=ipod&fl=id,name&wt=python')

response = eval(connection.read())

print(response) 
