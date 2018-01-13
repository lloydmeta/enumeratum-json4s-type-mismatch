package foo

import enumeratum.Json4s
import enumeratum.values
import foo.resource.{Device, TrafficLight}
import org.json4s.{DefaultFormats, Formats}

object Json4sMain extends App {

  case class Child(name: String, age: Int, birthdate: Option[java.util.Date])
  case class Address(street: String, city: String)
  case class Person(
                     name: String,
                     address: Address,
                     children: List[Child],
                     `type`: TrafficLight,
                     bar: TrafficLight,
                     uniqueId: String,
                     device: Device
                   )

  implicit val formats: Formats =
    DefaultFormats +
      Json4s.serializer(TrafficLight) +
      values.Json4s.serializer(Device)

  println("doin stuff...")
}
