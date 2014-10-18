import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.JButton

/**
 * Created by Jose on 10/18/2014.
 */
package object dcc {
  def button(label: String)(eventHandler: ActionEvent => Unit) = new JButton(label) {
    addActionListener(new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = eventHandler(e)
    })
  }
}
