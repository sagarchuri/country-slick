# country-slick
Simple app using Slick 

Output-><br />
<br />
Countries...<br />
Filter Countries...<br />
counrty is 100 IN India New Delhi<br />
counrty is 101 JP Japan Tokyo<br />
counrty is 102 NZ New Zeland Wellington<br />
Query - countries with id >100  ---List(select "Country_ID", "CODE", "NAME", "CAPITAL" from "COUNTRY" where "Country_ID" > 100)<br />
plain query - find JP<br />
Vector((101,JP,Japan,Tokyo), (102,NZ,New Zeland,Wellington))<br />
Vector(Japan)
