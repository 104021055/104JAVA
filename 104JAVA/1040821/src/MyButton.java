import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MyButton extends JButton {

        private Color hoverBackgroundColor;
        private Color pressedBackgroundColor;

        public MyButton() {
            this(null);
        }

        public MyButton(String text) {
            super(text);
            super.setContentAreaFilled(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) {
                g.setColor(pressedBackgroundColor);
            } else if (getModel().isRollover()) {
                g.setColor(hoverBackgroundColor);
            } else {
                g.setColor(getBackground());
            }
            g.fillRect(0, 0, getWidth(), getHeight());
            super.paintComponent(g);
        }

        @Override
        public void setContentAreaFilled(boolean b) {
        }

        public Color getHoverBackgroundColor() {
            return hoverBackgroundColor;
        }

        public void setHoverBackgroundColor(Color hoverBackgroundColor) {
            this.hoverBackgroundColor = hoverBackgroundColor;
        }

        public Color getPressedBackgroundColor() {
            return pressedBackgroundColor;
        }

        public void setPressedBackgroundColor(Color pressedBackgroundColor) {
            this.pressedBackgroundColor = pressedBackgroundColor;
        }

    protected void createAndShowGUI() {
        JFrame frame = new JFrame("Test button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final MyButton btnSave = new MyButton("Save");
        btnSave.setForeground(Color.black);
        btnSave.setHorizontalTextPosition(SwingConstants.CENTER);
        btnSave.setBorder(null);
        btnSave.setBackground(Color.black);
        btnSave.setHoverBackgroundColor(Color.black);
        btnSave.setPressedBackgroundColor(Color.black);
        frame.add(btnSave);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    /*public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestButton().createAndShowGUI();
            }
        });
    }*/

}
