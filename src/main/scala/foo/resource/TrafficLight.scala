package foo.resource

import enumeratum._

sealed trait TrafficLight extends EnumEntry
object TrafficLight extends Enum[TrafficLight] /* nothing extra here */ {
  case object Red    extends TrafficLight
  case object Yellow extends TrafficLight
  case object Green  extends TrafficLight

  val values = findValues
}
