import slick.jdbc.H2Profile.api._

/**
  * Created by SAGAR on 01/06/2017.
  */

class Country(tag: Tag)
    extends Table[(Int,String,String,String)](tag, "COUNTRY" ){
    def id =column[Int]("Country_ID",O.PrimaryKey)
    def code = column[String]("CODE")
    def name = column[String]("NAME")
    def capital = column[String]("CAPITAL")
    def * =(id,code,name,capital)
  }



