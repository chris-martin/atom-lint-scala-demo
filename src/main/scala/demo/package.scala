import akka.actor.{ActorSystem}

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt

package object demo {
  val actorSystem = ActorSystem()
  actorSystem.terminate()
  Await.result(actorSystem.whenTerminated, 30.seconds)
}
