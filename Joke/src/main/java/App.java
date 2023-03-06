import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class App implements ActionListener {
    private JFrame frame;
    private JPanel jokePanel;
    private JLabel setup;
    private JLabel delivery;
    CustomHTTPClient client = new CustomHTTPClient();

    App() throws IOException {

        frame = new JFrame();

        JButton submit = new JButton("Tell me a Joke!");
        submit.addActionListener(this);
        setup = new JLabel("Empty");
        delivery = new JLabel("Also empty");

        jokePanel = new JPanel(new GridLayout(0,1));
        jokePanel.setBorder(BorderFactory.createEmptyBorder(500, 500, 500, 500));
        jokePanel.add(setup);
        jokePanel.add(delivery);
        jokePanel.add(submit);
        jokePanel.setBackground(Color.CYAN);

        frame.add(jokePanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Joke Of The Day!");
        frame.pack();

        frame.setVisible(true);
    }

    public JokeDTO formatJoke(String jsonString) throws JsonProcessingException {
      ObjectMapper objectMapper = new ObjectMapper();

      JokeDTO joke = objectMapper.readValue(jsonString, JokeDTO.class);

      return joke;
    }

    public String getJoke(String URL) throws IOException {
        CustomHTTPClient client = new CustomHTTPClient();

        return client.sendGET(URL);
    }

    @Override
    public void actionPerformed(ActionEvent clicked) {
        try{
            JokeDTO dto = formatJoke(getJoke(client.URL));
            setup.setText(dto.getSetup());
            delivery.setText(dto.getDelivery());
        }catch(IOException error){
            error.printStackTrace();
        }

    }
}
