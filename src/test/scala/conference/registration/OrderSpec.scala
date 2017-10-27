package conference.registration

import org.scalatest._

/**
  * Created by Rachel on 2017. 10. 25..
  */
class OrderSpec extends FunSuite with BeforeAndAfter {

  var order: Order = _

  before {
    order = new Order
  }

  test("markAsBooked should throw exception if state is not created") {
    order.state = order.Confirmed
    intercept[IllegalStateException] {
      order.markAsBooked
    }
  }

  test("markAsBooked should change state to booked") {
    order.state = order.Created
    order.markAsBooked
    assert(order.state == order.Booked)
  }

  test("reject should throw exception if state is not created") {
    order.state = order.Rejected
    intercept[IllegalStateException] {
      order.reject
    }
  }

  test("reject should change state to rejected") {
    order.state = order.Created
    order.reject
    assert(order.state == order.Rejected)
  }

}
