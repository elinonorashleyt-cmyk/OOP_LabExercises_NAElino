import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ArithmeticGamePanel extends JFrame implements ActionListener {

    private JLabel questionLabel, scoreLabel, messageLabel;
    private JTextField answerField;
    private JButton submitButton, nextButton, restartButton;
    private int num1, num2, correctAnswer, score = 0, totalQuestions = 0;
    private char operator;
    private final Random random = new Random();

    public ArithmeticGamePanel() {
        setTitle("Arithmetic Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // 🔹 Top Panel – shows the question
        JPanel topPanel = new JPanel();
        questionLabel = new JLabel("Press 'Next' to start!");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        topPanel.add(questionLabel);

        // 🔹 Middle Panel – input and buttons
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(2, 2, 10, 10));

        answerField = new JTextField();
        answerField.setFont(new Font("Arial", Font.PLAIN, 18));

        submitButton = new JButton("Submit");
        nextButton = new JButton("Next");
        restartButton = new JButton("Restart");

        submitButton.addActionListener(this);
        nextButton.addActionListener(this);
        restartButton.addActionListener(this);

        middlePanel.add(new JLabel("Your Answer:", SwingConstants.CENTER));
        middlePanel.add(answerField);
        middlePanel.add(submitButton);
        middlePanel.add(nextButton);

        // 🔹 Bottom Panel – score and messages
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1));

        scoreLabel = new JLabel("Score: 0/0", SwingConstants.CENTER);
        messageLabel = new JLabel("", SwingConstants.CENTER);

        bottomPanel.add(scoreLabel);
        bottomPanel.add(messageLabel);

        // 🔹 Add panels to frame
        add(topPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        add(restartButton, BorderLayout.EAST);

        setVisible(true);
    }

    private void generateQuestion() {
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        int op = random.nextInt(4);

        switch (op) {
            case 0 -> { operator = '+'; correctAnswer = num1 + num2; }
            case 1 -> { operator = '-'; correctAnswer = num1 - num2; }
            case 2 -> { operator = '×'; correctAnswer = num1 * num2; }
            case 3 -> { operator = '÷'; num1 = num1 * num2; correctAnswer = num1 / num2; }
        }

        questionLabel.setText("What is " + num1 + " " + operator + " " + num2 + "?");
        messageLabel.setText("");
        answerField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            generateQuestion();
        } else if (e.getSource() == submitButton) {
            try {
                int userAnswer = Integer.parseInt(answerField.getText());
                totalQuestions++;
                if (userAnswer == correctAnswer) {
                    score++;
                    messageLabel.setText("✅ Correct!");
                } else {
                    messageLabel.setText("❌ Wrong! Correct: " + correctAnswer);
                }
                scoreLabel.setText("Score: " + score + "/" + totalQuestions);
            } catch (NumberFormatException ex) {
                messageLabel.setText("Please enter a number!");
            }
        } else if (e.getSource() == restartButton) {
            score = 0;
            totalQuestions = 0;
            questionLabel.setText("Press 'Next' to start!");
            messageLabel.setText("");
            scoreLabel.setText("Score: 0/0");
            answerField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ArithmeticGamePanel::new);
    }
}