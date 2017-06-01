import scala.concurrent.{Await, Future}
import slick.jdbc.H2Profile.api._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

/**
  * Created by SAGAR on 01/06/2017.
  */
object CountryDB  extends App{

  val countries = TableQuery[Country]

  val db = Database.forConfig("h2mem1")

  try{
    val setup = DBIO.seq(
      countries.schema.create,

      countries +=(100,"IN","India","New Delhi"),
      countries +=(101,"JP","Japan","Tokyo"),
      countries +=(102,"NZ","New Zeland","Wellington")

    )
    val setupFuture:Future[Unit] = db.run(setup)

    Await.result(setupFuture,Duration.Inf)

    println("Countries...")
    val rs = db.run(countries.result)map{_ foreach{
      case(id,code,name,capital) => println(s"counrty is $id $code $name $capital")
    }}

    println("Filter Countries...")

    val filterQuery:Query[Country,(Int,String,String,String),Seq] = countries.filter(_.id > 100)
    println("Country with code JP is---"+filterQuery.result.statements)
    val rd=db.run(filterQuery.result.map(println))

    println("plain query")

    val selectCountry = "JP"
    val plainQuery = sql"SELECT NAME FROM COUNTRY WHERE CODE =$selectCountry".as[String]
    val rp=db.run(plainQuery.map(println))

    Await.result(rp,Duration.Inf)

  }finally db.close

}
