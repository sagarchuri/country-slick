# country-slick
Simple app using Slick 

Output->

Countries...
Filter Countries...
counrty is 100 IN India New Delhi
counrty is 101 JP Japan Tokyo
counrty is 102 NZ New Zeland Wellington
Query - countries with id >100  ---List(select "Country_ID", "CODE", "NAME", "CAPITAL" from "COUNTRY" where "Country_ID" > 100)
plain query - find JP
Vector((101,JP,Japan,Tokyo), (102,NZ,New Zeland,Wellington))
Vector(Japan)
