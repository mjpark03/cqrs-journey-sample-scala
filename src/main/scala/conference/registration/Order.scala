package conference.registration

import java.util.UUID

/**
  * Created by Rachel on 2017. 10. 25..
  */
class Order {

  val Created = 0
  val Booked = 1
  val Rejected = 2
  val Confirmed = 3

  // TODO: replace String type to IEvent type
  private var events: List[String] = _

  var id: UUID = _
  var userId: UUID = _
  var conferenceId: UUID = _

  // public virtual ObservableCollection<TicketOrderLine> Lines { get; private set; }

  var state: Int = _

}
