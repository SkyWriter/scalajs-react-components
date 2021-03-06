package chandu0101.scalajs.react.components
package elementalui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`

case class ButtonGroup(
    className: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[ButtonGroup](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Eui.ButtonGroup)
    f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }

}
