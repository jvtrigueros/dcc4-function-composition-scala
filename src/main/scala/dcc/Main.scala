package dcc

import java.awt.{BorderLayout, GridLayout}
import javax.swing.{JLabel, JPanel, JFrame}

/**
 * Created by Jose on 10/18/2014.
*/
object Main extends App {
  val frame = new JFrame("Function Composition") {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  }

  val panel = new JPanel(new BorderLayout()) {
    val voteCount = new JLabel("0")
    def currentCount = Integer.parseInt(voteCount.getText)

    val yesButton = dcc.button("Yes") { event =>
      val count: String = (currentCount + 1).toString
      println(count)
      voteCount.setText(count)
    }

    val noButton = dcc.button("No") { event =>
      voteCount.setText((currentCount - 1).toString)
    }

    val buttonPanel = new JPanel(new GridLayout(1, 2)) {
      add(yesButton)
      add(noButton)
    }

    add(voteCount, BorderLayout.CENTER)
    add(buttonPanel, BorderLayout.SOUTH)
  }

  frame.setContentPane(panel)
  frame.pack()
  frame.setLocationRelativeTo(null)
  frame.setVisible(true)
}
