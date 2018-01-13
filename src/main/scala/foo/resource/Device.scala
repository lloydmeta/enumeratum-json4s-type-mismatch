package foo.resource

import enumeratum.values._

sealed abstract class Device(val value: Short) extends ShortEnumEntry
case object Device extends ShortEnum[Device] {
  case object Phone   extends Device(1)
  case object Laptop  extends Device(2)
  case object Desktop extends Device(3)
  case object Tablet  extends Device(4)

  val values = findValues
}
